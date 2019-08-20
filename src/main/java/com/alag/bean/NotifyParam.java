package com.alag.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "notifyparam")
public class NotifyParam {

    private String name;
    private String age;
    private Map<String, String> map;

}
