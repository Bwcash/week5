
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Logger logger = new AsteriskLogger();
		logger.log("Thank You");
		logger.error("Hello");
	 
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Sammy");
		logger2.error("Bryce");
	}

}
