package cn.com.sinosoft.tbf.util.email;

import java.io.File;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.sun.xml.messaging.saaj.packaging.mime.internet.MimeUtility;

import cn.com.sinosoft.tbf.util.MailPropertiesUtil;

/**
 * 邮件发送
 *
 * @author <a href="mainto:lichuang@sinosoft.com.cn">lichuang</a>
 * @since 2016年8月16日
 */
@Component
public class SendMailUtil {

	@Resource
	EmailSendConfig emailSendConfig;

	public void sendFileMail(boolean isWithFile, EmailInfo emif)
			throws MessagingException {
		JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();

		// 将附件url和文件名字添加到map里
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("fileUrl", emif.getExtrafile());
		map.put("fileName", emif.getFilename());
		// 设定mail server
		senderImpl.setHost(emailSendConfig.getHost());
		senderImpl.setUsername(emailSendConfig.getUsername());
		senderImpl.setPassword(emailSendConfig.getPassword());
		Properties props = new Properties(); // 此处必须设置，
		props.put("mail.smtp.auth", "true"); // 不设置会出现 553错误，见错误1
		senderImpl.setJavaMailProperties(props);

		// 建立HTML邮件消息
		MimeMessage mailMessage = senderImpl.createMimeMessage();
		// true表示开始附件模式
		MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,
				true, "utf-8");

		int mailFlag = 0;// 标记邮件地址是否有问题0表示没问题1表示有问题
		try {
			// 设置收件人，寄件人
			messageHelper.setTo(emif.getToEmail());
		} catch (AddressException ae) {
			mailFlag = 1;
		}
		messageHelper.setFrom(emailSendConfig.getFromemail());
		// 邮件主题
		messageHelper.setSubject(MailPropertiesUtil.getMailInfoByCode(
				"mail.server.subject" + emif.getTemplateID()));

		// 采取 Velocity方式读取
		String content = "";
		try {
			content = fromVMToString(emif.getTemplateID(), emif);
		} catch (ResourceNotFoundException e1) {
			e1.printStackTrace();
		} catch (ParseErrorException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// true 表示启动HTML格式的邮件
		messageHelper.setText(content, true);

		// 判断是否含有附件 如果 true 则包含附件
		if (isWithFile) {
			Map<String, Object> fileresult = withFile(
					String.valueOf(map.get("fileUrl")),
					String.valueOf(map.get("fileName")));
			if (Boolean.getBoolean(fileresult.get("reslut").toString())) {
				FileSystemResource file = (FileSystemResource) fileresult
						.get("file");
				try {
					// 附件名有中文可能出现乱码
					messageHelper
							.addAttachment(
									MimeUtility.encodeWord(
											fileresult.get("name").toString()),
									file);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
					throw new MessagingException();
				}
			}
		}

		if (mailFlag == 0) {
			try {
				senderImpl.send(mailMessage);
			} catch (Exception se) {

			}
		}

	}

	/**
	 * 取得附件
	 * 
	 * @param fileUrl
	 * @param fileName
	 * @return
	 */
	private static Map<String, Object> withFile(String fileUrl,
			String fileName) {
		Map<String, Object> result = new HashMap<String, Object>();
		FileSystemResource file = new FileSystemResource(new File(fileUrl));
		if (file.exists()) {
			// 附件存在
			result.put("name", fileName);
			result.put("file", file);
			result.put("result", true);
		} else {
			result.put("result", false);
		}
		return result;
	}

	/**
	 * 根据模版ID 加载邮件内容
	 * 
	 * @param templateID
	 * @return
	 * @throws Exception
	 * @throws ParseErrorException
	 * @throws ResourceNotFoundException
	 */
	private static String fromVMToString(String templateID, EmailInfo emif)
			throws ResourceNotFoundException, ParseErrorException, Exception {
		String result = "";
		// 初始化并取得Velocity引擎
		VelocityEngine ve = new VelocityEngine();
		String basePath = "velocity/";
		// 设置模板的路径
		Properties properties = new Properties();

		// 设置velocity资源加载方式为class
		properties.setProperty("resource.loader", "class");
		// 设置velocity资源加载方式为file时的处理类
		properties.setProperty("class.resource.loader.class",
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		// 初始化velocity 让设置的路径生效
		ve.init(properties);

		// 取得velocity的模版
		Template t = ve
				.getTemplate(
						basePath + MailPropertiesUtil.getMailInfoByCode(
								"mail.server.update.vm" + templateID) + ".vm",
						"utf-8");

		// 取得velocity的上下文context
		VelocityContext context = new VelocityContext();
		context.put("emif", emif);

		// 输出流
		StringWriter writer = new StringWriter();
		// 转换输出
		t.merge(context, writer);

		// 输出信息
		result = writer.toString();
		return result;
	}
}
