package com.zenithsky.oparea.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zenithsky.oparea.data.AirplaneData;
import com.zenithsky.oparea.domain.Airplane;

@Service 
public class AirplaneBusiness {
    private final AirplaneData airplaneData;

    public AirplaneBusiness(AirplaneData airplaneData) {
        this.airplaneData = airplaneData;
    }

    public List<Airplane> findAirplaneForType (int type){
        return airplaneData.findAllAirplanesForType(type);
    }

}
