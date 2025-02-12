package io.github.ink_song.idatt2003.text_manipulator;

public class CapitalizeTextCommand implements TextCommand {
  @Override
  public String execute(String text) {
    text = text.trim();
    //trim, get whatever is at the first index, change it to uppercase.
    String[] parts = text.split(String.valueOf(text.charAt(0)));
    return parts[0].toUpperCase() + parts[1];
  }
}
