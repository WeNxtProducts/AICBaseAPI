package com.aic.base.emailTemplate;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
//import jakarta.mail.Authenticator;

import org.springframework.mail.SimpleMailMessage;
public class JakartaEmail {
	
   public static void main(String[] args) {
      //provide recipient's email ID
      String to = "kamali.d@wenxttech.com";
      //provide sender's email ID
      String from = "dinesh.b@wenxttech.com";
      //provide Mailtrap's username
      final String username = "dinesh.b@wenxttech.com";
      //provide Mailtrap's password
      final String password = "bwrlxbcytzgcbvjb";
      //provide Mailtrap's host address
      String host = "send.smtp.mailtrap.io";
      //configure Mailtrap's SMTP server details
      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", "smtp.office365.com");
//      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");
      //create the Session object
////      Authenticator authenticator = new Authenticator() {
////protected PasswordAuthentication getPasswordAuthentication() {
////return new PasswordAuthentication(username, password);
////}
////};
////Session session = Session.getInstance(props, authenticator);
////      try {
////    //create a MimeMessage object
////    Message message = new MimeMessage(session);
////    //set From email field
////    message.setFrom(new InternetAddress(from));
////    //set To email field
////    message.setRecipients(Message.RecipientType.TO,
////               InternetAddress.parse(to));
////    //set email subject field
////    message.setSubject("Here comes Jakarta Mail!");
////    //set the content of the email message
////    message.setContent("Just discovered that Jakarta Mail is fun and easy to use", "text/html");
//    //send the email message
//      
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setTo(email);
//		message.setSubject("Password Reset Request");
//		message.setText("To reset your password, please click on the following link: " + resetPasswordLink);
//
//		javaMailSender.send(message);
////    Transport.send(message);
//    System.out.println("Email Message Sent Successfully");
//      } catch (MessagingException e) {
//         throw new RuntimeException(e);
//      }
   }
}