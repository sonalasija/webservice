package com.sonalasija;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endpoint endpoint=Endpoint.publish("http://107.180.104.119:3589/bmi",new BMIService());
		System.out.println(endpoint.isPublished());

	}

}
