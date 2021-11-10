public abstract class Duck{

	// 5.1.7 protected fly and quack behaviour
	protected FlyBehaviour flyBehaviour;

	protected QuackBehaviour quackBehaviour;

	// 5.1 1 Remove fly and quack
	// Default fly method
//	public void fly()
//	{
//		System.out.println("Fly: Zooms through the air gracefully.");
//	}
//
//	public void quack()
//	{
//		System.out.println("Quack: Quack");
//	}
	// 5.1.8
	public void performFly() {
		flyBehaviour.fly();
	}

	// 5.1.8
	public void performQuack() {
		quackBehaviour.quack();
	}

	public abstract void changeFly(FlyBehaviour behaviour);

	public abstract void changeQuack(QuackBehaviour behaviour);

	public abstract void display();
}
