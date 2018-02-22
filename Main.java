package com.PSHS;

public class Main {

    public static void main(String[] args) {

        PaintRoom room = new PaintRoom(12,14, 8, 27, 250);

        System.out.println("Num Gallons: " + room.getNumGallons());
        System.out.println("Cost: " + room.getProjectCost());

    }
}
