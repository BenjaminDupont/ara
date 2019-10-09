package com.decathlon.ara.cartography;

import com.decathlon.ara.service.dto.functionality.FunctionalityDTO;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class AraExporter extends Exporter {
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
        // TODO
        return functionalities.toString().getBytes(StandardCharsets.UTF_8);
    }
}
