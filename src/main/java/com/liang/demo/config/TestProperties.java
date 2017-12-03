package com.liang.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liangruijia
 */
@Component
public class TestProperties {
    @Value("${com.easy.springboot.h5perf.app.name}")
    private String appName;
    @Value("${com.easy.springboot.h5perf.app.version}")
    private String version;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
