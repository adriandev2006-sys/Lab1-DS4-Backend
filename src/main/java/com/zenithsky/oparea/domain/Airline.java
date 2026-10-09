package com.zenithsky.oparea.domain;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private int airlineId; 
    private String iata; 
    private String airlineName; 
    private String baseAirport; 
    private List<Airplane> airplanes;

    public Airline() {
        this.airplanes = new ArrayList<>();
    }

    //Se usa este constructor para saber la información de la aerolínea de un avion
    //Sin la necesidad de ver la lista de aviones que tiene la aerolínea
    //Nota: No se usa para crear una aerolínea
    public Airline(int airlineId, String iata, String airlineName, String baseAirport) {
        this.airlineId = airlineId;
        this.iata = iata;
        this.airlineName = airlineName;
        this.baseAirport = baseAirport;
    }



    public Airline(int airlineId, String iata, String airlineName, String baseAirport, List<Airplane> airplanes) {
        this.airlineId = airlineId;
        this.iata = iata;
        this.airlineName = airlineName;
        this.baseAirport = baseAirport;
        this.airplanes = new ArrayList<>(airplanes);
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getBaseAirport() {
        return baseAirport;
    }

    public void setBaseAirport(String baseAirport) {
        this.baseAirport = baseAirport;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    } 

    

    
}
