package hiepbe.com.springsendemail.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MainApp {
	public static void main(final String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		MailSender mailSender = (MailSender) context.getBean("mailSender2");
		System.out.println("Sending an email to your email....");
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("gogo.team2021@gmail.com");
		message.setTo("buihuuhiepdev@gmail.com");
		message.setSubject("Demo send email in spring");
		message.setText("Hello, I am Hiep, I am a be developer.");
		mailSender.send(message);
		System.out.println("Done!");
		context.close();
	}
}
