package net.javainterview.psj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javainterview.psj.entity.Pet;
import net.javainterview.psj.repository.PetRepository;

@SpringBootApplication
public class PetshopjavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PetshopjavaApplication.class, args);
	}

	@Autowired
	private PetRepository petRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Pet pet1 = new Pet("MONTANHA", "Silvio", 3); petRepository.save(pet1);
		 * Pet pet2 = new Pet("Shelda", "Mateus", 15); petRepository.save(pet2);
		 * Pet pet3 = new Pet("Lupin", "Thuane", 3); petRepository.save(pet3);
		*/

	}

}
