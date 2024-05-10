package work.may10th.work.controller;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * @author 30391
 */
public class CopyTheJavaFileToOther {
    public static void main(String[] args) throws IOException {

//        FileInputStream fileInputStream = new FileInputStream("day08/director/JavaContain");
//        BufferedInputStream inputStream = new BufferedInputStream(fileInputStream);

        File files = new File("day08/director/JavaContain");
        for (File file : Objects.requireNonNull(files.listFiles())) {
            System.out.println(file);
            if (file.isFile() && (file.getName().endsWith(".java"))) {

                File rangeFile = new File("day08/director/rangeAdv");
                FileUtils.copyFile(file.getAbsoluteFile(), rangeFile);
                String replace = rangeFile.getName().replace(".java", ".txt");
                boolean b = rangeFile.renameTo(new File(replace));
                if (b) {
                    System.out.println("改名成功");
                }
                System.out.println("改名失败");
                break;
            }
            System.out.println("文件名不包含java");
            break;
        }


    }

}
