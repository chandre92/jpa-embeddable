package com.example.embeddable;

import com.example.embeddable.dao.PersonRepository;
import com.example.embeddable.model.Address;
import com.example.embeddable.model.Building;
import com.example.embeddable.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmbeddableApplication implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmbeddableApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.name = "foobar";
        person.mainAddress = new Address();

        person.mainAddress.building = new Building();
        person.mainAddress.building.entranceNumber = 1;
        person.mainAddress.building.buildingNumber = 2;
        person.mainAddress.street = "some street";

        personRepository.saveAndFlush(person);
    }
}
