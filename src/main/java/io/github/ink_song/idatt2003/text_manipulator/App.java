package io.github.ink_song.idatt2003.text_manipulator;

import java.util.ArrayList;

import io.github.ink_song.idatt2003.text_manipulator.models.*;
import io.github.ink_song.idatt2003.text_manipulator.view.TerminalUserInterface;

public class App {
  private static TerminalUserInterface ui;
  private static String[] commands;

  public static void main(String[] args) {
    App app = new App();
    app.start();
    int selection;
    TextCommand command = null;
    String currentText = null;

    while(true) {
      currentText = app.getBaseText();

      if(currentText == null) {
        continue;
      }

      ui.display(commands);
      selection = app.getUserInput();
      app.performCommand(selection);

    }

  }
  private void start(){
    ui = new TerminalUserInterface();
    commands = new String[] {
        "Replace Text",
        "Replace First Text",
        "Capitalize Text",
        "Capitalize Words",
        "Capitalize Selection",
        "Wrap Text",
        "Wrap Lines",
        "Wrap Selection",
        "Change Base Text"
    };
  }
  private void stop(){
    ui.close();
    System.exit(0);
  }
  private int getUserInput(){
    int result;
    try{
      result = Integer.parseInt(ui.getUserInput("Enter the command you'd like to use. Use Integers.").trim());
      return result;
    }catch(NumberFormatException e){
      System.out.println("Input was not a valid integer. Please enter a number.");
      return -1;
    }

  }
  private String getBaseText(){
    String base = ui.getUserInput("Please enter the text you'd like to work on.");
    if(base.isBlank()){
      return null;
    }
    else {
      return base;
    }
  }
  private void performCommand(int selection, String currentText){
    TextCommand command = null;
    switch (selection) {
      case 0:
        stop();
      case 1:
        String target = ui.getUserInput("Enter the text you'd like to replace.");
        String replacement = ui.getUserInput("Enter the Replacement Text.");
        command = new ReplaceTextCommand(target, replacement);
      case 4:
        command = new CapitalizeWordsTextCommand();
    }
    if(command != null) {
      currentText = command.execute(currentText);
      command = null;
    }
  }
}
