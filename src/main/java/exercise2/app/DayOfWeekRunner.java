package exercise2.app;

import java.io.File;
import java.time.DayOfWeek;

public class DayOfWeekRunner {
    public static void main(String[] args) {

        File file = new File("/Volumes/BOOTCAMP/Users/Piotr/IdeaProjects");

        int[] daysArray = new int[7];
        DayOfWeekServices.findJavaFiles(file,daysArray);

        for (int i = 0; i < daysArray.length; i++) {
            System.out.println(DayOfWeek.of(i + 1)+ " -> " + daysArray[i]);
        }

    }
//
//    public static void findJavaFiles(File directory, int[] array) {
//        for (File f : directory.listFiles())
//            if (f.isDirectory())
//                findJavaFiles(f,array);
//            else if (f.getName().endsWith(".java"))
//                array[getNumberIndex(getDayOfWeek(f))]++;
//    }
//
//    public static int getNumberIndex(DayOfWeek day) {
//        switch (day.name().toUpperCase()) {
//            case "MONDAY" -> {
//                return 0;
//            }
//            case "TUESDAY" -> {
//                return 1;
//            }
//            case "WEDNESDAY" -> {
//                return 2;
//            }
//            case "THURSDAY" -> {
//                return 3;
//            }
//            case "FRIDAY" -> {
//                return 4;
//            }
//            case "SATURDAY" -> {
//                return 5;
//            }
//            case "SUNDAY" -> {
//                return 6;
//            }
//        }
//        return 0;
//    }
//
//    public static DayOfWeek getDayOfWeek(File file) {
//        try {
//            BasicFileAttributes bfa = Files.readAttributes(Path.of(file.getAbsolutePath()), BasicFileAttributes.class);
//            Timestamp ts = Timestamp.from(bfa.creationTime().toInstant());
//            return ts.toLocalDateTime().getDayOfWeek();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }


}
