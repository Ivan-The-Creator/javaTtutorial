package firstProject;

public class overloadedConstructors {
	
	public static void main(String[] args) {
		
		bcPizza pizza = new bcPizza("thicc crust","tomato","mozzarella","pepperoni");
		bcPizza pizzaToo = new bcPizza("thicc crust","tomato","mozzarella");
		
		System.out.println("here are the pizza ingredients: ");
		System.out.println("bread: "+pizza.bread);
		System.out.println("sauce: "+pizza.sauce);
		System.out.println("cheese: "+pizza.cheese);
		System.out.println("topping: "+pizza.topping);
		
		System.out.println("here are the pizza ingredients: ");
		System.out.println("bread: "+pizzaToo.bread);
		System.out.println("sauce: "+pizzaToo.sauce);
		System.out.println("cheese: "+pizzaToo.cheese);
		
	}
	
}