package com.xzc.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shan
 * @date 2019/3/24
 */
@RestController
public class HiController
{

  @Autowired
  private
  SchedualServiceHi schedualServiceHi;

  @GetMapping(value = "/hi")
  public String sayHi(@RequestParam String name)
  {
    return schedualServiceHi.sayHiFromClientOne(name);
  }
}
