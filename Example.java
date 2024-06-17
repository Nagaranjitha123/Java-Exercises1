package constructs;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		System.out.println("Enter b value:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
		int result;
		switch (operator){
		 case'+':
			result=a+b;
			break;
		 case'-':
				result=a-b;
				break;
		 case'*':
				result=a*b;
				break;
		 case'/':
				result=a/b;
				break;
		 default:
             System.out.println("Error! Invalid operator.");
             return;
			
		}
		System.out.println(result);
		
	}

}
