package figures;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(){
    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void printRectangle(){
        System.out.println("-----Printing Rectangle " + width + " x " + height + " -----");
        for (int i = 0; i < height; i++){
            for (int h = 0; h < width; h++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public void printPerimeter(){
        int perimeter = 2  * (width + height);
        System.out.println("Rectangle Perimeter: " + perimeter + " [cm]");
    }

    public void printArea() {
        int area = width * height;
        System.out.println("Rectangle Area: " + area + " [cm2]");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

