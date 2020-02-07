package util;

import java.security.SecureRandom;

public class OTPUtil {
	
	private static final SecureRandom rand = new SecureRandom();
	public static int getOTP() {
	
        return rand.nextInt(1000000); 
        
	}
}
