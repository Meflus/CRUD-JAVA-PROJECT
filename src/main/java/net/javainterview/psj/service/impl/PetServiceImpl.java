package net.javainterview.psj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import net.javainterview.psj.service.PetService;
import net.javainterview.psj.entity.Pet;
import net.javainterview.psj.repository.PetRepository;


@Service
public class PetServiceImpl implements PetService{

	private PetRepository petRepository;
	
	public PetServiceImpl(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@Override
	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}

	@Override
	public Pet savePet(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public Pet getPetById(Long id) {
		return petRepository.findById(id).get();
	}

	@Override
	public Pet updatePet(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public void deletePetById(Long id) {
		petRepository.deleteById(id);
	}
	
}
