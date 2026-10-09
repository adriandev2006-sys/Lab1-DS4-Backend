package com.zenithsky.oparea.controllerRest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zenithsky.oparea.business.AirplaneTypeBusiness;
import com.zenithsky.oparea.domain.AirplaneType;

@RestController
@RequestMapping("/airplaneType")
public class AiplaneTypeRestController {

    private final AirplaneTypeBusiness airplaneTypeBusiness;

    public AiplaneTypeRestController(AirplaneTypeBusiness airplaneTypeBusiness) {
        this.airplaneTypeBusiness = airplaneTypeBusiness;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<AirplaneType>> findAllAirplanesType(){
        List<AirplaneType> airplaneTypes = airplaneTypeBusiness.findAll();
        return ResponseEntity.ok(airplaneTypes);
    }

}
