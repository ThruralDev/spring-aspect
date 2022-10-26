package com.demo.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspect {

  /**
   * Executes its logic based on the set annotation. This method is in special for methods. For example before the JoinPoint gets executed.
   * @param joinPoint is the origin of the current method which is executed by aspect.
   * @param exceptionHandler is the origin of the annotation.
   */
  @Before(
      value = "@annotation(exceptionHandler)",
      argNames = "joinPoint,exceptionHandler"
  )
  public void methodAspect(
      JoinPoint joinPoint,
      ExceptionHandler exceptionHandler
  ) {
    process(joinPoint, exceptionHandler);
  }

  /**
   * Executes its logic based on the set annotation. This method is in special for classes. For example before the JoinPoint gets executed.
   * @param joinPoint is the origin of the current method which is executed by aspect.
   * @param exceptionHandler is the origin of the annotation.
   */
  @Before(
      value = "@within(exceptionHandler)",
      argNames = "joinPoint,exceptionHandler"
  )
  public void classAspect(
      JoinPoint joinPoint,
      ExceptionHandler exceptionHandler
  ) {
    process(joinPoint, exceptionHandler);
  }

  /**
   * Provides the actual business logic for the aspect.
   * @param joinPoint is the origin of the current method which is executed by aspect.
   * @param exceptionHandler is the origin of the annotation.
   */
  private void process(JoinPoint joinPoint, ExceptionHandler exceptionHandler) {

    // TODO: implement logic to process with aspect.
    System.out.println("This is printed from aspect.");

  }
}