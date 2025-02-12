package io.github.ink_song.idatt2003.text_manipulator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {

  ReplaceTextCommand command = new ReplaceTextCommand("Hobbit","Halfling");
  @Test
  void execute() {
    String resultText = command.execute("\"Concerning Hobbits\" is a piece by composer Howard Shore derived from The Lord of the Rings: The Fellowship of the Ring soundtrack. It is a concert suite of the music of the Hobbits, arranged from the music heard in the film during the early Shire scenes, and features the various themes and leitmotifs composed for the Shire and Hobbits.");
    assertEquals("\"Concerning Halflings\" is a piece by composer Howard Shore derived from The Lord of the Rings: The Fellowship of the Ring soundtrack. It is a concert suite of the music of the Halflings, arranged from the music heard in the film during the early Shire scenes, and features the various themes and leitmotifs composed for the Shire and Halflings.", resultText);
    System.out.println(resultText);
  }
}