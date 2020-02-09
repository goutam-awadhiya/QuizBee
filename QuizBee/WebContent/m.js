
function givefeed1() {
        		var ele = document.getElementById("btn").value;
        		var arr=["Oak", "James Gosling", "Rust", "32 and 64", "protected", "64 bit", "StringBuffer", "(int)(Math.random() + 0.5)", "java.lang package", "8", "signed", "The reference of the array.", "Only (b) is TRUE", "keyword", "strictfp", "4.9e-324 to 1.8e+308"];
        		for(var i=0;i<=arr.length;i++){

        			if(arr.includes(ele))
        				
        				document.getElementById("t").innerHTML="Correct";
        		
        			
        			
        			else{
        				document.getElementById("t").innerHTML="Incorrect";
        				//window.location="http://localhost:8080/QuizBee/Start.html";
        			}
        			
        		}
        		
                console.log(ele);
} 