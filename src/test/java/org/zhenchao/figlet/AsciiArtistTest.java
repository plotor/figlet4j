package org.zhenchao.figlet;

import org.junit.Test;
import org.zhenchao.figlet.enums.FontType;

/**
 * @author zhenchao.wang 2018-02-07 10:06
 * @version 1.0.0
 */
public class AsciiArtistTest {

    @Test
    public void getAsciiArt() {
        for (final FontType fontType : FontType.values()) {
            String art = AsciiArtist.getAsciiArt("success", fontType);
            System.out.println(fontType.getName() + "\n" + art);
        }
    }

    @Test
    public void getAsciiArt2() {
        String art = AsciiArtist.getAsciiArt("success", FontType.ALLIGATOR);
        System.out.println(art);
    }

    @Test
    public void getRandomAsciiArt() {
        System.out.println(AsciiArtist.getAsciiArt("success"));
    }

}