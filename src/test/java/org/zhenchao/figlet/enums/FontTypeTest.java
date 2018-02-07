package org.zhenchao.figlet.enums;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Test;

import java.io.File;

/**
 * @author zhenchao.wang 2018-02-07 09:15
 * @version 1.0.0
 */
public class FontTypeTest {

    @Test
    public void generate() throws Exception {
        LineIterator itr = FileUtils.lineIterator(new File("src/test/resources/flf.names"));
        while (itr.hasNext()) {
            String name = itr.nextLine();
            System.out.println(name.toUpperCase().replaceAll("-", "_") + "(\"" + name + "\"),");
        }
    }
}