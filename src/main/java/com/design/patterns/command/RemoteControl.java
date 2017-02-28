package com.design.patterns.command;

public class RemoteControl {
  private Command command;

  public void setCommand(Command command){
    this.command = command;
  }

  public void pressButton(){
     command.execute();
  }

  public String getStatus(){
     return command.displayMessage();
  }

}
