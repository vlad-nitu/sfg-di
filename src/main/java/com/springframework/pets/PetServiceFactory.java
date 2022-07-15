package com.springframework.pets;

public class PetServiceFactory { //i.e: 3rd party utility
    public PetService getPetService(String petType) {
        switch (petType) {
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
