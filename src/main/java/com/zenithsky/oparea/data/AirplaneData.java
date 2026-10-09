package com.zenithsky.oparea.data;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zenithsky.oparea.domain.Airplane;

@Repository 
public class AirplaneData {
    private final JdbcTemplate jdbcTemplate;

    public AirplaneData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Airplane> findAllAirplanesForType(int typeId){

        //Debe traerme toda la información del avión, incluyendo la aerolínea y el tipo de avión
        //Eso lo logro con un INNER JOIN entre las tablas Airplane, Airline y AirplaneType
        String sql = """
             SELECT 
                a.airplane_id,
                a.capacity,
                b.type_id, 
                b.identifier,
                b.description,
                c.airline_id, 
                c.iata, 
                c.airlinename, 
                c.base_airport
            FROM airplane a INNER JOIN airplane_type b 
            ON a.type_id = b.type_id LEFT JOIN airline c 
            ON a.airline_id = c.airline_id WHERE a.type_id = ?""";

        return jdbcTemplate.query(
            sql, new AirplaneDataExtractor()::findAirplanesForType,
            typeId
        );


    }
}
