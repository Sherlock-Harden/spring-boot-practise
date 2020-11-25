package org.practise.starter.config;

import javax.annotation.Resource;
import org.practise.starter.service.PractiseStarterService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 应用模块名称：
 *
 * 代码描述：
 *
 * Copyright: Copyright (C) 2020 XXX, Inc. All rights reserved.
 *
 * Company: neusoft
 *
 * @author yuansj[yuansj@neusoft.com]
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
