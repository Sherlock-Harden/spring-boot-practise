package org.practise.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

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
 * @since 2020/11/24 20:43
 **/
@Data
@ConfigurationProperties(prefix = "practise.starter")
public class PractiseStarterProperties {

  private String name;

}
