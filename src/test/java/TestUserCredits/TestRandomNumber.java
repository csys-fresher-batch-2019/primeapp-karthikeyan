package testUserCredits;
import java.util.Random; 
public class TestRandomNumber 
{
    public static int main(String args[]) 
    { 
    	Random rand = new Random(); 
        int rand_int1 = rand.nextInt(1000000); 
        return rand_int1;
    }
}