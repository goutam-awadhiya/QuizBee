package com.quizbee.files;
import java.util.ArrayList;
public class AllQuestion {
	
	public static ArrayList<Question> returnAllQuestion(){
		
		ArrayList<Question> questions= new ArrayList<Question>();
		
		ArrayList<String> title = new ArrayList<String>();
		
		ArrayList<String> opt1 = new ArrayList<String>();
		
		ArrayList<String> opt2 = new ArrayList<String>();
		
		ArrayList<String> opt3 = new ArrayList<String>();
		
		ArrayList<String> opt4 = new ArrayList<String>();
		
		ArrayList<String> ans = new ArrayList<String>();
		
		// Ques 1 
		title.add("What java was called before java?");
		opt1.add("Oak");
		opt2.add("J");
		opt3.add("Phellem");
		opt4.add("Shive");
		ans.add("Oak");
		
		// Ques 2
		title.add("Who created java ?");
		opt1.add("Guido van Rossum");
		opt2.add("James Gosling");
		opt3.add("Dennis Ritchie");
		opt4.add("Yukihiro Matsumoto");
		ans.add("James Gosling");
		
		// Ques 3 
		title.add("Which is not a java technology?");
		opt1.add("Struts");
		opt2.add("Maven");
		opt3.add("RichFaces");
		opt4.add("Rust");
		ans.add("Rust");
	
		// Ques 4
		title.add("Size of the float and double in Java is-");
		opt1.add("32 and 64");
		opt2.add("64 and 64");
		opt3.add("32 and 32");
		opt4.add("64 and 32");
		ans.add("32 and 64");
		
		// Ques 5
		title.add("You want subclasses in any package to have access to members of a superclass. Which is the most restrictive access that accomplishes this objective?");
		opt1.add("public");
		opt2.add("private");
		opt3.add("protected");
		opt4.add("transient");
		ans.add("protected");
		
		// Ques 6
		title.add("What is the size of long variable?");
		opt1.add("8 bit");
		opt2.add("16 bit");
		opt3.add("32 bit");
		opt4.add("64 bit");
		ans.add("64 bit");
		/*
		// Ques 7
		title.add("What is Serialization?");
		opt1.add("Serialization is the process of writing the state of an object to another object.");
		opt2.add("Serialization is the process of writing the state of an object to a byte stream.");
		opt3.add("Both of the above.");
		opt4.add("None of the above.");
		ans.add("Serialization is the process of writing the state of an object to a byte stream.");

		 */
		// Ques 8
		title.add("Which of the following is a thread safe?");
		opt1.add("StringBuilder");
		opt2.add("StringBuffer");
		opt3.add("Both of the above");
		opt4.add("none of the above");
		ans.add("StringBuffer");

		// Ques 9
		title.add("Which of the folllowing options is the best for generating random integer 0 or 1?");
		opt1.add("(int)Math.random()");
		opt2.add("(int)Math.random() + 1");
		opt3.add("(int)(Math.random() + 0.5)");
		opt4.add("(int)(Math.random() + 0.2)");
		ans.add("(int)(Math.random() + 0.5)");

		// Ques 10
		title.add("System class is defined in ..............");
		opt1.add("java.util package");
		opt2.add("java.lang package");
		opt3.add("java.io package");
		opt4.add("java.awt package");
		ans.add("java.lang package");
		/*
		// Ques 11
		title.add("Which of the following constructor of class Thread is valid one?");
		opt1.add("Thread(Runnable threadOb, int priority)");
		opt2.add("Thread(int priority)");
		opt3.add("Thread(Runnable threadOb, String threadName)");
		opt4.add("Thread(String threadName, int priority)");
		ans.add("Thread(Runnable threadOb, String threadName)");
		
		// Ques 12
		title.add("Which is true?");
		opt1.add("'X extends Y' is correct if and only if X is a class and Y is an interface");
		opt2.add("'X extends Y' is correct if and only if X is an interface and Y is a class");
		opt3.add("'X extends Y' is correct if X and Y are either both classes or both interfaces");
		opt4.add("'X extends Y' is correct for all combinations of X and Y being classes and/or interfaces");
		ans.add("'X extends Y' is correct if X and Y are either both classes or both interfaces");
		
		// Ques 13
		title.add("Which of the following statements regarding abstract classes are true?");
		opt1.add("An abstract class can be extended.");
		opt2.add("A subclass of a non-abstract superclass can be abstract.");
		opt3.add("A subclass can override a concrete method in a superclass to declare it abstract.");
		opt4.add("All of the above");
		ans.add("All of the above");
		*/
		//Ques 14
		title.add("How many primitive data types are there in java?");
		opt1.add("6");
		opt2.add("7");
		opt3.add("8");
		opt4.add("9");
		ans.add("8");
		
		// Ques 15
		title.add("In java byte, short,int and long all of these are");
		opt1.add("signed");
		opt2.add("unsigned");
		opt3.add("both of th above");
		opt4.add("None of these");
		ans.add("signed");
		/*
		// Ques 16
		title.add("Automatic type conversion in Java takes place when ");
		opt1.add("Two type are compatible and size of destination type is shorter than source type");
		opt2.add("Two type are compatible and size of destination type is equal of source type.");
		opt3.add("Two type are compatible and size of destination type is larger than source type.");
		opt4.add("All of the above");
		ans.add("Two type are compatible and size of destination type is larger than source type.");
		*/
		// Ques 17
		title.add("When you pass an array to a method , the method recieves ......");
		opt1.add("A copy of the array.");
		opt2.add("A copy of the first element.");
		opt3.add("The reference of the array.");
		opt4.add("The length of the array.");
		ans.add("The reference of the array.");

		/*
		// Ques 18
		title.add("Which one of the following is correct?");
		opt1.add("Java applets can not be written in any programming language");
		opt2.add("An applet is not a small program");
		opt3.add("An applet can be run on its own");
		opt4.add("Applets are embedded in another applications");
		ans.add("Applets are embedded in another applications");
		*/
		// Ques 19
		title.add("Which of the following statements is/are TRUE regarding JAVA ? (a) Constants that cannot be changed are declared using the ‘static’ keyword. (b) A class can only inherit one class but can implement multiple interfaces.");
		opt1.add("Only (a) is TRUE.");
		opt2.add("Only (b) is TRUE");
		opt3.add("Both (a) and (b) are TRUE.");
		opt4.add("Neither (a) nor (b) are TRUE");
		ans.add("Only (b) is TRUE");
		/*
		// Ques 20
		title.add("What is the use of final keyword in Java?");
		opt1.add("When a class is made final, a sublcass of it can not be created");
		opt2.add("When a method is final, it can not be overridden.");
		opt3.add("When a variable is final, it can be assigned value only once");
		opt4.add("All of the above");
		ans.add("All of the above");
	
		// Ques 21
		title.add("Which of the following is/are advantages of packages?");
		opt1.add("Packages avoid name clashes");
		opt2.add("Classes, even though they are visible outside their package, can have fields visible to packages only");
		opt3.add("We can have hidden classes that are used by the packages, but not visible outside.");
		opt4.add("All of the above");
		ans.add("All of the above");
		*/
		// Ques 22
		title.add("Identifiers in Java must not be a");
		opt1.add("digits");
		opt2.add("keyword");
		opt3.add("underscore");
		opt4.add("dollar sign characters");
		ans.add("keyword");
		
		// Ques 23
		title.add("Which of the following is a keyword in Java ?");
		opt1.add("strictfp");
		opt2.add("strictcp");
		opt3.add("stricted");
		opt4.add("stricts");
		ans.add("strictfp");
		
		// Ques 24
		title.add("What is the range of the data type double in Java ?");
		opt1.add("4.9e-324 to 1.8e+308");
		opt2.add("-9223372036854775808 to 9223372036854775807");
		opt3.add("1.4e-045 to 3.4e+038");
		opt4.add("none of the above");
		ans.add("4.9e-324 to 1.8e+308");

		
		// Ques 25
		/*
		//Ques 
		title.add("");
		opt1.add("");
		opt2.add("");
		opt3.add("");
		opt4.add("");
		ans.add("");
		*/
		
		//create questions ArrayList 
		for (int i=0;i<title.size();i++) {
			Question q = new Question(title.get(i),opt1.get(i),opt2.get(i),opt3.get(i),opt4.get(i),ans.get(i));
			questions.add(q);
		}
		 System.out.println(ans);
		return questions;
	}
	
	public static void main(String args[]){
		System.out.println("This file will create and retutn ArrayList of Integers");
		
	}

}
