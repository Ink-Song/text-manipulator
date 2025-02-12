package io.github.ink_song.idatt2003.text_manipulator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceFirstTextCommandTest {

  ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("Hobbit", "Halfling");
  @Test
  void execute() {
    String replacedFirstText = command.execute("\"Concerning Hobbits\" is a piece by composer Howard Shore derived from The Lord of the Rings: The Fellowship of the Ring soundtrack. It is a concert suite of the music of the Hobbits, arranged from the music heard in the film during the early Shire scenes, and features the various themes and leitmotifs composed for the Shire and Hobbits.");
    assertEquals("\"Concerning Halflings\" is a piece by composer Howard Shore derived from The Lord of the Rings: The Fellowship of the Ring soundtrack. It is a concert suite of the music of the Hobbits, arranged from the music heard in the film during the early Shire scenes, and features the various themes and leitmotifs composed for the Shire and Hobbits.", replacedFirstText);
    System.out.println(replacedFirstText);
  }
}