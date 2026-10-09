package com.zenithsky.oparea.data;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zenithsky.oparea.domain.AirplaneType;

@Repository 
public class AirplaneTypeData {

    private final JdbcTemplate jdbcTemplate;

    public AirplaneTypeData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //Debe devolverme todos los tipos de avión que existen en la base de datos 

    public List<AirplaneType> findAllAirplaneType(){
        String sqlInstruction = "SELECT type_id, identifier, description FROM airplane_type"; 
    
        return jdbcTemplate.query(
            sqlInstruction, new AirplaneTypeDataExtractor()::findAllAirplaneType); 
    }
}
