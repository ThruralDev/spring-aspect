package com.demo.example.config;

import com.demo.example.security.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Implements the WebMvcConfigurer interface to config the Interceptor with the bean.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

  /**
   * Does register the interceptor and gets executed with startup of service.
   * @param registry
   */
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(interceptor());
  }

  /**
   *
   * @return the interceptor in order to add an instance of it to the registry.
   */
  @Bean
  public Interceptor interceptor() {
    return new Interceptor();
  }
}
