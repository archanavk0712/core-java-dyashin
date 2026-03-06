package com.dyashin.musicplayer.dao;

import com.dyashin.musicplayer.dto.SongDTO;
import com.dyashin.musicplayer.exception.SongNotFoundException;
import java.util.*;

public class SongDAOImpl implements SongDAO {
    private final Map<Integer, SongDTO> songs = new TreeMap<>();

    @Override
    public void addSong(SongDTO song) {
        songs.put(song.getId(), song);
    }

    @Override
    public void updateSong(SongDTO song) {
        songs.put(song.getId(), song);
    }

    @Override
    public void deleteSong(int id) throws SongNotFoundException {
        if (!songs.containsKey(id)) {
            throw new SongNotFoundException("No song found with ID: " + id);
        }
        songs.remove(id);
    }

    @Override
    public SongDTO getSongById(int id) {
        return songs.get(id);
    }

    @Override
    public List<SongDTO> getAllSongs() {
        return new ArrayList<>(songs.values());
    }

    @Override
    public boolean exists(int id) {
        return songs.containsKey(id);
    }
}
