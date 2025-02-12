package io.github.ink_song.idatt2003.text_manipulator.models;

public class WrapSelectionTextCommand extends WrapTextCommand{
  private String selection;
  public WrapSelectionTextCommand(String open, String close, String Selection) {
    super(open, close);
    this.selection = Selection;
  }

  @Override
  public String execute(String text) {
    return text.replace(selection, super.execute(selection));
  }
}
