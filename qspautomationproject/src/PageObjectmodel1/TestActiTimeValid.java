package PageObjectmodel1;

public class TestActiTimeValid {
	

	public static void main(String[]args) {
		
		BaseTest bt = new BaseTest();
		bt.setup();
		Flib flib = new Flib();
		
		
		
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validpaswsord = flib.readPropertyfile(PROP_PATH, "password");
		
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.actitimevalidLogin(validUsername,validPassword);
		
		bt.teardown();
			
		
	}

}
