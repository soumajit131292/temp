package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 *
 *this program finds permutation a given string
 *
 */
public class Permutation {

	public static void permute(String fix,String unfix)
	{
		if(unfix.length()==0)
			System.out.println(fix);
		for(int i=0;i<unfix.length();i++)
		{
			 String fixed=fix+unfix.charAt(i);
			 String unfixed=unfix.substring(0,i)+unfix.substring(i+1);
			permute(fixed,unfixed);
		}
	}
	public static void main(String[] args) {
		
permute("","abc");
	}

}
