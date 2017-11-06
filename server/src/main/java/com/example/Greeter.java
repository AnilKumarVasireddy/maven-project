package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone with name of person
   * @return greeting someone
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
