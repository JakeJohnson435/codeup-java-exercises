package shapes;

public class Square extends Quadrilateral implements Measurable{

    public Square(double side){
        super(side, side);
    }


    @Override
    void setLength() {

    }

    @Override
    void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return 2*length + 2*width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
