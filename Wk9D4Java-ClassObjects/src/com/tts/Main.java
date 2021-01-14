package com.tts;

import com.tts.pets.Pet;
import com.tts.plants.Shrub;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Pet myPet = new Pet("Sami", 5, "Louisiana");
        String megsPet = myPet.getName();
        System.out.println(megsPet);

        Pet yourPet = new Pet("Scout", 4, "Louisiana");
        System.out.println(yourPet.getName() + yourPet.getAge());

        Shrub myRose = new Shrub("Tyler", 4, "Antique");
        System.out.println("Our cheapest rose: The " + myRose.getName());
        System.out.println("It's height is: " + myRose.getHeight() +  " inches");
        System.out.println("It's variety is: " + myRose.getType());
    }

}
