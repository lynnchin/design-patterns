package com.design.patterns.command;

public class Light {
  private boolean on;

  public void switchOff(){
    on = false;
  }

  public void switchOn(){
    on = true;
  }
}
