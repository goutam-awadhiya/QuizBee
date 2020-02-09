package com.quizbee.files;
import java.util.ArrayList;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForwardListToJSP")
public class ForwardListToJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ForwardListToJSP() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// getting questions from Question class
		ArrayList<Question> questions = AllQuestion.returnAllQuestion();
		String name = "Shri";
		//generate random sequence
		ArrayList<Integer> sequence = GenSelectedQues.genSequence(questions);
		
		// generate questions according to sequence
		ArrayList<Question> selectedQues = GenSelectedQues.genQuestions(questions,sequence);
		System.out.println(selectedQues);
		
		// add selectedQues to request object
		request.setAttribute("selectedQuestions",selectedQues);
		request.setAttribute("her_name", name);
		
				// get the request Dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("GameOn.jsp");
		
		// forward the dispatcher to GameOn.jsp
		dispatcher.forward(request,response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
