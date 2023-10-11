package dto;

import java.util.List;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonCreator;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;


public class Owner { //POJO Classes
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String telephone;
    private List<Pets> pets;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

	public List<Pets> getPets() {
		return pets;
	}

	public void setPets(List<Pets> pets) {
		this.pets = pets;
	}
}
