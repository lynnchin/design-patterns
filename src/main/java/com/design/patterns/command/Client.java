package com.design.patterns.command;

public class Client {
  public static void main(String[] args){
    RemoteControl control = new RemoteControl();

    Light light = new Light();

    Command lightOffCommand = new LightOffCommand(light);
    Command lightOnCommand = new LightOnCommand(light);

    control.setCommand(lightOnCommand);
    control.pressButton();

    System.out.println(control.getStatus());



    control.setCommand(lightOffCommand);
    control.pressButton();

    System.out.println(control.getStatus());
  }
}
