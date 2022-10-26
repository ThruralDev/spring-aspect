package com.demo.example.security;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Aspect
@Component
public class ExceptionAspect {

  @Before(
      value = "@annotation(exceptionHandler)",
      argNames = "joinPoint,exceptionHandler"
  )
  public void methodSecurity(
      JoinPoint joinPoint,
      ExceptionHandler exceptionHandler
  ) {
    authorize(joinPoint, exceptionHandler);
  }

  @Before(
      value = "@within(exceptionHandler)",
      argNames = "joinPoint,exceptionHandler"
  )
  public void classSecurity(
      JoinPoint joinPoint,
      ExceptionHandler exceptionHandler
  ) {
    authorize(joinPoint, exceptionHandler);
  }

  private void authorize(JoinPoint joinPoint, ExceptionHandler exceptionHandler) {

    System.out.println("JoinPoint: " + joinPoint);
    System.out.println("Security: " + exceptionHandler);
    System.out.println("This should print");
  }
}