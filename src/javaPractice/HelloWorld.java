package javaPractice;

public class HelloWorld {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int total = a + b;
		System.out.println("The Total is: " + total);
		
		if(a>b){
			System.out.println("A is greater than b and the Total is: " + total);
		}
			else {
				System.out.println("a is smaller than b and the Total is: "+ total);
		}
		
		        char grade = 90;
				if (grade>=90){
					System.out.println("Excellent");
				}
				else if(grade>=80){
					System.out.println("Good");
				}
				else if(grade>=70){
					System.out.println("Ok");
				}
				else if(grade>=60){
					System.out.println("Need Work");
				}
				else
					System.out.println("Fail");
				
				
				int num = 5;
				double cost = 10.5;
				System.out.println( num  + cost );
				
				//Assume  that word is a String  variable . Write a statement  to display the message 
				//"Today's Word-Of-The-Day is: " followed by the value  of word. The message  and the value  of word should appear together,
				//on  a single line on standard output .
				
				String word = "Java";
				System.out.println("Today's Word-Of-The-Day is: "+ word);
				
			
		}

	}

