public class BaldDuck extends Duck{
	// 5.1.1 there were no fly and quack methods
	// 5.1 9 constructors that are appropriate

	public BaldDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void setFlyBehaviour(FlyBehaviour behaviour) {
		flyBehaviour = behaviour;

	}

	@Override
	public void setQuackBehaviour(QuackBehaviour behaviour) {
		quackBehaviour = behaviour;
	}

	public void display()
	{
		System.out.println("Display: I look like a lovely Mallard Duck");
	}
}
