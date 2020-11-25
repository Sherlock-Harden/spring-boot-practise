package org.practise.starter;

import javax.annotation.Resource;
import org.practise.starter.service.PractiseStarterService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sherlock[q541458352@126.com]
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
