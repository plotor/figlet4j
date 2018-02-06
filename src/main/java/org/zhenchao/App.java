package org.zhenchao;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Collection;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        Collection<File> files = FileUtils.listFiles(new File("src/main/resources"), new String[] {"txt"}, false);
        for (final File file : files) {
            String newName = file.getName().replace(".txt", ".flf");
            file.renameTo(new File(newName));
        }
    }
}
