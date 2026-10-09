package com.zenithsky.oparea.domain;

public class Airplane {
    private int airplaneId; 
    private int capacity; 
    private Airline arline; 
    private AirplaneType airplaneType;

    public Airplane() {
    }

    public Airplane(int airplaneId, int capacity, Airline arline, AirplaneType airplaneType) {
        this.airplaneId = airplaneId;
        this.capacity = capacity;
        this.arline = arline;
        this.airplaneType = airplaneType;
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Airline getArline() {
        return arline;
    }

    public void setArline(Airline arline) {
        this.arline = arline;
    }

    public AirplaneType getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(AirplaneType airplaneType) {
        this.airplaneType = airplaneType;
    }

    

}