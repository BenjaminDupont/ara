package com.decathlon.ara.cartography;

import com.decathlon.ara.ci.bean.QualityThreshold;
import com.decathlon.ara.common.NotGonnaHappenException;
import com.decathlon.ara.service.dto.functionality.FunctionalityDTO;
import com.decathlon.ara.service.dto.quality.QualitySeverityDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class AraExporter extends Exporter {

    private AraCartographyMapper MAPPER = new AraCartographyMapper();

    @Override
    public String getName() {
        return "ARA";
    }

    @Override
    public String getDescription() {
        return "Export this cartography to import it in another ARA project";
    }

    @Override
    public String getFormat() {
        return "json";
    }

    @Override
    public byte[] generate(List<FunctionalityDTO> functionalities) {
        return MAPPER.asString(functionalities).getBytes(StandardCharsets.UTF_8);
    }
}
