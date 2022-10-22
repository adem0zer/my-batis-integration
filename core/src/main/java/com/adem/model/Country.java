package com.adem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Country extends Base {
    private Long countryId;
    private String country;
}
