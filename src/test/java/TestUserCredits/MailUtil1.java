package TestUserCredits;

import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;    
import javax.mail.internet.*;

import com.sendgrid.helpers.mail.objects.Email;    
 class MailUtil1
{  
	public static void send(final String from,final String password,String to,String sub,String Msg) throws IOException
	{  
		Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
        {    
        	protected PasswordAuthentication getPasswordAuthentication() 
        	{    
        		return new PasswordAuthentication(from,password);  
        	}      
        });    
        try 
        {    
        	MimeMessage message = new MimeMessage(session);    
        	message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
        	message.setSubject(sub);    
        	//Multipart multipart = messageBody(Msg);
         
        	//message.setContent(multipart );  
        	Transport.send(message);    
        	System.out.println("message sent successfully");    
        }
        catch (MessagingException e) 
        {
        	throw new RuntimeException(e);
        }    
	}

	/*private static Multipart messageBody(String Msg) throws MessagingException{ {
		BodyPart messageBodyPart1 = new MimeBodyPart();  
		messageBodyPart1.setText("Greetings, From Payroll Department");  
		 
		//BodyPart messageBodyPart2 = new MimeBodyPart(); 
		//messageBodyPart2.setText("\nDear, \n \t\t "+id);
		BodyPart messageBodyPart3 = new MimeBodyPart(); 
		messageBodyPart3.setText("\n\t\tYour Leave application was "+Msg);
		BodyPart messageBodyPart4 = new MimeBodyPart(); 
		messageBodyPart4.setText("\n\t\tThank you");
		BodyPart messageBodyPart5 = new MimeBodyPart(); 
		messageBodyPart5.setText("\n\t Team Payroll...");

		String filename = "SendAttachment.java";  
		FileDataSource source = new FileDataSource("./src/test/java/com/chainsys/PayrollApp/SendMailSSL.java");  
		messageBodyPart2.setDataHandler(new DataHandler(source));  
		messageBodyPart2.setFileName(filename); 
		
		Multipart multipart = new MimeMultipart();  
		multipart.addBodyPart(messageBodyPart1);  
		//multipart.addBodyPart(messageBodyPart2);
		multipart.addBodyPart(messageBodyPart3);
		multipart.addBodyPart(messageBodyPart4);
		multipart.addBodyPart(messageBodyPart5);
		return multipart;*/ 


 }


 