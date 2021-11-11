public class RubberDuck extends Duck{
	// 5.1 9 constructors that are appropriate
	public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}

	// 5.1 1 Remove fly and quack
//	@Override
//	public void quack()
//	{
//		System.out.println("Quack: Squeeeeek");
//	}
//
//	@Override
//	public void fly()
//	{
//		System.out.println("Fly: I CANNOT FLY");
//	}

	public void display()
	{
		System.out.println("Display: I look like a majestic yellow plastic duck.");
	}
}
