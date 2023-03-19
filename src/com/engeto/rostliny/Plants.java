package com.engeto.rostliny;

import java.time.LocalDate;

import static java.time.LocalTime.now;

public class Plants  implements Comparable<Plants> {

    ///region Atributy
    private String name;
    private String notes;
    private LocalDate planted;
    private LocalDate watering;
    private int frequencyOfWatering;

    ///endregion

    ///region Konstruktory

    public Plants(String name, String notes, LocalDate planted, LocalDate watering, int frequencyOfWatering) {
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.watering = watering;
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public Plants(String name, LocalDate planted, int frequencyOfWatering) {
        this.name = name;
        this.notes = null;
        this.planted = planted;
        this.watering = LocalDate.now();
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public Plants(String name) {
        this.name = name;
        this.notes = null;
        this.planted = LocalDate.now();
        this.watering = LocalDate.now();
        this.frequencyOfWatering = 7;
    }


    ///endregion

    ///region Přístupové metody

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public void setFrequencyOfWatering(int frequencyOfWatering) throws PlantException {
        if (frequencyOfWatering <= 0) {
            throw new PlantException("Frekvence zálivky je neplatná, nesmí být 0 či záporné číslo" +" (zadal jsi : "+frequencyOfWatering+")");
        }
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }

    public void setWatering(LocalDate watering) throws PlantException {
        if (watering.isBefore(planted)) {
            throw new PlantException("Datum poslední zálivky nesmí být starší než datum zasazení rostliny.");
        }
        this.watering = watering;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public String getWateringInfo() {
        LocalDate nextWatering = getWatering().plusDays(getFrequencyOfWatering());
        return  getName() + ": naposled zalita " + getWatering() + ", další zálivka: " + nextWatering;
    }

    @Override
    public int compareTo(Plants second) {
        return this.name.compareTo(second.name);
    }
}

    ///endregion



