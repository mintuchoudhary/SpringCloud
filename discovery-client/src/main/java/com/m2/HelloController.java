package com.m2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {
  private AtomicLong counter = new AtomicLong();

  @GetMapping(value = "/hello")
  public HelloPojo getHelloWordObject() {
      HelloPojo hello = new HelloPojo();
      hello.setMessage("Hi there! you are number " + counter.incrementAndGet());
      return hello;
  }
}

