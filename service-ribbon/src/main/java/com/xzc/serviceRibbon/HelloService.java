package com.xzc.serviceRibbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author shan
 * @date 2019/3/24
 */
@Service
public class HelloService
{

  @Autowired
  RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "hiError")
  public String hiService(String name)
  {
    return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
  }

  public String hiError(String name)
  {
    return "Hi," + name + "sorry error!";
  }
}
