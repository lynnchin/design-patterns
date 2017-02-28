package com.design.patterns.command;

public class LightOnCommand implements Command {

  private final Light light;

  public LightOnCommand(Light light){
    this.light = light;
  }

  @Override public void execute() {
    light.switchOn();
  }

  @Override public String displayMessage() {
    return "Light: On";
  }
}
