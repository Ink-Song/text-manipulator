package io.github.ink_song.idatt2003.text_manipulator.models;

public interface TextCommand {
  public String execute(String text);
  public String toReadableString();
}
