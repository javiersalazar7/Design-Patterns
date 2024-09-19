package duckpackage;

public class ModelDuck extends Duck{
	
	public ModelDuck() { 
		
		flyBehavior = new NoFly();
		quackBehavior = new MuteQuack();
		
	}

	@Override
	public void display() {
		System.out.println("I am a model Duck!");
		
	}

}
