import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@org.junit.jupiter.api.Test
	void test() {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $"+beverage.cost());
		
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " $"+beverage.cost());
		Beverage beverage2 = new HouseBlend();
		System.out.println(beverage2.getDescription() + " $"+beverage2.cost());
		
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $"+beverage2.cost());
	}

}
