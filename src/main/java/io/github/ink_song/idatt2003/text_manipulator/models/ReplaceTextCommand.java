package io.github.ink_song.idatt2003.text_manipulator.models;

/**
 * A class designed to test the implementation of an interface,
 * handles text replacement using strings.
 */
public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;
  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  /**
   * Replaces a given literal text with a defined replacement text.
   * @param text A given text input to run find and replace on.
   * @return Returns a String
   */
  @Override
  public String execute(String text) {
    return text.replace(target, replacement);
  }

  public String getTarget() {return target;}
  public String getReplacement() {return replacement;}

  @Override
  public String toReadableString() {
    return "Replace Text";
  }
}
