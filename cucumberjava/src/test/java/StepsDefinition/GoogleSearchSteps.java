package StepsDefinition;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
WebDriver driver;
@Given("broser is launched")
public void broser_is_launched() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("driver.chrome.driver", "C:\\Users\\smite\\git\\Cucumber_Project\\cucumberjava\\src\\test\\resources\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@And("user is on google page")
public void user_is_on_google_page() {
    // Write code here that turns the phrase above into concrete actions
	driver.get("https://www.google.com/?zx=1771866335769&no_sw_cr=1");
   driver.manage().window().maximize();
}

@When("user enters text in search box")
public void user_enters_text_in_search_box() {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("automation step by step");
}

@And("hits enter")
public void hits_enter() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.ENTER);
}

@Then("user is navigated to test results")
public void user_is_navigated_to_test_results() {
    // Write code here that turns the phrase above into concrete actions
   
}

}
