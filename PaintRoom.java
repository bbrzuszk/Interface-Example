package com.PSHS;

public class PaintRoom extends Room {

    private double costPerGallon, coveragePerGallon;

    public PaintRoom(int length, int width, int height, double costPerGallon, double coveragePerGallon) {
        super(length, width, height);
        this.costPerGallon = costPerGallon;
        this.coveragePerGallon = coveragePerGallon;
    }

    public double getNumGallons(){
        double paintableArea = super.getCeilingArea() + super.getWallArea();
        return Math.ceil(paintableArea / coveragePerGallon);
        
    }
    
    public double getProjectCost(){
        return costPerGallon * getNumGallons();
    }
}
