package io.github.ink_song.idatt2003.text_manipulator.view;

import java.util.Scanner;

public class TerminalUserInterface {

  private Scanner scanner;
  public void start(){
    this.scanner = new Scanner(System.in);
  }
  public void close(){
    scanner.close();
  }
  public void display(String[] commands){
    System.out.println("\n");
    for(int i = 0; i < commands.length; i++){
      System.out.println(i + ". " + commands[i]);
    }
    System.out.println("\n");
  }

  public String getUserInput(){
    return scanner.nextLine();
  }
}
