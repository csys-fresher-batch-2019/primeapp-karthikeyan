package com.chainsys.primeapp;

import java.io.IOException;
import java.util.Scanner;

//import com.sendgrid.helpers.mail.objects.Email;

import TestUserCredits.MailUtil1;

public class TestConformEmail 
{
	public static boolean main(int random, String mailId) throws IOException {
		Scanner sc = new Scanner(System.in);
        String subject = "Verify your new Amazon account";    
        String bodyContent = "To verify your email address,\nplease use the following One Time Password (OTP):\n\n\n "+random+"\n\nDo not share this OTP with anyone.\nPrime takes your account security very seriously. ";
        MailUtil1.send("primemovieentertainments@gmail.com","Reset@123",mailId,subject,bodyContent);
        System.out.println("Enter the OTP");
		System.out.println("OTP send to your MailId");
		int a =sc.nextInt();
		if(a == random)
		{
			return true;
		}
		else
		{
			System.out.println("OTP entered is Incorrect");		
			return false;
		}
	}
	public static boolean changePassword(int random,String mailId) throws IOException {
		Scanner sc = new Scanner(System.in);
        String subject = "Prime password assistance";
        String bodyContent = "Password assistance \n\n\n To authenticate, please use the following One Time Password (OTP): \n\n\n "+random+"Do not share this OTP with anyone. \nPrime takes your account security very seriously.";
        MailUtil1.send("primemovieentertainments@gmail.com","Reset@123",mailId,subject,bodyContent);
        System.out.println("Enter the OTP");
		System.out.println("OTP send to your MailId");
		int a = sc.nextInt();
		if(a == random)
		{
			return true;
		}
		else
		{
			System.out.println("OTP entered is Incorrect");		
			return false;
		}
	}
	
}
