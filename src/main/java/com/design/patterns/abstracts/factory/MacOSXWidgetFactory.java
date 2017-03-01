package com.design.patterns.abstracts.factory;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {
  public Window createWindow() {
    return new MacOSXWindow();
  }
}
