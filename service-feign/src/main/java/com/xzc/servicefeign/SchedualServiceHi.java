package com.xzc.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shan
 * @date 2019/3/24
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystrix.class)
public interface SchedualServiceHi
{

  @RequestMapping(value = "/hi", method = RequestMethod.GET)
  String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
