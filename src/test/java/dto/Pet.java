package dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

public class Pet {
    private int id;
    private String name;
    private String birthDate;
    private PetType petType;
    private Owner owner;
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public void setVisits(ArrayList<Visit> visits) {
        this.visits = visits;
    }




}
