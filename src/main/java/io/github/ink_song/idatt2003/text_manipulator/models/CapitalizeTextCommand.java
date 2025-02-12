package io.github.ink_song.idatt2003.text_manipulator.models;

public class CapitalizeTextCommand implements TextCommand {
  @Override
  public String execute(String text) {
    text = text.trim();
    //trim, get whatever is at the first index, change it to uppercase.
    String firstLetter = text.substring(0, 1).toUpperCase();
    String remainder = text.substring(1);
    return firstLetter + remainder;
  }

  @Override
  public String toReadableString() {
    return "Capitalize Text (Simple)";
  }
}
