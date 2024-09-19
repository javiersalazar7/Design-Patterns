package duckpackage;

public class DuckSimulator {
	
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
	
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		mallard.swim();
		
		System.out.println();
		
		Duck model = new ModelDuck();
		
		model.display();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		System.out.println();
		
		QuackBehavior call = new DuckCall();
		
		call.quack();
		

	}
}
