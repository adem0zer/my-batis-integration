package com.adem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Actor extends Base {
    private Long actorId;
    private String firstName;
    private String lastName;
}
