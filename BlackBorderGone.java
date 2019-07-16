import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class BlackBorderGone {
    private int height;
    private int width;
    private BufferedImage image;

    public BlackBorderGone(BufferedImage image){
        this.image = image;
    }

    public BufferedImage getFinalImage() throws InterruptedException {
        int col = image.getWidth() - 1;
        while(image.getRGB(col, 0) == Color.BLACK.getRGB()){
            col--;
        }
        width = col;
        int row = image.getHeight() - 1;
        while(image.getRGB(0, row) == Color.BLACK.getRGB()){
            row--;
        }
        height = row;
        return image.getSubimage(0,0, width, height);
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
