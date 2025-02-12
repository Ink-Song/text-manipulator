package io.github.ink_song.idatt2003.text_manipulator;

import java.util.ArrayList;

import io.github.ink_song.idatt2003.text_manipulator.models.*;
import io.github.ink_song.idatt2003.text_manipulator.view.TerminalUserInterface;

public class App {
  boolean runProgram = true;
  int selection;
  TextCommand command = null;
  String currentText = null;
  TerminalUserInterface ui = new TerminalUserInterface();
  String[] commands = new String[] {
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

  public static void main(String[] args) {
    App app = new App();
    app.run();
  }
  private void run(){

    while(runProgram) {
      if(currentText == null) {
        currentText = getBaseText();
      }
      ui.display(commands);
      selection = getUserInput();
      currentText = performCommand(selection, currentText);
    }
  }
  private void stop(){
    ui.close();
    runProgram = false;
  }
  private int getUserInput(){
    int result;
    try{
      result = Integer.parseInt(ui.getUserInput("Enter the command you'd like to use. Use Integers.").trim());
      System.out.println("Input " + result + " is a valid input.");
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
  private String performCommand(int selection, String currentText){
    TextCommand command = null;
    switch (selection) {
      case 1:
        String target = ui.getUserInput("Enter the text you'd like to replace.");
        String replacement = ui.getUserInput("Enter the Replacement Text.");
        command = new ReplaceTextCommand(target, replacement);
        break;
      case 2:
        command = new ReplaceFirstTextCommand(ui.getUserInput("Enter the text you'd like to replace."),
            ui.getUserInput("Enter Replacement Text"));
        break;
      case 3:
        command = new CapitalizeTextCommand();
        break;
      case 4:
        command = new CapitalizeWordsTextCommand();
        break;
      case 5:
        command = new CapitalizeSelectionTextCommand(ui.getUserInput("Enter the text you'd like to capitalize."));
        break;
      case 6:
        command = new WrapTextCommand(ui.getUserInput("Enter opening wrap text"),
            ui.getUserInput("Enter Closing wrap text."));
        break;
      case 7:
        command = new WrapLinesTextCommand(ui.getUserInput("Enter opening wrap text"),
            ui.getUserInput("Enter Closing wrap text."));
        break;
      case 8:
        command = new WrapSelectionTextCommand(ui.getUserInput("Enter opening wrap text"),
            ui.getUserInput("Enter closing wrap text"),
            ui.getUserInput("Enter Portion of Text you'd like to wrap."));
        break;
      case 9:
        currentText = null;
        break;
      case 0:
        stop();
        break;
      default:
        System.out.println("Something went wrong, try again.");
        break;
    }
    if(command != null) {
      currentText = command.execute(currentText);
      System.out.println(currentText);
      command = null;
    }
    return currentText;
  }
}
