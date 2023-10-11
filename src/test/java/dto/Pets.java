package dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

public class Pets {

	
	private int id;
    private String name;
    private String birthDate;
    private PetType petType;

    private int owner;
    @JsonIgnore
    private ArrayList<Visit> visits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getType() {
        return petType;
    }

    public void setType(PetType petType) {
        this.petType = petType;
    }


    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public void setVisits(ArrayList<Visit> visits) {
        this.visits = visits;
    }

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}
}
