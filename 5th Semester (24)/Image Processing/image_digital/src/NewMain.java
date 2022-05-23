
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class NewMain {
    public static void main(String[] args) {

        try{
            String imagePath = "D:/Docs/Universitas Sriwijaya/5th Semester (24)/Image Processing/image_digital/image/";
            String[] filenameBI= {"38092", "157055", "189080", "219090", "223061", "229036", "295087", "300091", "306005", "376043"};

            BufferedImage bi = ImageIO.read(new File(imagePath+filenameBI[0]+".jpg"));
            BufferedImage ci = ImageIO.read(new File(imagePath+filenameBI[1]+".jpg"));
            
            BufferedImage image;
            File outputfile;

            image = ImageOperations.OperasiAritmatikJumlah(bi, ci);
            outputfile = new File(filenameBI[0]+".png");
            ImageIO.write(image, "png", outputfile);

            // for (int i = 0; i < filenameBI.length; i++){
            //     BufferedImage bi = ImageIO.read(new File(imagePath+filenameBI[i]+".jpg"));
            
            //     BufferedImage image;
            //     File outputfile;
    
            //     CannyEdgeDetector detector = new CannyEdgeDetector();
            //     detector.setSourceImage(bi);
            //     detector.process();
            //     image = detector.getEdgesImage();
            //     outputfile = new File(filenameBI[i]+"-Canny.png");
            //     ImageIO.write(image, "png", outputfile);
            // }
            
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
	}
        
        
    }
    
}
