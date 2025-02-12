package io.github.ink_song.idatt2003.text_manipulator.view;

import java.util.Scanner;

public class TerminalUserInterface {

  private Scanner scanner = new Scanner(System.in);
  public void close(){
    scanner.close();
  }
  public void display(String[] commands){
    System.out.println("\n");
    for(int i = 0; i < commands.length; i++){
      System.out.println(i+1 + ". " + commands[i]);
    }
    System.out.println("0. Exit\n");
  }

  public String getUserInput(String prompt){
    System.out.println(prompt);
    return scanner.nextLine();
  }
}
