package com.decathlon.ara.service.dto.functionality;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartographyFilterDTO {
    private String identifier;
    private String name;
    private String team;
    private String severity;
    private String created;
    private String countries;
    private String coverage;
    private String comment;
}
