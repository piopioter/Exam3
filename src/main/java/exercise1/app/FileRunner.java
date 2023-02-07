package exercise1.app;

import java.io.File;
public class FileRunner {
    public static void main(String[] args) {
        File file = new File("/Volumes/BOOTCAMP/Users/Piotr/IdeaProjects");

        File largestJavaFile = findLargestJavaFile(file);
        System.out.println("Najwiekszy plik to: " + largestJavaFile.getAbsoluteFile());

    }

    public static File findLargestJavaFile(File directory) {
        File largestFile = new File("");
        File temp = new File("");
        long largestSize = 0;
        for (File f : directory.listFiles()) {
            if (f.isDirectory())
                temp = findLargestJavaFile(f);
            if (temp.length() > largestSize) {
                largestFile = temp;
                largestSize = temp.length();
            } else if (f.getName().endsWith(".java")) {
                if (f.length() > largestSize) {
                    largestFile = f;
                    largestSize = f.length();
                }
            }

        }

        return largestFile;
    }


}

