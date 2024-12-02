package com.edu.chmnu.ki_123.c3;

public class House {
    private final int floors;
    private final String roofType;
    private final int roomsOrApartments;

    public House(int floors, String roofType, int roomsOrApartments) {
        this.floors = floors;
        this.roofType = roofType;
        this.roomsOrApartments = roomsOrApartments;
    }

    public int getFloors() {
        return floors;
    }

    public String getRoofType() {
        return roofType;
    }

    public int getRoomsOrApartments() {
        return roomsOrApartments;
    }

    @Override
    public String toString() {
        return "House {" + "floors = " + floors + ", roofType = " + roofType + ", roomsOrApartments = " + roomsOrApartments + "}";
    }

    public static class IndividualHouse extends House {
        private final boolean hasGarden;

        public IndividualHouse(int floors, String roofType, int rooms, boolean hasGarden) {
            super(floors, roofType, rooms);
            this.hasGarden = hasGarden;
        }

        public boolean hasGarden() {
            return hasGarden;
        }

        @Override
        public String toString() {
            return "IndividualHouse {" + "floors = " + getFloors() + ", roofType = " + getRoofType() + ", rooms = " + getRoomsOrApartments() + ", hasGarden = " + hasGarden + "}";
        }
    }

    public static class ApartmentBuilding extends House {
        private final int apartments;

        public ApartmentBuilding(int floors, String roofType, int apartments) {
            super(floors, roofType, apartments);
            this.apartments = apartments;
        }

        public int getApartments() {
            return apartments;
        }

        @Override
        public String toString() {
            return "ApartmentBuilding {" + "floors = " + getFloors() + ", roofType = " + getRoofType() + ", apartments = " + apartments + "}";
        }
    }

    public static class Cottage extends IndividualHouse {
        private final boolean hasPool;

        public Cottage(int floors, String roofType, int rooms, boolean hasGarden, boolean hasPool) {
            super(floors, roofType, rooms, hasGarden);
            this.hasPool = hasPool;
        }

        public boolean hasPool() {
            return hasPool;
        }

        @Override
        public String toString() {
            return "Cottage {" + "floors = " + getFloors() + ", roofType = " + getRoofType() + ", rooms = " + getRoomsOrApartments() + ", hasGarden = " + hasGarden() + ", hasPool = " + hasPool + "}";
        }
    }
}