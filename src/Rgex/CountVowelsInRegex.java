package Rgex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowelsInRegex {
	public static void main(String[] args) {
		String Vowels="a,e,i,o,u";
		Pattern pattern=Pattern.compile("[a-u]");
		Matcher matcher=pattern.matcher(Vowels);
		
		for(int i=0;i<Vowels.length();i++) {
			if(Vowels.charAt(i)=='a' || Vowels.charAt(i)=='e'|| Vowels.charAt(i)=='i' || Vowels.charAt(i)=='o' ||Vowels.charAt(i)=='u') {
				int count = 0;
				count++;
			}
		}
		int count = 0;
		System.out.println("total number of vowels in string are "+count);
		
		
		String regex="pr";
	    Pattern pattern2=Pattern.compile("[pq]");
	    Matcher matcher2=pattern2.matcher(regex);
	    
	    boolean matchFound=true;
	    if(matchFound) {
	    	System.out.println("match found");
	    }
	    else {
	    	System.out.println("match not found");
	    }
	}

}
