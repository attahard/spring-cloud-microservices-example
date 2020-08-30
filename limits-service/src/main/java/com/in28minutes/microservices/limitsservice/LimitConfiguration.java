package com.in28minutes.microservices.limitsservice;

public class LimitConfiguration {
  private int maximum;
  private int minimum;

  public LimitConfiguration() {
    super();
  }

  public LimitConfiguration(final int maximum, final int minimum) {
    super();
    this.maximum = maximum;
    this.minimum = minimum;
  }

  public int getMaximum() {
    return maximum;
  }

  public int getMinimum() {
    return minimum;
  }
}
