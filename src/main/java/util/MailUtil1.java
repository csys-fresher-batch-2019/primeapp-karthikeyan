package util;

import java.io.IOException;
import java.util.Properties;

//import javax.activation.DataHandler;
//import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

 public class MailUtil1
{  
	public static void send(String to,String sub,String Msg,int val) throws IOException
	{  
		Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");  
        props.put("mail.smtp.ssl.checkserveridentity", true); 
        Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
        {    
        	protected PasswordAuthentication getPasswordAuthentication() 
        	{    
        		return new PasswordAuthentication("primemovieentertainments@gmail.com","Reset@123");  
        	}      
        });    
        try 
        {    
        	MimeMessage message = new MimeMessage(session);    
        	message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
        	message.setSubject(sub); 
        	if(val==1)
        	{
        	Multipart multipart = messageBody(Msg);
            message.setContent(multipart);  
        	}
        	else
        	{
        		Multipart multipart1 = messageBody1(to,Msg);
                message.setContent(multipart1);
        	}
        	/*else
        	{
        		Multipart multipart2 = messageBody2(val, to,Msg, Msg);
                message.setContent(multipart2);
        	}*/
        	Transport.send(message);    
        	System.out.println("message sent successfully to "+to);    
        }
        catch (MessagingException e) 
        {
        	throw new RuntimeException(e);
        }    
	}


	private static Multipart messageBody(String Msg) throws MessagingException{ {
		BodyPart messageBodyPart1 = new MimeBodyPart();  
		messageBodyPart1.setText("Prime OTP Assitance");  
		BodyPart messageBodyPart2 = new MimeBodyPart(); 
		messageBodyPart2.setText("\nTo authenticate, please use the following One Time Password (OTP):");
		 
		BodyPart messageBodyPart3 = new MimeBodyPart(); 
		messageBodyPart3.setText(Msg);
		BodyPart messageBodyPart4 = new MimeBodyPart(); 
		messageBodyPart4.setText("Do not share this OTP with anyone. \nAmazon takes your account security very seriously. \nAmazon Customer Service will never ask you to disclose or \nverify your Amazon password, OTP, credit card, or banking account number. ");
		BodyPart messageBodyPart5 = new MimeBodyPart(); 
		messageBodyPart5.setText("Thanks for Using Prime Videos");

		/*String filename = "SendAttachment.java";  
		FileDataSource source = new FileDataSource("./src/test/java/com/chainsys/PayrollApp/SendMailSSL.java");  
		messageBodyPart2.setDataHandler(new DataHandler(source));  
		messageBodyPart2.setFileName(filename); */
		
		Multipart multipart = new MimeMultipart();  
		multipart.addBodyPart(messageBodyPart1);  
		multipart.addBodyPart(messageBodyPart2);
		multipart.addBodyPart(messageBodyPart3);
		multipart.addBodyPart(messageBodyPart4);
		multipart.addBodyPart(messageBodyPart5);
		return multipart; 
	}


 }
	private static Multipart messageBody1(String to,String Msg) throws MessagingException{ {
		BodyPart messageBodyPart1 = new MimeBodyPart();  
		messageBodyPart1.setText("Prime Assitance");  
		BodyPart messageBodyPart2 = new MimeBodyPart(); 
		messageBodyPart2.setText("\nDear Prime Video User");
		BodyPart messageBodyPart3 = new MimeBodyPart(); 
		messageBodyPart3.setText("\nYour MailId/UserID  "+to);
		BodyPart messageBodyPart4 = new MimeBodyPart(); 
		messageBodyPart4.setText("\nHas been Deleted From PrimeVideo\nSo you Are NO Longer a Prime User");
		BodyPart messageBodyPart5 = new MimeBodyPart(); 
		messageBodyPart5.setText("\nBecause OF Following Reasons");
		BodyPart messageBodyPart6 = new MimeBodyPart(); 
		messageBodyPart6.setText("\n"+Msg);
		BodyPart messageBodyPart7= new MimeBodyPart(); 
		messageBodyPart7.setText("\nThank you");
		/*String filename = "SendAttachment.java";  
		FileDataSource source = new FileDataSource("./src/test/java/com/chainsys/PayrollApp/SendMailSSL.java");  
		messageBodyPart2.setDataHandler(new DataHandler(source));  
		messageBodyPart2.setFileName(filename); */
		
		Multipart multipart = new MimeMultipart();  
		multipart.addBodyPart(messageBodyPart1);  
		multipart.addBodyPart(messageBodyPart2);
		multipart.addBodyPart(messageBodyPart3);
		multipart.addBodyPart(messageBodyPart4);
		multipart.addBodyPart(messageBodyPart5);
		multipart.addBodyPart(messageBodyPart6);
		multipart.addBodyPart(messageBodyPart7);
		return multipart; 
	}


 }
	private static Multipart messageBody2(int userId, String customerName,String to, String msg) throws MessagingException{ {
		BodyPart messageBodyPart1 = new MimeBodyPart();  
		messageBodyPart1.setText("Prime Video Messaging Assitance");  
		BodyPart messageBodyPart2 = new MimeBodyPart(); 
		messageBodyPart2.setText("\nDear Prime Video User");
		BodyPart messageBodyPart3 = new MimeBodyPart(); 
		messageBodyPart3.setText("\nMailId/UserID  "+to+"\n");
		BodyPart messageBodyPart4 = new MimeBodyPart(); 
		messageBodyPart4.setText("\n Hi "+customerName+" UserId :"+userId);
		BodyPart messageBodyPart5 = new MimeBodyPart(); 
		messageBodyPart5.setText("\nNew Released Movie :");
		BodyPart messageBodyPart6= new MimeBodyPart(); 
		messageBodyPart6.setText("\n"+msg);
		BodyPart messageBodyPart7 = new MimeBodyPart(); 
		messageBodyPart7.setText("\nOnly on Prime Videos");
		/*String filename = "SendAttachment.java";  
		FileDataSource source = new FileDataSource("./src/test/java/com/chainsys/PayrollApp/SendMailSSL.java");  
		messageBodyPart2.setDataHandler(new DataHandler(source));  
		messageBodyPart2.setFileName(filename); */
		
		Multipart multipart = new MimeMultipart();  
		multipart.addBodyPart(messageBodyPart1);  
		multipart.addBodyPart(messageBodyPart2);
		multipart.addBodyPart(messageBodyPart3);
		multipart.addBodyPart(messageBodyPart4);
		multipart.addBodyPart(messageBodyPart5);
		multipart.addBodyPart(messageBodyPart6);
		multipart.addBodyPart(messageBodyPart7);
		return multipart; 


 }
	}

	public static void send1(int userId, String customerName, String to, String sub, String Msg, int val) {
		
		Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");  
        props.put("mail.smtp.ssl.checkserveridentity", true); 
        Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
        {    
        	protected PasswordAuthentication getPasswordAuthentication() 
        	{    
        		return new PasswordAuthentication("primemovieentertainments@gmail.com","Reset@123");  
        	}      
        });    
        try 
        {    
        	MimeMessage message = new MimeMessage(session);    
        	message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
        	message.setSubject(sub); 
        	if(val==3)
        	{
        		Multipart multipart2 = messageBody2(userId,customerName,to,Msg);
                message.setContent(multipart2);
        	}
        	Transport.send(message);    
        	System.out.println("message sent successfully to "+to);    
        }
        catch (MessagingException e) 
        {
        	throw new RuntimeException(e);
        }    
	}
}


 