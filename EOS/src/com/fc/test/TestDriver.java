package com.fc.test;

import com.fc.clzz.OTPGenrator;
import com.fc.util.DateUtil;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateUtil dateUtil = new DateUtil();
		System.out.println(dateUtil.getDate());
		System.out.println("successfully executed..");
	  //================================================
		
		OTPGenrator otp = new OTPGenrator();
		System.out.println(otp.getOtp()); 
	}
}
