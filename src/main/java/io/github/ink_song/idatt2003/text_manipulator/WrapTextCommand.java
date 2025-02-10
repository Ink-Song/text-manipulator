package io.github.ink_song.idatt2003.text_manipulator;

public class WrapTextCommand implements TextCommand {

  protected String opening;
  protected String end;
  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }


  @Override
  public String execute(String text) {
    return opening + text + end;
  }

  public String getOpening() {
    return opening;
  }
  public String getEnd() {
    return end;
  }
}
