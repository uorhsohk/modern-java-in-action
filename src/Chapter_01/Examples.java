package Chapter_01;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {
        // filter all hidden files in a directory
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
        System.out.println(Arrays.toString(hiddenFiles));
        // now with method references
        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
        System.out.println(Arrays.toString(hiddenFiles2));

    }
}
