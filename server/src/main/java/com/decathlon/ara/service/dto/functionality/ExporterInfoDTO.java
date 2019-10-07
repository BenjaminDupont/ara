package com.decathlon.ara.service.dto.functionality;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExporterInfoDTO {
    private String name;
    private String description;
    private String format;
}
