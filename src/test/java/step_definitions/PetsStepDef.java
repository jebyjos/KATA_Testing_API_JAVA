package step_definitions;

import dto.Owner;
//import com.jayway.restassured.response.ResponseBody;
import dto.Pet;
import dto.Pets;
import dto.PetType;
import dto.Visit;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ResponseBody;

import org.junit.Assert;
import support.MyConfig;
import support.SupportFunctions;
import support.TestContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PetsStepDef {

    private static ResponseBody body;
    private TestContext testContext;
	public PetsStepDef(TestContext testContext) {
		this.testContext = testContext;
		}
    
    @Given("^I have pet category for \"([^\"]*)\"$")
	 public void i_have_pet_category_for(String petCat) throws Throwable {

    	body = SupportFunctions.get(MyConfig.Endpoint+"api/pettypes");
    	PetType[] petTypes = body.as(PetType[].class);
    	PetType petCategory = null;
    	for(PetType petType : petTypes){

    		if(petType.getName().equalsIgnoreCase(petCat)){
    			petCategory=petType;
    			break;
    		}
    	}

    	this.testContext.setType(petCategory);
	 }

    @When("^I want to know all the pets in the clinic$")
    public void i_want_to_know_all_the_pets_in_the_clinic() throws Throwable {
        body = SupportFunctions.get(MyConfig.Endpoint + "api/pets");
        System.out.println(body.asString());

    }
    @When("^I add a new pet \"([^\"]*)\" with birthday \"([^\"]*)\"$")
	 public void i_add_a_new_pet_with_birthday(String petName, String petBday) throws Throwable {

    	Pet petToAdd = new Pet();
    	petToAdd.setBirthDate(petBday);
    	petToAdd.setName(petName);
    	petToAdd.setOwner(this.testContext.getOwner());
    	petToAdd.setType(this.testContext.getType());
    	petToAdd.setVisits(new ArrayList<Visit>());
    	SupportFunctions.post(MyConfig.Endpoint +"api/pets", petToAdd);

	 }

	 
    @Then("^I should receive 13 pets$")
    public void i_should_receive_pets() throws Throwable {
        Pet[] petsDTO = SupportFunctions.convertResponseArray(Pet[].class);
        int amountOfPets = petsDTO.length;
        Assert.assertEquals("the amount of pets is 13 | ",13,amountOfPets);
    }

}
