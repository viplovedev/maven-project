package com.example;

/**
 * This is a class.
 */
/**
 * @author Viplove
 *
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
 * @param someone
 * @return String 
 */
public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
