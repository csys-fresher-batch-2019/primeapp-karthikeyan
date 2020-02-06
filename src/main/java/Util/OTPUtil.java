package Util;

import java.util.Random;

public class OTPUtil {

	private static final Random rand = new Random();
	public static int getOTP() {
        int rand_int1 = rand.nextInt(1000000); 
        //System.out.println("Random Integers: "+rand_int1);
        return rand_int1;
	}
}
