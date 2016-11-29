package cn.com.sinosoft.tbf.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.com.sinosoft.tbf.common.security.MobileApiSecurityInterceptor;
import cn.com.sinosoft.tbf.common.security.jwt.Audience;

/**
 * web mvc 安全配置
 *
 * @author <a href="mainto:nytclizy@gmail.com">lizhiyong</a>
 * @since 2016年9月1日
 */
@Configuration
public class WebMvcSecurityConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private Audience audienceEntity;

	@Bean
	public MobileApiSecurityInterceptor mobileApiSecurityInterceptor() {
		return new MobileApiSecurityInterceptor();
	}

	/**
	 * 自定义拦截器
	 *
	 * 
	 * @param registry
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		// 移动端接口权限拦截器
		InterceptorRegistration mobileApiInteceptor = registry
				.addInterceptor(mobileApiSecurityInterceptor());
		for (String url : audienceEntity.getUrlPatterns()) {
			mobileApiInteceptor.addPathPatterns(url);
		}

		super.addInterceptors(registry);
	}

}
