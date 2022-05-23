import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class BicubicInterpolation {
    public static BufferedImage createResizedCopy(BufferedImage source, int destWidth, int destHeight, Object interpolation)
{
    BufferedImage bicubic = new BufferedImage(destWidth, destHeight, source.getType());
    Graphics2D bg = bicubic.createGraphics();
    bg.setRenderingHint(RenderingHints.KEY_INTERPOLATION, interpolation);
    float sx = (float)destWidth / source.getWidth();
    float sy = (float)destHeight / source.getHeight();
    bg.scale(sx, sy);
    bg.drawImage(source, 0, 0, null);
    bg.dispose();
    return bicubic;
}
    
    public static GraphicsConfiguration getDefaultConfiguration(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        return gd.getDefaultConfiguration();
    }
}
