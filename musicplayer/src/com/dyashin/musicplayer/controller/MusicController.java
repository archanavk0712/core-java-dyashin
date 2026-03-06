package com.dyashin.musicplayer.controller;

import com.dyashin.musicplayer.dao.SongDAO;
import com.dyashin.musicplayer.dao.SongDAOImpl;
import com.dyashin.musicplayer.dto.SongDTO;
import com.dyashin.musicplayer.exception.SongNotFoundException;
import com.dyashin.musicplayer.validation.SongValidator;

import java.util.*;

public class MusicController {
    Scanner sc = new Scanner(System.in);
    SongDAO songDAO = new SongDAOImpl();

    public static void main(String[] args) {
        MusicController app = new MusicController();
        app.start();
    }

    public void start() {
        System.out.println("=== Simple Music Player ===");
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Song");
            System.out.println("2. Update Song");
            System.out.println("3. Delete Song");
            System.out.println("4. View Song by ID");
            System.out.println("5. View All Songs");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> addSong();
                case 2 -> updateSong();
                case 3 -> deleteSong();
                case 4 -> viewById();
                case 5 -> displayAllSongs();
                case 6 -> {
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void addSong() {
        System.out.print("Enter Song ID: ");
        int id = sc.nextInt();

        if (songDAO.exists(id)) {
            System.out.println("Song already exists with this ID!");
            return;
        }

        sc.nextLine(); // consume newline
        System.out.print("Enter Song Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Year of Publication: ");
        int year = sc.nextInt();

        if (!SongValidator.isValidName(name) || !SongValidator.isValidYear(year)) {
            System.out.println("Invalid song details. Try again.");
            return;
        }

        songDAO.addSong(new SongDTO(id, year, name));
        System.out.println("Song added successfully!");
    }

    private void updateSong() {
        System.out.print("Enter Song ID to Update: ");
        int id = sc.nextInt();

        SongDTO song = songDAO.getSongById(id);
        if (song == null) {
            System.out.println("No song found with ID: " + id);
            return;
        }

        System.out.println("Current Song: " + song);
        sc.nextLine();

        System.out.print("Enter new Song Name (leave blank to keep same): ");
        String newName = sc.nextLine();

        System.out.print("Enter new Year (enter 0 to keep same): ");
        int newYear = sc.nextInt();

        if (!newName.isBlank()) song.setName(newName.trim());
        if (newYear != 0) song.setYear(newYear);

        songDAO.updateSong(song);
        System.out.println("Song updated successfully!");
    }

    private void deleteSong() {
        System.out.print("Enter Song ID to Delete: ");
        int id = sc.nextInt();

        try {
            songDAO.deleteSong(id);
            System.out.println("Song deleted successfully!");
        } catch (SongNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void viewById() {
        System.out.print("Enter Song ID to View: ");
        int id = sc.nextInt();

        SongDTO song = songDAO.getSongById(id);
        if (song == null) {
            System.out.println("No song found with ID: " + id);
            return;
        }

        System.out.println("Now Playing: " + song.getName());
        System.out.println("Press 0 to stop playing.");

        while (true) {
            int stop = sc.nextInt();
            if (stop == 0) {
                System.out.println("Stopped playing.");
                break;
            } else {
                System.out.println("Invalid input. Press 0 to stop.");
            }
        }
    }

    private void displayAllSongs() {
        List<SongDTO> songs = songDAO.getAllSongs();
        if (songs.isEmpty()) {
            System.out.println("No songs available.");
        } else {
            System.out.println("\nAll Songs:");
            songs.forEach(System.out::println);
        }
    }
}
