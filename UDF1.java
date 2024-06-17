
package functions;
import java.util.Scanner;
public class UDF1 {
    public void add()
    {
    	int a,b,c;
    	System.out.println("Enter 2 numbers");
    	Scanner sc= new Scanner(System.in);
    	a=sc.nextInt();
    	b = sc.nextInt();
    	c=a+b;
    	System.out.println(a+"+"+b+"="+c);
    }
                
public static void main(String[] args) {
		UDF1 obj = new UDF1();
		obj.add();
		
    }

}
// function without parameter and without return type
