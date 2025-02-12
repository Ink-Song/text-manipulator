package io.github.ink_song.idatt2003.text_manipulator.models;

public class WrapLinesTextCommand extends WrapTextCommand {
  public WrapLinesTextCommand(String open, String close) {
    super(open, close);
  }

  @Override
  public String execute(String text) {
    String[] parts = text.split("\n");
    StringBuilder sb = new StringBuilder();
    for (String part : parts) {
      part = super.getOpening() + part + super.getEnd();
      sb.append(part).append("\n");
    }
    return sb.toString().trim();
  }

  @Override
  public String toReadableString() {
    return "Wrap Lines";
  }
}
