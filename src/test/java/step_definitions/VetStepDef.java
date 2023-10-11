package step_definitions;

import java.util.ArrayList;
import java.util.List;

import dto.Pet;
import dto.Specialty;
import dto.Vet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ResponseBody;
import support.MyConfig;
import support.SupportFunctions;
import support.TestContext;

public class VetStepDef {
	 private static ResponseBody body;
	 private String vetFirstName;
	    private String vetLastName;
	    private Specialty spec;
	    private int vetSpecialityId;
	    private int responseStatus;
	    private TestContext testContext;
	    public VetStepDef(TestContext testContext) {
			this.testContext = testContext;
			}

	    @Given("I have a new vet {string} {string}")
	    public void i_have_a_new_vet(String fname, String lname) {
	        vetFirstName = fname;
	        vetLastName = lname;
	    }
	    
	 
	    @Given("I have the speciality {string}")
	    public void i_have_the_speciality(String specialityid) {
	
	     body = SupportFunctions.get(MyConfig.Endpoint+"api/specialties/"+specialityid);
	     spec = body.as(Specialty.class);
	     spec.getName();

	     
	 }
	 @When("I add the new vet")
	    public void i_add_the_new_vet() {
	        
		 Vet vetToAdd = new Vet();
		 vetToAdd.setFirstName(vetFirstName);
		 vetToAdd.setLastName(vetLastName);
		 List<Specialty> specs = new ArrayList<>();
		 specs.add(spec);
		 vetToAdd.setSpecialties(specs);
		 SupportFunctions.post(MyConfig.Endpoint +"api/vets", vetToAdd);

		 
	    }

	  
	
}
