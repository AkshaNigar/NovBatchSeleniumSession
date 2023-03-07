import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageTest {

	@BeforeSuite

	public void dataBaseConnection() {
		System.out.println("BT");
	}

	@BeforeMethod

	public void setup() {
		System.out.println("BM");
	}

	@Test

	public void titleTest() {
		System.out.println("title");
	}

	@AfterSuite

	public void Logout() {
		System.out.println("logout");
	}

	@AfterMethod

	public void teardown() {
		System.out.println("browser closed");
	}

}
