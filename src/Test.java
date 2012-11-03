

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
			
			Animal animal = new Animal();
			Animal dog = new Dog();
			Animal cat = new Cat();
			
			animal.domir();
			animal.eat();
			
			dog.domir();
			dog.eat();
			((Dog)dog).speak();
			
			cat.domir();
			cat.eat();
			((Cat)cat).speak();			
			
		}
	}
}
