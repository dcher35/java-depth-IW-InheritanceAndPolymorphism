package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuildingHouseTest {
    @Test
    public void testIndividualHouse() {
        House.IndividualHouse house = new House.IndividualHouse(2, "Gable", 5, true);

        assertEquals(2, house.getFloors());
        assertEquals("Gable", house.getRoofType());
        assertEquals(5, house.getRoomsOrApartments());

        assertTrue(house.hasGarden());
    }

    @Test
    public void testApartmentBuilding() {
        House.ApartmentBuilding building = new House.ApartmentBuilding(10, "Flat", 40);

        assertEquals(10, building.getFloors());
        assertEquals("Flat", building.getRoofType());
        assertEquals(40, building.getApartments());
    }

    @Test
    public void testCottage() {
        House.Cottage cottage = new House.Cottage(2, "Hip", 7, true, true);

        assertEquals(2, cottage.getFloors());
        assertEquals("Hip", cottage.getRoofType());
        assertEquals(7, cottage.getRoomsOrApartments());

        assertTrue(cottage.hasGarden());
        assertTrue(cottage.hasPool());
    }

    @Test
    public void testToStringMethods() {
        House.IndividualHouse house = new House.IndividualHouse(2, "Gable", 5, true);
        House.ApartmentBuilding building = new House.ApartmentBuilding(10, "Flat", 40);
        House.Cottage cottage = new House.Cottage(2, "Hip", 7, true, true);

        assertEquals("IndividualHouse {floors = 2, roofType = Gable, rooms = 5, hasGarden = true}", house.toString());
        assertEquals("ApartmentBuilding {floors = 10, roofType = Flat, apartments = 40}", building.toString());
        assertEquals("Cottage {floors = 2, roofType = Hip, rooms = 7, hasGarden = true, hasPool = true}", cottage.toString());
    }
}
