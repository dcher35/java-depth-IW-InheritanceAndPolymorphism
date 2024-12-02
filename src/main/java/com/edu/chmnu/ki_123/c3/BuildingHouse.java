package com.edu.chmnu.ki_123.c3;

public class BuildingHouse {
    public static void main(String[] args) {
        House.IndividualHouse individualHouse = new House.IndividualHouse(2, "Gable", 5, true);
        House.ApartmentBuilding apartmentBuilding = new House.ApartmentBuilding(10, "Flat", 40);
        House.Cottage cottage = new House.Cottage(2, "Hip", 7, true, true);

        System.out.println(individualHouse);
        System.out.println(apartmentBuilding);
        System.out.println(cottage);
    }
}