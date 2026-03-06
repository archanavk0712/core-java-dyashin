package com.dyashin.musicplayer.dao;

import com.dyashin.musicplayer.dto.SongDTO;
import com.dyashin.musicplayer.exception.SongNotFoundException;
import java.util.List;

public interface SongDAO {
    void addSong(SongDTO song);
    void updateSong(SongDTO song);
    void deleteSong(int id) throws SongNotFoundException;
    SongDTO getSongById(int id);
    List<SongDTO> getAllSongs();
    boolean exists(int id);
}
