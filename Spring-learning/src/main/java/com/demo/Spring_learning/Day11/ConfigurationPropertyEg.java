package com.demo.Spring_learning.Day11;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class ConfigurationPropertyEg {
    private String name;
    private String version;
    private String owner;

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
