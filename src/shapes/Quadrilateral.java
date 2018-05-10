package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
    abstract void setLength();
    abstract void setWidth();
}
