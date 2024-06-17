package june;
class One
{
	static class OneNested
	{
		void show()
		{
			System.out.println("Static inner class");
		}
	}
}
class Two
{
	class TwoNested
	{
		void call()
		{
			System.out.println("Non Static inner class");
		}
	}
}
class Three
{
	void threeFun()
	{
		class ThreeNested
		{
			void display()
			{
				System.out.println("Local Inner Class");
			}
		}
		ThreeNested trn = new ThreeNested();
		trn.display();
	}
}
//Driver Class
public class Sample {

	public static void main(String[] args) 
	{
		One oneOb =  new One();
		One.OneNested on = new One.OneNested();
		on.show();
		Two twoOb = new Two();
		Two.TwoNested tn = twoOb.new TwoNested();
		tn.call();
		Three threeOb = new Three();
		threeOb.threeFun();
	}
}