package util;

import java.security.SecureRandom;

public class OTPUtil {
	
	private static final SecureRandom rand = new SecureRandom();
	public static int getOTP() {
		
        int rand_int1 = rand.nextInt(1000000); 
        return rand_int1;
	}
}
