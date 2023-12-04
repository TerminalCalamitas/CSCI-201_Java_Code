package edu.unca.csci201;

import java.util.Random;

public class Captcha {
    int num1;
    int num2;
    
    public Captcha() {
	Random rand = new Random();
	num1 = rand.nextInt(1, 100);
	num2 = rand.nextInt(1, 100);
    }
    
    public String getQuestion() {
	// put in parentheses to make a little easier to read
	return ("What is " + num1 + " + " + num2 + "?");
    }
    
    public void runCheck(int sum) throws CaptchaCorrectException {
	if (sum == num1 + num2) {
	    throw new CaptchaCorrectException();
	} else {
	    return;
	}
    }
}
