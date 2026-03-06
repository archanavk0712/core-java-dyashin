package com.dyashin.musicplayer.validation;

import java.time.Year;

public class SongValidator {

    public static boolean isValidName(String name) {
        return name != null && !name.isBlank() && name.length() >= 2;
    }

    public static boolean isValidYear(int year) {
        int currentYear = Year.now().getValue();
        return year > 1900 && year <= currentYear;
    }
}
