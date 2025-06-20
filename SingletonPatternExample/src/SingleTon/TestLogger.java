package SingleTon;

public class TestLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger1=Logger.getInstance();
		logger1.log("First Message");
		
		Logger logger2=Logger.getInstance();
		logger2.log("Second Message");
		
		if(logger1==logger2) {
			System.out.println("The instance are same. Singleton works!");
		}
		else {
			System.out.println("The instance are not same.");
		}

	}

}
