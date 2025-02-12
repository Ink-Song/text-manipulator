package io.github.ink_song.idatt2003.text_manipulator.view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerminalUserInterfaceTest {

  TerminalUserInterface ui = new TerminalUserInterface();
  String[] commands = new String[] {
      "Do This",
      "Do That",
      "Do Some Other Thing",
      "One last Thing to Do"
  };
  @Test
  void display() {
    ui.display(commands);
  }
}