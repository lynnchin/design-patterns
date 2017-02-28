package com.design.patterns.factory.method;

public class Client {
  private void someMethodThatLogs(AbstractLoggerCreator logCreator){
    Logger logger = logCreator.createLogger();
    logger.log("message");
  }

  public static void main(String[] args){
    AbstractLoggerCreator creator = new XMLLoggerCreator();
    Client client = new Client();
    client.someMethodThatLogs(creator);
  }
}
