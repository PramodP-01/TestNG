package testngpack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void login() {
		System.out.println("working testng");
	}

	@Parameters({ "username" })
	@Test
	public void carlogin(String usn) {
		System.out.println(usn);

	}

	@Test
	public void mobileloan() {
		System.out.println("This is mobile load");
	}

	@Test
	public void homeloan() {
		System.out.println("This is homeloan");
	}

}
