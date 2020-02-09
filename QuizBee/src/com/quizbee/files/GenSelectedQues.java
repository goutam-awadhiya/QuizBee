package com.quizbee.files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GenSelectedQues {
	public static ArrayList<Integer> genSequence(ArrayList<Question> questions){
    	int totalQuestions = questions.size();
    	ArrayList<Integer> sequence = new ArrayList<Integer>();
    	int levels = 13;
    	Random randomObj = new Random();
    	while(sequence.size()<levels){
    		int randomQuestion = randomObj.nextInt(totalQuestions-1);
    		int presence = Collections.frequency(sequence,randomQuestion);
    		if (presence == 0) {
    			sequence.add(randomQuestion);
    		}
    	}
    	System.out.println(sequence);
    	return sequence;
    }
    
    public static ArrayList<Question> genQuestions(ArrayList<Question> questions,ArrayList<Integer> sequence){
    	ArrayList<Question> selectedQues = new ArrayList<Question>();
    	for (int i=0;i<sequence.size();i++) {
    		selectedQues.add(questions.get(sequence.get(i)));
    	}
    	return selectedQues;
    }
	    
    public static void main(String args[]) {
	    	System.out.println("This file will generate random sequence and selected Questions");
	}

}
