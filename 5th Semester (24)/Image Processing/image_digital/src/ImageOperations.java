import java.awt.image.BufferedImage;

public class ImageOperations {
	
	public static BufferedImage Threshold(BufferedImage img, int requiredThresholdValue) {		
		int height = img.getHeight();
		int width = img.getWidth();
		BufferedImage finalThresholdImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

		int red = 0;
		int green = 0;
		int blue = 0;
		
		for (int x = 0; x < width; x++) {
			try {
				for (int y = 0; y < height; y++) {
					int color = img.getRGB(x, y);
					red = ImageOperations.getRed(color);
					green = ImageOperations.getGreen(color);
					blue = ImageOperations.getBlue(color);
						if((red+green+blue)/3 < (int) (requiredThresholdValue)) {
							finalThresholdImage.setRGB(x,y,ImageOperations.mixColor(0, 0,0));
						}
						else {
							finalThresholdImage.setRGB(x,y,ImageOperations.mixColor(255, 255,255));
						}			
				}
			} catch (Exception e) {
				 e.getMessage();
			}
		}
		return finalThresholdImage;
	}

	public static BufferedImage negative(BufferedImage img) {		
		int height = img.getHeight();
		int width = img.getWidth();
		BufferedImage negativeImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

		int red = 0;
		int green = 0;
		int blue = 0;
		
		for (int x = 0; x < width; x++) {
			try {
				for (int y = 0; y < height; y++) {
					int color = img.getRGB(x, y);
					red = ImageOperations.getRed(color);
					green = ImageOperations.getGreen(color);
					blue = ImageOperations.getBlue(color);
					negativeImage.setRGB(x,y,ImageOperations.mixColor(255 - red, 255 - green, 255 - blue));
				}
			} catch (Exception e) {
				 e.getMessage();
			}
		}
		return negativeImage;
	}

	public static BufferedImage grayscale(BufferedImage img) {		
		int height = img.getHeight();
		int width = img.getWidth();
		BufferedImage grayscaleImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

		int red = 0;
		int green = 0;
		int blue = 0;
		
		for (int x = 0; x < width; x++) {
			try {
				for (int y = 0; y < height; y++) {
					int color = img.getRGB(x, y);
					red = ImageOperations.getRed(color);
					green = ImageOperations.getGreen(color);
					blue = ImageOperations.getBlue(color);
					int grayscale = (int)(0.2126 * red + 0.7152 * green + 0.0722 * blue);
					grayscaleImage.setRGB(x,y,ImageOperations.mixColor(grayscale, grayscale, grayscale));
				}
			} catch (Exception e) {
				 e.getMessage();
			}
		}
		return grayscaleImage;
	}

	public static BufferedImage brightening(BufferedImage img, int constant) {		
		int height = img.getHeight();
		int width = img.getWidth();
		BufferedImage brighteningImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

		int red = 0;
		int green = 0;
		int blue = 0;
		
		for (int x = 0; x < width; x++) {
			try {
				for (int y = 0; y < height; y++) {
					int color = img.getRGB(x, y);
					red = ImageOperations.getRed(color) + constant;
					green = ImageOperations.getGreen(color) + constant;
					blue = ImageOperations.getBlue(color) + constant;
					
					if (red > 255)
						red = 255;
					else if (red < 0)
						red = 0;
		
					if (green > 255)
						green = 255;
					else if (green < 0)
						green = 0;
				
					if (blue > 255)
						blue = 255;
					else if (blue < 0)
						blue = 0;
					brighteningImage.setRGB(x,y,ImageOperations.mixColor(red, green, blue));
				}
			} catch (Exception e) {
				 e.getMessage();
			}
		}
		return brighteningImage;
	}

	private static int mixColor(int red, int green, int blue) {
		return red<<16|green<<8|blue;
	}

	public static int getRed(int color) {
		return (color & 0x00ff0000)  >> 16;
	}
	
	public static int getGreen(int color) {
		return	(color & 0x0000ff00)  >> 8;
	}
	
	public static int getBlue(int color) {
		return (color & 0x000000ff) ;
		
	}

        public static BufferedImage OperasiAritmatikJumlah(BufferedImage img1, BufferedImage img2) {	
            int height1 = img1.getHeight();
            int width1 = img1.getWidth();	
            int height2 = img2.getHeight();
            int width2 = img2.getWidth();
            if (height1==height2 && width1==width2){
                BufferedImage Image = new BufferedImage(width1,height1,BufferedImage.TYPE_INT_RGB);

                int red1 = 0;
                int green1 = 0;
                int blue1 = 0;
                int red2 = 0;
                int green2 = 0;
                int blue2 = 0;
		
                for (int x = 0; x < width1; x++) {
                    for (int y = 0; y < height1; y++) {
                        int color1 = img1.getRGB(x, y);
                        int color2 = img2.getRGB(x, y);
                        red1 = ImageOperations.getRed(color1);
                        green1 = ImageOperations.getGreen(color1);
                        blue1 = ImageOperations.getBlue(color1);
                        red2 = ImageOperations.getRed(color2);
                        green2 = ImageOperations.getGreen(color2);
                        blue2 = ImageOperations.getBlue(color2);
                        
                        red1=(red1+red2)/2;
                        green1=(green1+green2)/2;
                        blue1=(blue1+blue2)/2;
                        
                        Image.setRGB(x,y,ImageOperations.mixColor(red1, green1,blue1));
                    }
                }
                return Image;
            }
            else{
                System.out.println("Kedua gambar memiliki tinggi dan lebar yang berbeda");
                return img1;
            }
            
        }
        
        public static BufferedImage OperasiAritmatikKurang(BufferedImage img1, BufferedImage img2) {	
            int height1 = img1.getHeight();
            int width1 = img1.getWidth();	
            int height2 = img2.getHeight();
            int width2 = img2.getWidth();
            if (height1==height2 && width1==width2){
                BufferedImage Image = new BufferedImage(width1,height1,BufferedImage.TYPE_INT_RGB);

                int red1 = 0;
                int green1 = 0;
                int blue1 = 0;
                int red2 = 0;
                int green2 = 0;
                int blue2 = 0;
		
                for (int x = 0; x < width1; x++) {
                    for (int y = 0; y < height1; y++) {
                        int color1 = img1.getRGB(x, y);
                        int color2 = img2.getRGB(x, y);
                        red1 = ImageOperations.getRed(color1);
                        green1 = ImageOperations.getGreen(color1);
                        blue1 = ImageOperations.getBlue(color1);
                        red2 = ImageOperations.getRed(color2);
                        green2 = ImageOperations.getGreen(color2);
                        blue2 = ImageOperations.getBlue(color2);
                        
                        if(red1-red2<0){
                            red1=0;
                        }
                        else{
                            red1-=red2;
                        }
                        if(green1-green2<0){
                            green1=0;
                        }
                        else{
                            green1-=green2;
                        }
                        if(blue1-blue2<0){
                            blue1=0;
                        }
                        else{
                            blue1-=blue2;
                        }
                        
                        Image.setRGB(x,y,ImageOperations.mixColor(red1, green1,blue1));
                    }
                }
                return Image;
            }
            else{
                System.out.println("Kedua gambar memiliki tinggi dan lebar yang berbeda");
                return img1;
            }
            
        }
        
        public static BufferedImage OperasiAritmatikKali(BufferedImage img1, BufferedImage img2) {	
            int height1 = img1.getHeight();
            int width1 = img1.getWidth();	
            int height2 = img2.getHeight();
            int width2 = img2.getWidth();
            if (height1==height2 && width1==width2){
                BufferedImage Image = new BufferedImage(width1,height1,BufferedImage.TYPE_INT_RGB);

                int red1 = 0;
                int green1 = 0;
                int blue1 = 0;
                int red2 = 0;
                int green2 = 0;
                int blue2 = 0;
		
                for (int x = 0; x < width1; x++) {
                    for (int y = 0; y < height1; y++) {
                        int color1 = img1.getRGB(x, y);
                        int color2 = img2.getRGB(x, y);
                        red1 = ImageOperations.getRed(color1);
                        green1 = ImageOperations.getGreen(color1);
                        blue1 = ImageOperations.getBlue(color1);
                        red2 = ImageOperations.getRed(color2);
                        green2 = ImageOperations.getGreen(color2);
                        blue2 = ImageOperations.getBlue(color2);
                        
                        if(red1*red2>255){
                            red1=255;
                        }
                        else{
                            red1*=red2;
                        }
                        if(green1*green2>255){
                            green1=255;
                        }
                        else{
                            green1*=green2;
                        }
                        if(blue1*blue2>255){
                            blue1=255;
                        }
                        else{
                            blue1*=blue2;
                        }
                        
                        Image.setRGB(x,y,ImageOperations.mixColor(red1, green1,blue1));
                    }
                }
                return Image;
            }
            else{
                System.out.println("Kedua gambar memiliki tinggi dan lebar yang berbeda");
                return img1;
            }
            
        }
        
        public static BufferedImage OperasiAritmatikJumlahSkalar(BufferedImage img, int a) {	
            int height = img.getHeight();
            int width = img.getWidth();
            BufferedImage Image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

            int red = 0;
            int green = 0;
            int blue = 0;
		
            for (int x = 0; x < width; x++) {
                    for (int y = 0; y < height; y++) {
                        int color1 = img.getRGB(x, y);
                        red = ImageOperations.getRed(color1);
                        green = ImageOperations.getGreen(color1);
                        blue = ImageOperations.getBlue(color1);
                        
                        if(red+a>255){
                            red=255;
                        }
                        else{
                            red+=a;
                        }
                        if(green+a>255){
                            green=255;
                        }
                        else{
                            green+=a;
                        }
                        if(blue+a>255){
                            blue=255;
                        }
                        else{
                            blue+=a;
                        }
                        
                        Image.setRGB(x,y,ImageOperations.mixColor(red, green,blue));
                    }
            }
            return Image;
        }
        
        public static BufferedImage OperasiAritmatikKurangSkalar(BufferedImage img, int a) {	
            int height = img.getHeight();
            int width = img.getWidth();
            BufferedImage Image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

            int red = 0;
            int green = 0;
            int blue = 0;
		
            for (int x = 0; x < width; x++) {
                    for (int y = 0; y < height; y++) {
                        int color1 = img.getRGB(x, y);
                        red = ImageOperations.getRed(color1);
                        green = ImageOperations.getGreen(color1);
                        blue = ImageOperations.getBlue(color1);
                        
                        if(red-a<0){
                            red=0;
                        }
                        else{
                            red-=a;
                        }
                        if(green-a<0){
                            green=0;
                        }
                        else{
                            green-=a;
                        }
                        if(blue-a<0){
                            blue=0;
                        }
                        else{
                            blue-=a;
                        }
                        
                        Image.setRGB(x,y,ImageOperations.mixColor(red, green,blue));
                    }
            }
            return Image;
        }
        
        public static BufferedImage OperasiAritmatikKaliSkalar(BufferedImage img, int a) {	
            int height = img.getHeight();
            int width = img.getWidth();
            BufferedImage Image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

            int red = 0;
            int green = 0;
            int blue = 0;
		
            for (int x = 0; x < width; x++) {
                    for (int y = 0; y < height; y++) {
                        int color1 = img.getRGB(x, y);
                        red = ImageOperations.getRed(color1);
                        green = ImageOperations.getGreen(color1);
                        blue = ImageOperations.getBlue(color1);
                        
                        if(red*a>255){
                            red=255;
                        }
                        else{
                            red*=a;
                        }
                        if(green*a>255){
                            green=255;
                        }
                        else{
                            green*=a;
                        }
                        if(blue*a>255){
                            blue=255;
                        }
                        else{
                            blue*=a;
                        }
                        
                        Image.setRGB(x,y,ImageOperations.mixColor(red, green,blue));
                    }
            }
            return Image;
        }
        
        public static BufferedImage OperasiAritmatikBagiSkalar(BufferedImage img, int a) {	
            int height = img.getHeight();
            int width = img.getWidth();
            BufferedImage Image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

            int red;
            int green;
            int blue;
		
            for (int x = 0; x < width; x++) {
                    for (int y = 0; y < height; y++) {
                        int color1 = img.getRGB(x, y);
                        red = ImageOperations.getRed(color1);
                        green = ImageOperations.getGreen(color1);
                        blue = ImageOperations.getBlue(color1);
                        
                        Image.setRGB(x,y,ImageOperations.mixColor(red/a, green/a,blue/a));
                    }
            }
            return Image;
        }
        
        public static BufferedImage OperasiBooleanAND(BufferedImage img1, BufferedImage img2) {	
            int height1 = img1.getHeight();
            int width1 = img1.getWidth();	
            int height2 = img2.getHeight();
            int width2 = img2.getWidth();
            if (height1==height2 && width1==width2){
                BufferedImage Image = new BufferedImage(width1,height1,BufferedImage.TYPE_INT_RGB);

                int red1;
                int green1;
                int blue1;
                int red2;
                int green2;
                int blue2;
		
                for (int x = 0; x < width1; x++) {
                    for (int y = 0; y < height1; y++) {
                        int color1 = img1.getRGB(x, y);
                        int color2 = img2.getRGB(x, y);
                        red1 = ImageOperations.getRed(color1);
                        green1 = ImageOperations.getGreen(color1);
                        blue1 = ImageOperations.getBlue(color1);
                        red2 = ImageOperations.getRed(color2);
                        green2 = ImageOperations.getGreen(color2);
                        blue2 = ImageOperations.getBlue(color2);
                        
                        red1 = red1 & red2;
                        green1 = green1 & green2;
                        blue1 = blue1 & blue2;
                        
                        Image.setRGB(x,y,ImageOperations.mixColor(red1, green1,blue1));
                    }
                }
                return Image;
            }
            else{
                System.out.println("Kedua gambar memiliki tinggi dan lebar yang berbeda");
                return img1;
            }
            
        }
        
        public static BufferedImage OperasiBooleanOR(BufferedImage img1, BufferedImage img2) {	
            int height1 = img1.getHeight();
            int width1 = img1.getWidth();	
            int height2 = img2.getHeight();
            int width2 = img2.getWidth();
            if (height1==height2 && width1==width2){
                BufferedImage Image = new BufferedImage(width1,height1,BufferedImage.TYPE_INT_RGB);

                int red1;
                int green1;
                int blue1;
                int red2;
                int green2;
                int blue2;
		
                for (int x = 0; x < width1; x++) {
                    for (int y = 0; y < height1; y++) {
                        int color1 = img1.getRGB(x, y);
                        int color2 = img2.getRGB(x, y);
                        red1 = ImageOperations.getRed(color1);
                        green1 = ImageOperations.getGreen(color1);
                        blue1 = ImageOperations.getBlue(color1);
                        red2 = ImageOperations.getRed(color2);
                        green2 = ImageOperations.getGreen(color2);
                        blue2 = ImageOperations.getBlue(color2);
                        
                        red1 = red1 | red2;
                        green1 = green1 | green2;
                        blue1 = blue1 | blue2;
                        
                        Image.setRGB(x,y,ImageOperations.mixColor(red1, green1,blue1));
                    }
                }
                return Image;
            }
            else{
                System.out.println("Kedua gambar memiliki tinggi dan lebar yang berbeda");
                return img1;
            }
            
        }
        
        public static BufferedImage OperasiBooleanNOT(BufferedImage img) {	
            int height = img.getHeight();
            int width = img.getWidth();
            BufferedImage Image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
            for (int x = 0; x < width; x++) {
                    for (int y = 0; y < height; y++) {
                        int color = img.getRGB(x, y);
                        Image.setRGB(x,y,~color);
                    }
            }
            return Image;
        }
        
        public static BufferedImage OperasiGeometriTranslasi(BufferedImage img, int m, int n) {

        int height = img.getHeight();
        int width = img.getWidth();
        BufferedImage Image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width-m; x++) {
            for (int y = 0; y < height-n; y++) {
                int color = img.getRGB(x, y);


                Image.setRGB(x+m,y+n,(color));
            }
        }
        return Image;
    }
        
        public static BufferedImage Flipping(BufferedImage img) {
        int height = img.getHeight();
        int width = img.getWidth();
        BufferedImage Image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int z = width -1;
        for(int x=0; x<width;x++){
            for(int y=0; y<height;y++){
                int color = img.getRGB(x, y);

                Image.setRGB(z,y,(color));
            }
            z--;
        }
        return Image;
    }
        
        public static BufferedImage OperasiGeometriRotasiCW90(BufferedImage img) {
            int height = img.getHeight();
            int width = img.getWidth();
            BufferedImage Image = new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB);

            int z;
            for(int x=0; x<width;x++){
                z = height -1;
                for(int y=0;y<height;y++){
                    int color = img.getRGB(x, y);

                    Image.setRGB(z,x,(color));
                    z--;
                }
            }
            return Image;
        }
        
        public static BufferedImage OperasiGeometriZoom(BufferedImage img) {
        int height = img.getHeight();
        int width = img.getWidth();

        BufferedImage Image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int m=0,n=0;
        for (int x = 0; x < height/2; x++) {
            for (int y = 0; y < width/2; y++) {
                int color1 = img.getRGB(x, y);
                int color2 = img.getRGB(x+1, y);
                int color3 = img.getRGB(x, y+1);
                int color4 = img.getRGB(x+1, y+1);

                    Image.setRGB(n, m, (color1));
                    Image.setRGB(n+1, m, (color2));
                    Image.setRGB(n, m+1, (color3));
                    Image.setRGB(n+1, m+1, (color4));
                    n=n+2;
                }
                m=m+2;
                n=0;

        }
        return Image;
    }
        
        public static BufferedImage OperasiTepiSobel(BufferedImage img) {
            int x = img.getWidth();
            int y = img.getHeight();
            BufferedImage imga = new BufferedImage(x, y, BufferedImage.TYPE_INT_RGB);
            
            int[][] edgeColors = new int[x][y];
            int maxGradient = -1;
            
            for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {

                int val00 = getGrayScale(img.getRGB(i - 1, j - 1));
                int val01 = getGrayScale(img.getRGB(i - 1, j));
                int val02 = getGrayScale(img.getRGB(i - 1, j + 1));

                int val10 = getGrayScale(img.getRGB(i, j - 1));
                int val11 = getGrayScale(img.getRGB(i, j));
                int val12 = getGrayScale(img.getRGB(i, j + 1));

                int val20 = getGrayScale(img.getRGB(i + 1, j - 1));
                int val21 = getGrayScale(img.getRGB(i + 1, j));
                int val22 = getGrayScale(img.getRGB(i + 1, j + 1));

                int gx =  ((-1 * val00) + (0 * val01) + (1 * val02)) 
                        + ((-2 * val10) + (0 * val11) + (2 * val12))
                        + ((-1 * val20) + (0 * val21) + (1 * val22));

                int gy =  ((-1 * val00) + (-2 * val01) + (-1 * val02))
                        + ((0 * val10) + (0 * val11) + (0 * val12))
                        + ((1 * val20) + (2 * val21) + (1 * val22));

                double gval = Math.sqrt((gx * gx) + (gy * gy));
                int g = (int) gval;

                if(maxGradient < g) {
                    maxGradient = g;
                }

                edgeColors[i][j] = g;
            }
        }

        double scale = 255.0 / maxGradient;

        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                int edgeColor = edgeColors[i][j];
                edgeColor = (int)(edgeColor * scale);
                edgeColor = 0xff000000 | (edgeColor << 16) | (edgeColor << 8) | edgeColor;

                imga.setRGB(i, j, edgeColor);
            }
        }
            
            return imga;
        }
        
        public static int  getGrayScale(int rgb) {
        int r = (rgb >> 16) & 0xff;
        int g = (rgb >> 8) & 0xff;
        int b = (rgb) & 0xff;

        int gray = (int)(0.2126 * r + 0.7152 * g + 0.0722 * b);

        return gray;
    }
        
        
}