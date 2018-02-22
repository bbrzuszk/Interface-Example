package com.PSHS;

public abstract class Room implements PaintPrep {

    private int length, width, height;

    public Room(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getRoomPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    @Override
    public double getWallArea() {
        return getRoomPerimeter() * this.height;
    }

    @Override
    public double getCeilingArea() {
        return this.length * this.width;
    }
}
