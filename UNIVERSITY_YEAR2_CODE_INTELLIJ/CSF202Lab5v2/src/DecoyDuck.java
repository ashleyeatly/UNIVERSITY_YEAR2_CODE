public class DecoyDuck extends Duck{
	// 5.1 9 constructors that are appropriate
	public DecoyDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new MuteQuack();
	}

	// 5.1 1 Remove fly and quack
//	@Override
//	public void fly()
//	{
//		System.out.println("Fly: CANNOT FLY");
//	}
//
//	@Override
//	public void quack()
//	{
//		System.out.println("Quack: I CANNOT QUACK");
//	}
	public void display()
	{
		System.out.println("Display: I only look like a duck!");
	}
}
