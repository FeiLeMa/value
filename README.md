## maven
```java
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <optional>true</optional>
        </dependency>
```

## yml
```java
notifyparam:
  name: yanlingji
  age: 28
  map:
    phone: 1239999
    address: baiyue
```
## bean
```java
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
```
