package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class SongsDatabaseTest {

	@Test
	@DisplayName("Test for addSong method")
	public void testAddSong() {
		SongsDatabase db= new SongsDatabase();
		db.addSong("Rap", "Savage");
	
		assertTrue(db.getSongs("Rap").contains("Savage"));
		

		db.addSong("Country","Sweet Alabama");
		db.addSong("Jazz","Always There");
		
		assertFalse(db.getSongs("Country").contains("Beautiful in white"));
		assertTrue(db.getSongs("Jazz").contains("Always There"));
	}
	
	@Test
	@DisplayName("Test for getSong method")
    public void getSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "CARNIVAL");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");

        Set<String> rapSongs = db.getSongs("Rap");
        assertEquals(2, rapSongs.size());
        assertTrue(rapSongs.contains("CARNIVAL"));

        Set<String> countrySongs = db.getSongs("Country");
        assertEquals(1, countrySongs.size());
        assertTrue(countrySongs.contains("Sweet Alabama"));

        Set<String> jazzSongs = db.getSongs("Jazz");
        assertEquals(1, jazzSongs.size());
        assertTrue(jazzSongs.contains("Always There"));
        assertFalse(jazzSongs.contains("Sweet Alabama"));
    }
	


    @Test
    @DisplayName("Test for getGenreOfSong method")
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");

        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Country", db.getGenreOfSong("Sweet Alabama"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertEquals("song is not present in the song database", db.getGenreOfSong("Beautiful in White"));
    }

}