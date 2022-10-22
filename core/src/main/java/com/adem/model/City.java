package com.adem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class City extends Base{
    private Long cityId;
    private String city;
    private Country country;
}
