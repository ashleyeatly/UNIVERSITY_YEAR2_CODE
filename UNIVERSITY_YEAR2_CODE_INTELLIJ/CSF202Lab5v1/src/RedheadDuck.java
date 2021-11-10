public class RedheadDuck extends Duck{
	// 5.1.1 there were no fly and quack methods
	// 5.1 9 constructors that are appropriate

	@Override
	public void changeFly(FlyBehaviour behaviour) {

	}

	@Override
	public void changeQuack(QuackBehaviour behaviour) {

	}

	public RedheadDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	public void display()
	{
		System.out.println("Display: I look like a Duck with a nice red head.");
	}
}
