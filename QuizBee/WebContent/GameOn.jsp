<%-- Directives Attributes --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.quizbee.files.Question" %>
<%-- #####################################################

	normal variable  ----- ${her_name}
	get title   ------  ${selectedQuestions.get(1).title} 
	size of list  ------  ${selectedQuestions.size()}
	username  -----  ${param.fname} 
	
##########################################################--%>
<% 
	int answer = 1;
	String status = "Waiting for answer";
%>
<html>
<head>
	<title>QuizBEE</title>
	<link rel = "stylesheet" type="text/css" href = "progstyle.css">
	<link rel="stylesheet" type="text/css" href="style.css">
	<link href ="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
	<script src="m.js" type="text/javascript"></script>
</head>

<body>
<% for (int i = 0;i<10;i++) {%>
<%

		out.println("<div >");
		out.println("<p class='b'>Level -"+ "1" +"</p>");
		out.println("</div>");
		out.println("<div class='box' id='ques'>");
%>
		<p class='a'>${selectedQuestions.get(i).getTitle()} </p>)

</div>
	<div class='box' id= 'result'>
		<label class = 'correct b' for='feedback'><p  class='b' id='t' >Waiting for Ans...</p></label>
	</div>

	
	<form action = "ForwardListToJSP">

		<div class='container'>
		
		<div class="box">
		<button type="button" name="opt1" onClick="givefeed1()"  value = "${selectedQuestions.get(i}).getOpt1()}" id="btn">${selectedQuestions.get(i).getOpt1()}</button>
		</div>

		<div class="box">
			<button type="button" name="opt2" onClick ="givefeed1()" value = "${selectedQuestions.get(i).getOpt2()}" id="btn">${selectedQuestions.get(i).getOpt2()}</button>
    </div>

		<div class="box">
					<button type="button" name="opt3" onClick ="givefeed1()" value = "${selectedQuestions.get(i).getOpt3()}"  id="btn">${selectedQuestions.get(i).getOpt3()}</button>
    </div>

		<div class="box">
					<button type="button" name = "opt4" onClick ="givefeed1()" value = "${selectedQuestions.get(i).getOpt4()}" id="btn">${selectedQuestions.get(i).getOpt4()}</button>
		</div>

		<button type = "submit"  class="button little button1">Submit</button>

	</form>
	
    </div>
    <% } %>
</body>
</html>
