package stepdefinitions;
import org.junit.runner.RunWith;






@RunWith(Cucmber.class);
@CucumberOptions(features="classpath:Test1.feature", glue = "stepdefinitions", plugin= {"html:target/test-report"} )
public class Registration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
