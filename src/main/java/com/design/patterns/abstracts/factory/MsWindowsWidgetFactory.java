package com.design.patterns.abstracts.factory;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory{

  public Window createWindow() {
    return new MSWindow();
  }
}
