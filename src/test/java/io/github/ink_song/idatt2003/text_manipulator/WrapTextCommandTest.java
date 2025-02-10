package io.github.ink_song.idatt2003.text_manipulator;

import static org.junit.jupiter.api.Assertions.*;
class WrapTextCommandTest {

  WrapTextCommand command = new WrapTextCommand("Open","Close");

  @org.junit.jupiter.api.Test
  void execute() {
    String result = command.execute("-Interstitial Text to be Wrapped-");
    assertEquals(result,"Open-Interstitial Text to be Wrapped-Close");
    System.out.println(result);
  }

  @org.junit.jupiter.api.Test
  void getOpening() {
  }

  @org.junit.jupiter.api.Test
  void getEnd() {
  }
}