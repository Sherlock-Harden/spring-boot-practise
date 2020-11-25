package org.practise.starter;

import javax.annotation.Resource;
import org.practise.starter.service.PractiseStarterService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
 * @since 2020/11/24 20:42
 **/
@SpringBootApplication
public class PractiseStarterApplication implements CommandLineRunner {

  @Resource
  private PractiseStarterService practiseStarterService;

  public static void main(String[] args) {
    SpringApplication.run(PractiseStarterApplication.class, args);
  }

  @Override
  public void run(String... args) {
    System.out.println(practiseStarterService.sout());
  }
}
