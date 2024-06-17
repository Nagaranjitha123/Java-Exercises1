package june;
import java.util.*;
public class Simple {
	int a;
	void get()
	{
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
	}
	void inc()
	{
		a=a+5;
	}
	void dis()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {

Simple s = new Simple();
s.get();
s.inc();
s.dis();
	}

}