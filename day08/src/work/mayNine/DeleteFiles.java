package work.mayNine;

import java.io.File;

/**
 * @author 30391
 */
public class DeleteFiles {
    public static void main(String[] args) {

        File files = new File("C:\\Users\\30391\\IdeaProjects\\" +
                "projectAdvance\\day08\\director");


        recursion(files);


    }

    private static void recursion(File files) {
        for (File file : files.listFiles()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                recursion(file);
            }
            file.delete();
        }
    }
}
