package cn.com.sinosoft.tbf.common.security;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import cn.com.sinosoft.tbf.util.UserService;

/**
 * 自定义认证
 *
 * @author <a href="mainto:nytclizy@gmail.com">lizhiyong</a>
 * @since 2016年8月9日
 */
@Component
public class AuthenticationProviderCustom implements AuthenticationProvider {

	@Autowired
	private UserService userServcie;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// 用户名
		String userName = authentication.getName();
		// 密码
		String passWord = String.valueOf(authentication.getCredentials());
		// 验证
		if (userServcie.validUser(userName, passWord)) {
			// 授权
			Collection<? extends GrantedAuthority> authorities = null;
			return new UsernamePasswordAuthenticationToken(userName, passWord, authorities);
		} else {
			throw new BadCredentialsException("用户名或者密码不存在");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}