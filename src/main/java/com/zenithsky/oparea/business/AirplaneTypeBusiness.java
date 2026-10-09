package com.zenithsky.oparea.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zenithsky.oparea.data.AirplaneTypeData;
import com.zenithsky.oparea.domain.AirplaneType;

@Service 
public class AirplaneTypeBusiness {
    private final AirplaneTypeData airplaneTypeData;

    public AirplaneTypeBusiness(AirplaneTypeData airplaneTypeData) {
        this.airplaneTypeData = airplaneTypeData;
    }

    public List<AirplaneType> findAll(){
        return airplaneTypeData.findAllAirplaneType();
    }
}
