package io.github.ink_song.idatt2003.text_manipulator.models;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  private String selection;
  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    return text.replaceAll(selection, super.execute(selection));
  }

  public String getSelection() {
    return selection;
  }

  @Override
  public String toReadableString() {
    return "Capitalize Text Selection";
  }
}
