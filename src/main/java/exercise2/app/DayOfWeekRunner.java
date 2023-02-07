package exercise2.app;

import exercise2.Services.DayOfWeekService;

import java.io.File;
import java.time.DayOfWeek;

public class DayOfWeekRunner {
    public static void main(String[] args) {

        File file = new File("/Volumes/BOOTCAMP/Users/Piotr/IdeaProjects");

        int[] daysArray = new int[7];
        DayOfWeekService.findJavaFiles(file,daysArray);

        for (int i = 0; i < daysArray.length; i++) {
            System.out.println(DayOfWeek.of(i + 1)+ " -> " + daysArray[i]);
        }
        //MONDAY -> 71
        //TUESDAY -> 47
        //WEDNESDAY -> 20
        //THURSDAY -> 13
        //FRIDAY -> 86
        //SATURDAY -> 8
        //SUNDAY -> 2

    }

}
