package net.tine2k.eureka_consul_adapter.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Config {

    @JsonProperty("Datacenter")
    private String dataCenter;

}