package com.studenty.animalsforyouranimals.repository;

import com.studenty.animalsforyouranimals.model.Animal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sławomir Wójcik on 2018-06-02.
 */
public interface AnimalRepository  extends CrudRepository<Animal,Long> {
}
