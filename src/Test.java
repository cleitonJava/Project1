

public class Test
{
	public static void main(String arg[])
	{
		System.out.println("hello");
		for (int i = 0; i < 20; ++i)
		{
			if (i%2 ==0)
				System.out.print(i + " ");
			
			System.out.println("End of the process");
			
			Animal a1 = new Animal();
			Animal a2 = new Dog();
			Animal a3 = new Cat();
			
			a1.domir();
			a1.eat();
			
			a2.domir();
			a2.eat();
			((Dog)a2).speak();
			
			a3.domir();
			a3.eat();
			((Cat)a3).speak();			
			
		}
	}
}
