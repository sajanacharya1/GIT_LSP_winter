package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SongsDatabase { 
	
    private Map<String, Set<String>> map = 
    new HashMap<String, Set<String>>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
	    // Code it!!
		Set<String> songSet = getSongs(genre);
		if (songSet==null) {
			songSet=new HashSet<>();
			map.put(genre, (HashSet<String>) songSet);
		}
		map.get(genre).add(songTitle);  
	}

	/* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
     // Code it!!	
		for (Entry<String, Set<String>> genreEntry : map.entrySet()) {
		    if (genreEntry.getValue().contains(songTitle)) {
		    	return genreEntry.getKey();
		    }
		}
		return ("song is not present in the song database");
    }
		
    
    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
     // Code it!!
		return map.get(genre);
    }

} 
