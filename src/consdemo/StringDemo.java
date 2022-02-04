package consdemo;
import java.String.*;

/*
 * Exercise Objective(s): String class, String immutability  

Exercise: Write class that declares the following String.
		   “The quick brown fox jumps over the lazy dog”.
Perform the following modifications to the above string using appropriate methods.

1.	Print the character at the 12th index. 
2.	Check whether the String contains the word “is”. 
3.	Add the string “and killed it” to the existing string. 
4.	Check whether the String ends with the word “dogs”. 
5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.                                
7.	Find the length of the String. 
8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”. 
9.	Replace the word “The” with the word “A”. 
10.	Split the above string into two such that two animal names do not come together. 
11.	Print the animal names alone separately from the above string. 
12.	Print the above string in completely lower case. 
13.	Print the above string in completely upper case.
14.	Find the index position of the character “a”. 
15.	Find the last index position of the character “e”.

 */


public class StringDemo {
	

	public static void main(String[] args) {
		String s1 =  "The quick brown fox jumps over the lazy dog";
	 
	
		char result = s1.charAt(11);  
		
		System.out.println(result);
		
		//2.	Check whether the String contains the word “is”. 
		System.out.println(s1.indexOf("is"));
		
		//3.	Add the string “and killed it” to the existing string. 
		s1 = s1.concat(" and killed it");
		System.out.println(s1);		
			
		//4.	Check whether the String ends with the word “dogs”. 
		System.out.print("Whether the String ends with the word 'dogs' :  " );
		System.out.println(s1.endsWith("dogs"));
		
		//5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
		//      0 if the string is equal 
		String temps= "The quick brown Fox jumps over the lazy Dog";
		System.out.print("Whether the String is equal to 'The quick brown Fox jumps over the lazy Dog' :  " );
		System.out.println(s1.compareTo(temps));

		// 6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.
		temps = new String("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
		System.out.print("whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG : ");
		System.out.println(s1.compareToIgnoreCase(temps));
		
		//7.	Find the length of the String. 
		System.out.println("The length of the String : " + s1.length());
		
		//8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”.
		temps = new String("The quick brown Fox jumps over the lazy Dog");
		System.out.print("whether the String is matches to “The quick brown Fox jumps over the lazy Dog : ");
		System.out.println(s1.matches(temps));
		
		//9.	Replace the word “The” with the word “A”. 
		s1 = s1.replace("The", "A");
		System.out.println(s1);
		
		//10.	Split the above string into two such that two animal names do not come together. 
		System.out.println(s1.indexOf("fox"));
		String substr1 = s1.substring(0, 17);
		String substr2 = s1.substring(18);
		
		System.out.println(substr1);
		System.out.println(substr2);
		
		//11.	Print the animal names alone separately from the above string. 
		System.out.print("the animal names alone separately from the above string : ");
		System.out.print(substr1.substring(14,17) + " ; ");
	
		int resultId = substr2.indexOf("dog");
		System.out.println(substr2.substring(resultId, resultId+3));
		System.out.println("============================");
	
		//12.	Print the above string in completely lower case. 
		System.out.println(substr1.toLowerCase());
		System.out.println(substr2.toLowerCase());
		System.out.println("============================");
		
		//13.	Print the above string in completely upper case.
		System.out.println(substr1.toUpperCase());
		System.out.println(substr2.toUpperCase());
		
		System.out.println("============================");
		
		//14.	Find the index position of the character “a”. 
		int temp2 = s1.indexOf("a");
		System.out.println(temp2);
		
		//15.	Find the last index position of the character “e”.
		temp2= s1.indexOf("e");
		System.out.println(temp2);
		
		System.gc();
		
		

	}

}



