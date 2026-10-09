package com.zenithsky.oparea.controllerRest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zenithsky.oparea.business.AirplaneBusiness;
import com.zenithsky.oparea.domain.Airplane;

@RestController 
@RequestMapping ("/airplane")
public class AirplaneRestController {

    private final AirplaneBusiness airplaneBusiness;

    public AirplaneRestController(AirplaneBusiness airplaneBusiness) {
        this.airplaneBusiness = airplaneBusiness;
    }

    @GetMapping("/findAllForType")
    public ResponseEntity<List<Airplane>> findAllAirplanesForType(@RequestParam("type") int type){
        List<Airplane> airplanes = airplaneBusiness.findAirplaneForType(type);
        return ResponseEntity.ok(airplanes);
    }

}
