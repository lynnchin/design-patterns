package com.design.patterns.abstracts.factory;

public class MacOSXWindow implements Window {
  private String title;
  private String message;

  public void setTitle(String text) {
    this.title = text;
  }

  public void repaint() {
    System.out.println("Paint on Mac OSX Window");
  }
}
