package util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailService {
	
	public void Enviar(final String emisor, final String emisorPass, String destinatario, String asunto, String mensaje) throws MessagingException{

		        Properties props = new Properties();
		        props.put("mail.smtp.auth", "true");
		        props.put("mail.smtp.starttls.enable", "true");
		        props.put("mail.smtp.host", "smtp.gmail.com");
		        props.put("mail.smtp.port", "587");
		 
		        Session session = Session.getInstance(props,
		                new javax.mail.Authenticator() {
		                    protected PasswordAuthentication getPasswordAuthentication() {
		                        return new PasswordAuthentication(emisor, emisorPass);
		                    }
		                });
		 
//		        try {
		 
		            Message message = new MimeMessage(session);
		            message.setFrom(new InternetAddress(emisor));
		            message.setRecipients(Message.RecipientType.TO,
		                    InternetAddress.parse(destinatario));
		            message.setSubject(asunto);
		            message.setContent(mensaje, "text/html; charset=utf-8");
		 
		            Transport.send(message);
		            System.out.println("Mensaje enviado");
		 
//		        } catch (MessagingException e) {
//		            throw new RuntimeException(e);
//		        }
		    
	}

}
