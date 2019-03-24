package com.xzc.serviceRibbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shan
 * @date 2019/3/24
 */
@RestController
public class HelloController
{

  @Autowired
  HelloService helloService;

  @GetMapping(value = "/hi")
  public String hi(@RequestParam String name)
  {
    return helloService.hiService(name);
  }
}
