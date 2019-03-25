package com.xzc.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author shan
 * @date 2019/3/25
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi
{

  @Override
  public String sayHiFromClientOne(String name)
  {
    return "feign sorry " + name;
  }
}
