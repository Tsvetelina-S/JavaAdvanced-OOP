package Abstraction.PointInRectangle;

public class Rectangle {
    private Point bottomLeft; //x ans y
    private Point topRight;// x and y

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public boolean contains (Point point){

        boolean isX = false;
        if((this.bottomLeft.getX() <= point.getX() &&
        this.topRight.getX() >= point.getX())){
            isX = true;
        }
        boolean isY = false;
        if(this.topRight.getY() >= point.getY() && this.bottomLeft.getY() <= point.getY()){
            isY = true;
        }

        return (isX) && (isY);
    }
}
