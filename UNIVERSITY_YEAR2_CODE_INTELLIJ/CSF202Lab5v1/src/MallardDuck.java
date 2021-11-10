public class MallardDuck extends Duck{
	// 5.1.1 there were no fly and quack methods
	// 5.1 9 constructors that are appropriate

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void changeFly(FlyBehaviour behaviour) {

	}

	@Override
	public void changeQuack(QuackBehaviour behaviour) {

	}

	public void display()
	{
		System.out.println("Display: I look like a lovely Mallard Duck");
	}
}
