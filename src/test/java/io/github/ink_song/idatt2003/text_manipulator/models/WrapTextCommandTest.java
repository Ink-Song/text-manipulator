package io.github.ink_song.idatt2003.text_manipulator.models;

import static org.junit.jupiter.api.Assertions.*;
class WrapTextCommandTest {

  WrapTextCommand command = new WrapTextCommand("<p>","</p>");

  @org.junit.jupiter.api.Test
  void execute() {
    String result = command.execute("Basic Text to be Wrapped");
    assertEquals(result,"<p>Basic Text to be Wrapped</p>");
    System.out.println(result);
  }

  @org.junit.jupiter.api.Test
  void getOpening() {
  }

  @org.junit.jupiter.api.Test
  void getEnd() {
  }
}