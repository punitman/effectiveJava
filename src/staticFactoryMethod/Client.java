package staticFactoryMethod;

public class Client {

	public static void main(String[] args) {
				
		RandomIntGenerator randomIntGenerator = RandomIntGenerator.between(10, 100);
		System.out.println("Random number between 10 and 100: " + randomIntGenerator.getRandomInt());		

		RandomIntGenerator randomIntGenerator2 = RandomIntGenerator.biggerThan(100);
		System.out.println("Random number greater than or equal to 100: " + randomIntGenerator2.getRandomInt());
		
		RandomIntGenerator randomIntGenerator3 = RandomIntGenerator.smallerThan(10);
		System.out.println("Random number less than or equal to 10: " + randomIntGenerator3.getRandomInt());
		
	}

}
