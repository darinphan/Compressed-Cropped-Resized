import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        BufferedImage before = getImage("test.jpg");
//        BufferedImage after = new Resizer(before, 70, 50).getResized();
//
//        display(before, "before");
//        display(after, "after");
//
//        writeImage(before, "before");
//        writeImage(after, "after");

        getPreviousDirectory();

    }

    // Utils
    public static void display(BufferedImage image, String title) {
        JFrame frame = new JFrame(title);
        frame.getContentPane().add(new JLabel(new ImageIcon(image)));
        frame.pack();
        frame.setVisible(true);
    }

    public static BufferedImage getImage(String filepath) {
        try {
            return ImageIO.read(new File(filepath));
        } catch (IOException e) {
            return null;
        }
    }

    public static void writeImage(BufferedImage image, String name) {
        File outputfile = new File(name + ".png");
        try {
            ImageIO.write(image, "png", outputfile);
        } catch (IOException e) {
            return;
        }
    }

    public static void getPreviousDirectory() {
        File file = new File("");
        String[] pathChain = file.getAbsolutePath().split("/");
        System.out.println(Arrays.toString(pathChain));
    }
}
