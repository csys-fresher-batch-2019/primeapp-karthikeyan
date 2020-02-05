package TestUserCredits;
import java.util.Random; 
public class TestRandomNumber 
{
    public static int main(String args[]) 
    { 
        return getOTP(); 
    }

	public static int getOTP() {
		Random rand = new Random(); 
        int rand_int1 = rand.nextInt(100000); 
        //System.out.println("Random Integers: "+rand_int1);
        return rand_int1;
	} 
} 