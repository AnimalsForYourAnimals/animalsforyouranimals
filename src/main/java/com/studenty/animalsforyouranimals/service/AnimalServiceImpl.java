package com.studenty.animalsforyouranimals.service;

import com.studenty.animalsforyouranimals.model.Animal;
import com.studenty.animalsforyouranimals.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sławomir Wójcik on 2018-05-31.
 */
@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    AnimalRepository animalRepository;

    Animal dog = new Animal();
    Animal cat = new Animal();
    Animal horse = new Animal();

    @Override
    public void addAnimals() {
        dog.setIdAnimal(1);
        dog.setName("Burek");
        horse.setDescripction("Lorem ipsum");
        dog.setPathImage("image/burek.jpg");
        animalRepository.save(dog);

        cat.setIdAnimal(2);
        cat.setName("Klakier");
        horse.setDescripction("Lorem ipsum");
        cat.setPathImage("image/klakier.jpg");
        animalRepository.save(cat);

        horse.setIdAnimal(2);
        horse.setName("Klakier");
        horse.setDescripction("Lorem ipsum");
        horse.setPathImage("image/klakier.jpg");
        animalRepository.save(horse);
    }
}
