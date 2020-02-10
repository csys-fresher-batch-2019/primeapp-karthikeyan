package util;

import java.io.IOException;
import java.util.Scanner;

import logger.Logger;

public class TestConformEmail 
{
	static Scanner sc = new Scanner(System.in);
	static Logger logger = Logger.getInstance();
	public static boolean main(int random, String mailId) throws IOException {
		
        String subject = "Verify your new Amazon account";    
        String bodyContent = "To verify your email address,\nplease use the following One Time Password (OTP):\n\n\n "+random+"\n\nDo not share this OTP with anyone.\nPrime takes your account security very seriously. ";
        MailUtil1.send(mailId,subject,bodyContent,1);
        logger.info("Enter the OTP");
        logger.info("OTP send to your MailId");
		int a =sc.nextInt();
		if(a == random)
		{
			return true;
		}
		else
		{
			logger.info("OTP entered is Incorrect");		
			return false;
		}
	}
	public static boolean changePassword(int random,String mailId) throws IOException {
		
        String subject = "Prime password assistance";
        String bodyContent = "Password assistance \n\n\n To authenticate, please use the following One Time Password (OTP): \n\n\n "+random+"Do not share this OTP with anyone. \nPrime takes your account security very seriously.";
        MailUtil1.send(mailId,subject,bodyContent,1);
        logger.info("Enter the OTP");
        logger.info("OTP send to your MailId");
		int a = sc.nextInt();
		if(a == random)
		{
			return true;
		}
		else
		{
			logger.info("OTP entered is Incorrect");		
			return false;
		}
	}
	
}
