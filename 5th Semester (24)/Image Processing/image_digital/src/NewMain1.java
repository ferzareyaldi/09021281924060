import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class NewMain1 {

    public static void main(String[] args) {
        try{
            BufferedImage bi=null;
            String imagePath = "D:/Docs/Universitas Sriwijaya/5th Semester (24)/Image Processing/image_digital/image/38092.jpg";
            bi = ImageIO.read(new File(imagePath));
            Object interpolation = RenderingHints.VALUE_INTERPOLATION_BICUBIC;
            BufferedImage si = BicubicInterpolation.createResizedCopy(bi, bi.getWidth()*3, bi.getHeight()*3, interpolation);
            File outputfile = new File("bicubic.png");
            ImageIO.write(si, "png", outputfile);
        }catch (Exception e) {
            e.getMessage();
            System.out.println(e);
        }
    }
    
}
