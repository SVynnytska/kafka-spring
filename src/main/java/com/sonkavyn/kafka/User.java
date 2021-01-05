package com.sonkavyn.kafka;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class User {
    @JsonProperty("balance")
    private Double balance;
}
