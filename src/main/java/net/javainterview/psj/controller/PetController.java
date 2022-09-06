package net.javainterview.psj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javainterview.psj.entity.Pet;
import net.javainterview.psj.service.PetService;

@Controller
public class PetController {
	
	private PetService petService;

	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}
	
	@GetMapping("/pets")
	public String listPets(Model model ) {
		model.addAttribute("pets", petService.getAllPets());
		return "pets";
		
	}
	
	@GetMapping("/pet/new")
	public String createPetForm(Model model) {
		
		Pet pet = new Pet();
		model.addAttribute("pet", pet);
		return "create_pet";
	}
	
	@PostMapping("/pets")
	public String savePet(@ModelAttribute("pet") Pet pet) {
		petService.savePet(pet);
		return "redirect:/pets";
		
	}
	
	@GetMapping("/pets/edit/{id}")
	public String editPetForm(@PathVariable Long id, Model model) {
		model.addAttribute("pet", petService.getPetById(id));
		return "edit_pet";
	}
	
	@PostMapping("/pets/{id}")
	public String updatePet(@PathVariable Long id,
			@ModelAttribute("pet") Pet pet,
			Model model) {
		
		Pet existingPet = petService.getPetById(id);
		existingPet.setId(id);
		existingPet.setPetName(pet.getPetName());
		existingPet.setOwnerName(pet.getOwnerName());
		existingPet.setAge(pet.getAge());
		
		petService.updatePet(existingPet);
		return "redirect:/pets";
		
	}

	@GetMapping("/pets/{id}")
	public String deletePet(@PathVariable Long id) {
		petService.deletePetById(id);
		return "redirect:/pets";
	}
}
