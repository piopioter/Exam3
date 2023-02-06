package exercise2.Services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Timestamp;
import java.time.DayOfWeek;

public class DayOfWeekServices {
    public static void findJavaFiles(File directory, int[] array) {
        for (File f : directory.listFiles())
            if (f.isDirectory())
                findJavaFiles(f,array);
            else if (f.getName().endsWith(".java"))
                array[getNumberIndex(getDayOfWeek(f))]++;
    }

    private static int getNumberIndex(DayOfWeek day) {
        switch (day.name().toUpperCase()) {
            case "MONDAY" -> {
                return 0;
            }
            case "TUESDAY" -> {
                return 1;
            }
            case "WEDNESDAY" -> {
                return 2;
            }
            case "THURSDAY" -> {
                return 3;
            }
            case "FRIDAY" -> {
                return 4;
            }
            case "SATURDAY" -> {
                return 5;
            }
            case "SUNDAY" -> {
                return 6;
            }
        }
        return 0;
    }

    private static DayOfWeek getDayOfWeek(File file) {
        try {
            BasicFileAttributes bfa = Files.readAttributes(Path.of(file.getAbsolutePath()), BasicFileAttributes.class);
            Timestamp ts = Timestamp.from(bfa.creationTime().toInstant());
            return ts.toLocalDateTime().getDayOfWeek();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
