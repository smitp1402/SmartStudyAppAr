package com.amitvikram.smartstudyapp.model;

public class
Planet {

    private String planetName;
    private int distanceFromSun;
    private int gravity;
    private int diameter;
    private int planetNo;
    public Planet(String planetName, int distanceFromSun, int gravity, int diameter, int planetNo) {
        this.planetName = planetName;
        this.distanceFromSun = distanceFromSun;
        this.gravity = gravity;
        this.diameter = diameter;
        this.planetNo = planetNo;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(int distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getPlanetNo() { return planetNo;}

    public void setPlanetNo(int planetNo) {this.planetNo = planetNo;}
}
