package io.github.ink_song.idatt2003.text_manipulator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

  CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
  @Test
  void execute() {
    String result = command.execute(" please capitalize all of these words for me");
    assertEquals("Please Capitalize All Of These Words For Me", result);
    System.out.println(result);
  }
}