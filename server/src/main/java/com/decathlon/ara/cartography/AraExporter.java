package com.decathlon.ara.cartography;

import com.decathlon.ara.service.dto.functionality.FunctionalityDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.List;

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
