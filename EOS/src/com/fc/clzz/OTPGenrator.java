package com.fc.clzz;

import java.util.Random;

public class OTPGenrator {
	
	public int getOtp() {
		
		return new Random().nextInt();
	}
	
	public String sendAck() {
		
		return "Your OTP is this valid for next 10 mins don't share with any one";
	}
	
	public String genConfermationMsg() {
		
		return "It's done...";
	}
}
