package day6;

import java.util.ArrayList;
import java.util.List;

public class SuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcde";
		
		String[] s1 = s.split("");
		
		List<String> newStringList = new ArrayList<>();
		
		
		for(int i=0;i<s1.length;i++) {
			newStringList.add(getPermutedStrings(s1,4,i,4));
		
		
		}
		
		System.out.println(newStringList.toString());
	}
	
	public static String getPermutedStrings(String[] s1,int n,int i, int whereToStop ) {
		
		StringBuilder s= new StringBuilder();
		
		
		if(n==1) {
			
			s.append(s1[i]);
			s.append("");
			//System.out.println("inside 1st if, for "+i+" : - "+s.toString());
			return s.toString();
			
		}
		
		else {
			
			s.append(getPermutedStrings(s1, n-1,i,whereToStop));
			/*s1[i] + s1[i+1]
			i+3
			....*/
			//n--;
			
			
			
			if(s1.length-i< whereToStop) {
				//for (int j = 0; j < whereToStop; j++) {
					
					
						
						s.append(s1[(i+n-1) % s1.length]);
					
					//}
				return s.toString();
					
				}
			else {
			/*if(i==s1.length-1) {
				
				s.append(s1[0]);
				
				//System.out.println("Inside 2nd if, for  "+i+" : - "+s.toString());
				return s.toString();	
			}
			else {*/
			s.append(s1[i+n-1]);
			//System.out.println("inside 2nd else, for "+i+" : - "+s.toString());
		    return s.toString();
			//}
		//s.append("");	
			}
		}
		
		//return s.toString();
	}

}
