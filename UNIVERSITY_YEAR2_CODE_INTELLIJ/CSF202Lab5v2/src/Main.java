import java.util.ArrayList;
import java.util.Collection;

public class Main{

	private Collection<Duck> myDucks = new ArrayList<>();

	public void makeSomeDucks()
	{
		// Make some different ducks
		Duck mallardDuck = new MallardDuck();
		Duck redheadDuck = new RedheadDuck();
		Duck rubberDuck = new RubberDuck();
		Duck decoyDuck = new DecoyDuck();
		Duck baldDuck = new BaldDuck();

		myDucks.add(mallardDuck);
		myDucks.add(rubberDuck);
		myDucks.add(redheadDuck);
		myDucks.add(decoyDuck);
		myDucks.add(baldDuck);

		for(Duck d : myDucks)
		{
			System.out.println("Type of Duck" + d.toString());
			d.display();
			d.performFly();
			d.performQuack();
		}
		QuackBehaviour quackBehaviour = new Fart();
		baldDuck.setQuackBehaviour(quackBehaviour);
		FlyBehaviour flyBehaviour = new FlyOneWing();
		baldDuck.setFlyBehaviour(flyBehaviour);
		for(Duck d : myDucks)
		{
			System.out.println("Type of Duck" + d.toString());
			d.display();
			d.performFly();
			d.performQuack();
		}
	}

	// --------------- Ignore below this ----------------
	public static void main(String[] args)
	{
		Main main = new Main();
		main.makeSomeDucks();
	}
}
