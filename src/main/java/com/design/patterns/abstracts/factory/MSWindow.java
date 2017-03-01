package com.design.patterns.abstracts.factory;

public class MSWindow implements Window {

  private String title;
  private String message;

  public void setTitle(String text) {
     this.title = text;
  }

  public void repaint() {
    System.out.println("Repaint on MSWindow");
  }
}
