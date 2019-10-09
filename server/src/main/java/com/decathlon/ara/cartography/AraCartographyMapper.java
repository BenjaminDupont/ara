package com.decathlon.ara.cartography;

import com.decathlon.ara.service.dto.functionality.FunctionalityDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * AraCartographyMapper handles all serialization/deserialization of ARA functionalities to export/import feature.
 *
 * @author  Sylvain Nieuwlandt
 * @since 4.1.0
 */
@Slf4j
class AraCartographyMapper {

    private ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Serialize the given list of functionalities into a String representation (typically JSON).
     *
     * If an error occurs during the Serialization process, then log the exception in error level and return an empty
     * JSON object (which makes it easy to differentiate from an empty functionalities list which will return an empty
     * JSON array).
     *
     * @param functionalities the functionalities to serialize
     * @return the String representation of all the functionalities.
     */
    String asString(List<FunctionalityDTO> functionalities) {
        try {
            return objectMapper.writeValueAsString(functionalities);
        } catch (JsonProcessingException ex) {
            log.error("Unable to serialize the wanted cartography into an ARA export.", ex);
            return "{}";
        }
    }
}
