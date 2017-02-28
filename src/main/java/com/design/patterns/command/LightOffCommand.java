package com.design.patterns.command;

public class LightOffCommand implements Command {

  private Light light;

  public LightOffCommand(Light light){
    this.light = light;
  }

  @Override public void execute() {
    light.switchOff();
  }

  @Override public String displayMessage(){
    return "Light: Off";
  }
}
