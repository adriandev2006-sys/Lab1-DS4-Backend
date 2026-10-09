package com.zenithsky.oparea.data;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import com.zenithsky.oparea.domain.AirplaneType;

public class AirplaneTypeDataExtractor {
    public List<AirplaneType> findAllAirplaneType(ResultSet rs) throws SQLException{
        List<AirplaneType> airplaneTypes = new ArrayList(); 

        while(rs.next()){
            int typeId = rs.getInt(1); 
            String identifier = rs.getString(2); 
            String description = rs.getString(3); 
            AirplaneType airplaneType = new AirplaneType(typeId, identifier, description); 
            airplaneTypes.add(airplaneType); 
        }

        return airplaneTypes; 
    
    }; 
}
