package com.engeto.rostliny;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlantsList {
    private List<Plants> dataList = new ArrayList<>();

    public void addAllFromFile(String filename) throws PlantException {
        long lineNumber = 0;
        String[] items = new String[0];
        String line = "";
        try (Scanner scanner =
                     new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {
                lineNumber++;
                line = scanner.nextLine();
                items = line.split(";");
                if (items.length != 4) throw new PlantException("Špatný počet položek na řádku číslo "+lineNumber);

}
