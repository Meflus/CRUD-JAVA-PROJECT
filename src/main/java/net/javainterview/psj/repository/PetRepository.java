package net.javainterview.psj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javainterview.psj.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
