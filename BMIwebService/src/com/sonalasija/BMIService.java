package com.sonalasija;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BMIService {
	
	private float lbs,inches;

	@WebMethod
	public float bmiCalculate(String weight, String height){
		
		float bmi;
		try{
		 lbs=Float.parseFloat(weight);
		 inches=Float.parseFloat(height);
		}catch(Exception e){
			System.out.println("Please enter weight in lbs and height in inches");
		}
		
		
		bmi= (lbs/(lbs*inches))*703;
		
		return bmi;
	}

}
