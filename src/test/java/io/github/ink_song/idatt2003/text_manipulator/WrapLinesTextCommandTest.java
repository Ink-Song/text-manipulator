package io.github.ink_song.idatt2003.text_manipulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapLinesTextCommandTest {

  WrapLinesTextCommand command = new WrapLinesTextCommand("<p>","</p>");
  @Test
  void execute() {
    String tested = command.execute("This is the First Line\nThis is the Second Line");
    assertEquals("<p>This is the First Line</p>\n<p>This is the Second Line</p>\n",tested);
    System.out.println(tested);
  }
}
