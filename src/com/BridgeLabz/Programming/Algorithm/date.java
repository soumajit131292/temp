package com.BridgeLabz.Programming.Algorithm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) throws Exception{
		
		String date="10/12/2019";
		SimpleDateFormat sdf=new SimpleDateFormat("MM/DD/YYYY");
		Date bdate=sdf.parse(date);
		
		}

}
