package com.zenithsky.oparea.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zenithsky.oparea.domain.Airline;
import com.zenithsky.oparea.domain.Airplane;
import com.zenithsky.oparea.domain.AirplaneType;

public class AirplaneDataExtractor {
    public List<Airplane> findAirplanesForType(ResultSet rs) throws SQLException {
        List<Airplane> airplanes = new ArrayList<>();
        
        while(rs.next()){
            int airplaneId = rs.getInt(1);
            int capacity = rs.getInt(2);
            int typeId = rs.getInt(3);
            String identifier = rs.getString(4);
            String description = rs.getString(5);
            int airlineId = rs.getInt(6);
            String iata = rs.getString(7);
            String airlineName = rs.getString(8);
            String baseAirport = rs.getString(9);

            Airline airline = new Airline(airlineId, iata, airlineName, baseAirport);
            AirplaneType airplaneType = new AirplaneType(typeId, identifier, description);
            Airplane airplane = new Airplane(airplaneId, capacity, airline, airplaneType);
            airplanes.add(airplane);
        }
        return airplanes; 
        
    }

}
