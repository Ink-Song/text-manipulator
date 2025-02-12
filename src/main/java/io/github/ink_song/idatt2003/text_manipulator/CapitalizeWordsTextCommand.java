package io.github.ink_song.idatt2003.text_manipulator;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
  @Override
  public String execute(String text) {
    text = text.trim();
    String[] words = text.split(" ");
    StringBuilder stringBuilder = new StringBuilder();
    for (String word : words) {
      stringBuilder.append(super.execute(word) + " ");
    }
    return stringBuilder.toString().trim();
  }
}
