package step_definitions;
import dto.Owner;
import org.junit.Assert;

//import com.jayway.restassured.response.ResponseBody;


import dto.Pet;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonParseException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonMappingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.response.ResponseBody;
import support.MyConfig;
import support.SupportFunctions;
import support.TestContext;

public class OwnersStepDef {
	
	private TestContext testContext;
	public OwnersStepDef(TestContext testContext) {
		this.testContext = testContext;
	}
	 private static ResponseBody body;
	 @Given("^I have owner details for \"([^\"]*)\"$")
	 public void i_have_owner_details_for(String ownerLastName) throws Throwable {
	
		 body = SupportFunctions.get(MyConfig.Endpoint+"api/owners/*/lastname/"+ownerLastName);
	 
		 Owner[] owner = body.as(Owner[].class); // deserializing the JSON to Owner Class

		 this.testContext.setOwner(owner[0]);
	
	 }
}
