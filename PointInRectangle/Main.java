package Abstraction.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());
        Rectangle rectangle = new Rectangle();
        Point pointBottomLeft = new Point();
        Point pointTopRight = new Point();
        pointBottomLeft.setX(input[0]);
        pointBottomLeft.setY(input[1]);
        pointTopRight.setX(input[2]);
        pointTopRight.setY(input[3]);
        rectangle.setBottomLeft(pointBottomLeft);
        rectangle.setTopRight(pointTopRight);
        while(n > 0){
            Point newPoint = new Point();
            int[] points = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            newPoint.setX(points[0]);
            newPoint.setY(points[1]);
            System.out.println(rectangle.contains(newPoint));
            n--;
        }


    }



}
