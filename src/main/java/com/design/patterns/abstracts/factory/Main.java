package com.design.patterns.abstracts.factory;


public class Main {

  public static void main(String[] args){
    GUIBuilder builder = new GUIBuilder();
    AbstractWidgetFactory widgetFactory = null;

    String property = System.getProperty("os.name");

    if(property.toLowerCase().equals("win")){
      widgetFactory = new MsWindowsWidgetFactory();
    }else {
       widgetFactory = new MacOSXWidgetFactory();
    }

    builder.buildWindow(widgetFactory);
  }

}
