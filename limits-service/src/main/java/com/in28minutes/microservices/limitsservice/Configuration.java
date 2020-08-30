package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limits-service")
public class Configuration {
  private int maximum;
  private int minimum;

  public int getMaximum() {
    return maximum;
  }

  public void setMaximum(final int maximum) {
    this.maximum = maximum;
  }

  public int getMinimum() {
    return minimum;
  }

  public void setMinimum(final int minimum) {
    this.minimum = minimum;
  }
}
