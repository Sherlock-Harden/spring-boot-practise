package org.practise.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author sherlock[q541458352@126.com]
 * @since 2020/11/24 20:43
 **/
@Data
@ConfigurationProperties(prefix = "practise.starter")
public class PractiseStarterProperties {

  private String name;

}
