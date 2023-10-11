package support;

import dto.Owner;
import dto.Pet;
import dto.Specialty;
import dto.PetType;
import dto.Vet;

public class TestContext {

	private Owner owner;
	private PetType petType;
	private Pet pet;
	private Specialty specialty;
	private Vet vet;
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public PetType getType() {
		return petType;
	}
	public void setType(PetType petType) {
		this.petType = petType;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public Specialty getSpecialties() {
		return specialty;
	}
	public void setSpecialties(Specialty specialty) {
		this.specialty = specialty;
	}
	public Vet getVet() {
		return vet;
	}
	public void setVet(Vet vet) {
		this.vet = vet;
	}
	
	
}
