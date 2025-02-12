package io.github.ink_song.idatt2003.text_manipulator.models;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {
  ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    return text.replaceFirst(target, replacement);
  }

  @Override
  public String toReadableString() {
    return "Replace First Instance";
  }
}
