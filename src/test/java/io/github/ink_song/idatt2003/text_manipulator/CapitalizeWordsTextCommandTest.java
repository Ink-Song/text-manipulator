package io.github.ink_song.idatt2003.text_manipulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

  CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
  @Test
  void execute() {
    String result = command.execute(" please capitalize all of these words for me");
    System.out.println(result);
  }
}