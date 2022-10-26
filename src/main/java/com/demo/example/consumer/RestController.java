package com.demo.example.consumer;

import com.demo.example.security.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

  @ExceptionHandler()
  @GetMapping
  public String getData(@RequestAttribute Long dataId) {
    return String.format("dataId=%d", dataId);
  }
}