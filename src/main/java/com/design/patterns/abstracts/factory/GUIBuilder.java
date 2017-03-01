package com.design.patterns.abstracts.factory;

public class GUIBuilder {
  public void buildWindow(AbstractWidgetFactory widgetFactory){
     Window window = widgetFactory.createWindow();
     window.setTitle("New Window");
  }
}
