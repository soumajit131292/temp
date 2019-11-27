package com.BridgeLabz.Programming.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static boolean findPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			return true;
		return false;
	}
	

	public static void main(String[] args) {
	

		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=1000;i++)
		{
			if(findPrime(i))
				list.add(i);
		}
		System.out.print(list.size());
	}

}
