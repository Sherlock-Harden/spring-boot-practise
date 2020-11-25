package org.practise.starter.config;

import javax.annotation.Resource;
import org.practise.starter.service.PractiseStarterService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sherlock[q541458352@126.com]
 * @since 2020/11/24 20:44
 **/
@Configuration
@EnableConfigurationProperties(PractiseStarterProperties.class)
public class PractiseStarterAutoConfiguration {

  @Resource
  private PractiseStarterProperties properties;

  @Bean
  public PractiseStarterService practiseStarterService() {
    PractiseStarterService practiseStarterService = new PractiseStarterService();
    practiseStarterService.setPractiseStarterProperties(properties);
    return practiseStarterService;
  }
}
