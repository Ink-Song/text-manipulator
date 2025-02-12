package io.github.ink_song.idatt2003.text_manipulator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {

  CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("selection");
  @Test
  void execute() {
    String result = command.execute("Here's a selection and a second selection.");
    assertEquals("Here's a Selection and a second Selection.", result);
    System.out.println(result);
  }

  @Test
  void getSelection() {
  }
}