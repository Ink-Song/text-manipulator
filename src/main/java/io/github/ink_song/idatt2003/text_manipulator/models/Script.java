package io.github.ink_song.idatt2003.text_manipulator.models;

import java.util.ArrayList;
import java.util.List;

public class Script {
  List<TextCommand> textCommands = new ArrayList<>();
  Script(List<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }
  public String execute(String text){
    return "";
  }
}
