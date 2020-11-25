package org.practise.starter.service;

import lombok.Data;
import org.practise.starter.config.PractiseStarterProperties;

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
 * @since 2020/11/24 20:55
 **/
@Data
public class PractiseStarterService {

  private PractiseStarterProperties practiseStarterProperties;

  public String sout() {
    return practiseStarterProperties.toString();
  }

}
