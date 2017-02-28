package com.design.patterns.factory.method;

public abstract class AbstractLoggerCreator {
  public abstract Logger createLogger();

  public Logger getLogger(){
    Logger logger = createLogger();
    return logger;
  }
}
