package edu.unca.csci201;

import java.util.Scanner;

public class CaptchaCheck {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	while (true) {
	    Captcha captcha = new Captcha();
	    System.out.println(captcha.getQuestion());
	    
	    if (input.hasNextInt()) {
		int sum = Integer.parseInt(input.nextLine());

		try {
		    captcha.runCheck(sum);
		    
		} catch (CaptchaCorrectException e) {
		    break;
		}
		
	    } else {
		System.out.println("Enter a number");
		input.nextLine();
		
	    }
	}

	System.out.println("Congratulations, you aren't a robot!");
    }

}
