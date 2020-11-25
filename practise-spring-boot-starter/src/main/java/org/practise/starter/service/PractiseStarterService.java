package org.practise.starter.service;

import lombok.Data;
import org.practise.starter.config.PractiseStarterProperties;

/**
 * @author sherlock[q541458352@126.com]
 * @since 2020/11/24 20:55
 **/
@Data
public class PractiseStarterService {

  private PractiseStarterProperties practiseStarterProperties;

  public String sout() {
    return practiseStarterProperties.toString();
  }

}
