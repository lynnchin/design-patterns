package com.design.patterns.factory.method;

public class XMLLogger implements Logger {
  public void log(String message) {
    System.err.println(message);
  }
}
