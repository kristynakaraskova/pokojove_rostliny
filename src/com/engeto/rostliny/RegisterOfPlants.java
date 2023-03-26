package com.engeto.rostliny;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterOfPlants {
    private List<Plant> plants = new ArrayList<>();

    public void addPlant(Plant newPlant) {
        plants.add(newPlant);
    }
    // Metoda pro přidání rostliny do seznamu

    public void removePlant(Plant plant) {
        plants.remove(plant);
    }
    // Metoda pro odebrání rostliny ze seznamu

    Scanner scanner = new Scanner(fileRostliny);
    while (scanner.hasNextLine())




}
