package net.javainterview.psj.service;

import java.util.List;
import net.javainterview.psj.entity.Pet;

public interface PetService {
	List<Pet> getAllPets();
	
	Pet savePet(Pet pet);
	
	Pet getPetById(Long id);
	Pet updatePet(Pet pet);
	
	void deletePetById(Long id);
}
