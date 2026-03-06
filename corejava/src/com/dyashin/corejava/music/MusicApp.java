package com.dyashin.corejava.music;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MusicApp {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Song> songs = new TreeMap<>();

    public static void main(String[] args) {
        MusicApp app = new MusicApp();
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
                case 1:
                    addSong();
                    break;
                case 2:
                    updateSong();
                    break;
                case 3:
                    deleteSong();
                    break;
                case 4:
                    viewById();
                    break;
                case 5:
                    displayAllSongs();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public void addSong() {
        System.out.print("Enter Song ID: ");
        int id = sc.nextInt();

        if (songs.containsKey(id)) {
            System.out.println("Song already exists with this ID!");
            return;
        }

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Song Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Year of Publication: ");
        int year = sc.nextInt();

        songs.put(id, new Song(id, year, name));
        System.out.println("Song added successfully!");
    }

    public void updateSong() {
        System.out.print("Enter Song ID to Update: ");
        int id = sc.nextInt();

        Song song = songs.get(id);
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

        if (!newName.isBlank()) {
            song.setName(newName.trim());
            System.out.println("Song name updated.");
        }

        if (newYear != 0) {
            song.setYear(newYear);
            System.out.println("Song year updated.");
        }

        System.out.println("Updated Song: " + song);
    }

    public void deleteSong() {
        System.out.print("Enter Song ID to Delete: ");
        int id = sc.nextInt();

        Song removed = songs.remove(id);
        if (removed == null) {
            System.out.println("No song found with ID: " + id);
        } else {
            System.out.println("Deleted song: " + removed);
        }
    }

    public void viewById() {
        System.out.print("Enter Song ID to View: ");
        int id = sc.nextInt();

        Song song = songs.get(id);
        if (song == null) {
            System.out.println("No song found with ID: " + id);
        } else {
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
    }

    public void displayAllSongs() {
        if (songs.isEmpty()) {
            System.out.println("No songs available.");
            return;
        }

        System.out.println("\nAll Songs:");
        for (Song song : songs.values()) {
            System.out.println(song);
        }
    }
}
