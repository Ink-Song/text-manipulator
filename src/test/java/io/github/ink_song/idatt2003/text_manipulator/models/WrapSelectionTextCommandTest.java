package io.github.ink_song.idatt2003.text_manipulator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  WrapSelectionTextCommand command = new WrapSelectionTextCommand("<p>","</p>","Selection");
  @Test
  void execute() {
    String result = command.execute("This shouldn't be enclosed. This (Selection) should be.");
    assertEquals("This shouldn't be enclosed. This (<p>Selection</p>) should be.", result);
    System.out.println(result);
  }
}