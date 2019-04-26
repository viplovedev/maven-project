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
 * @param someone The name of the person to be greeted.
 * @return String The greeting string
 */
public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
