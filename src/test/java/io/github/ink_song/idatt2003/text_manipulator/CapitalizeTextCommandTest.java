package io.github.ink_song.idatt2003.text_manipulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {

  CapitalizeTextCommand command = new CapitalizeTextCommand();
  @Test
  void execute() {
    String result = command.execute("capitalize me!");
    System.out.println(result);
  }
}