package com.chainsys.primeapp;

import java.util.Random;

public class OTPUtil {

	public static int getOTP() {
		Random rand = new Random(); 
        int rand_int1 = rand.nextInt(1000000); 
        //System.out.println("Random Integers: "+rand_int1);
        return rand_int1;
	}
}
