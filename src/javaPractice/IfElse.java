package javaPractice;

public class IfElse {

	/*
	 * //Java Flow Control has two statements: 
	 * ---Java Conditional Statements
	 * ---Java Loop statements 
	 * (1)java Conditional Statements: Conditional statements are used to insert verification points 
	 * and error handling. 
	 * Two types of conditional statements: (1)If statements (2)Switch statement
	 * 
	 * Types of Condition: (1)Single Condition (2)Compound Condition (3)Nested
	 * Condition
	 * 
	 * (1)Single Condition: Example if(a>b){ 
	 * System.out.println("a is large number"); 
	 * }
	 *
	 * (2)Compound Condition: Example if((a>b)&&(a>c)){ 
	 * System.out.println("a is the largest number"); 
	 * }
	 * 
	 * (3) Nested Condition: Example if(a>b){ if(a>c){ if(a>d){
	 * 
	 * } } }
	 * 
	 * Usage of Conditional Statement: (1) Execute a block of statement when
	 * condition is true. syntax: if(condition){ statements } example: int a
	 * =50; int b =20; if(a>b){ System.out.println("A is big number"); }
	 * 
	 * (2)Execute a block of statements when a compound condition is true
	 * syntax: if((condition)&& || (condition)){ statements }
	 * 
	 * Example: int a =50; int b =30; int c=40; 
	 * if((a>b)&&(a>c)){
	 * System.out.println("A is big number"); 
	 * } 
	 * Note: if a is less than c then
	 * the condition won't execute because we put && sign. if we put || which is
	 * OR sign, the condition would execute.
	 * 
	 * (3)Create a block of statements when condition is true, otherwise execute
	 * another block of statements syntax: if(condition){
	 *  statements } else {
	 * statements 
	 * } 
	 * Example: int a =50; int b = 40;
	 *  if(a>b){ System.ouandntln("A is big number"); 
	 *  } 
	 *  else {
	 *   system.out.println("B is big number"); }
	 * 
	 * Note: if a and b has same value, then the else part would execute because
	 * the first condition is not true.
	 * 
	 * (4) Decide among several alternates (if , else if structure) syntax:
	 * if(condition){
	 *  statemnts 
	 *  } 
	 *  else if(condition){
	 *   statements 
	 *   } 
	 *   else if(condition){
	 *    statements 
	 *    }
	 *    else{
	 *     statements 
	 *     }
	 */
	
	// Example:
	// initialize an integer variable and verify the number. If the number is in
	// between
	// 1 and 100, then display "Number is small number".
	// if number is in between 101 and 1000, display : "Number is Medium number"
	// if number is between 1001 and 10000 display: "Number is big Number"
	// if number is more than 10000 then display : "Number is high Number"
	// otherwise display: "Number is either 0 or negative Number".

	public static void main(String[] args) {
		int x = 10;

		if ((x >= 1) && (x < 100)) {
			System.out.println("Number is small number");

		}

		else if ((x >= 101) && (x < 1000)) {
			System.out.println("Number is Medium number");
		} else if ((x >= 1001) && (x < 10000)) {
			System.out.println("Number is big number");
		} else if (x > 10000) {
			System.out.println("Number is high number");
		} else
			System.out.println("Number is either 0 or negative number");

	
	/*//Execute a block of statement when more than one condition is true. 
		//syntax
		if(condition){
			if(condition){
				if(condition){
					statements
				}
			}
		}
	
		
		Example: int a =10;
		int b=8;
		int c=7;
		int d=4;
		if(a>b){
			if(a>c){
				if(a<d){
					System.out.println("a is big number");
				}
			}
		}*/
		
	
	}
	
}
