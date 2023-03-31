import shapes.Circle;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle1 = new Circle(1, 1, 4);
            Circle circle2 = new Circle(0, 1, 3);
            //Circles circlesNull = null;
            //Circles.haveShareDots(circlesNull, circles2);
            //Circles circles3 = new Circles(1, 1, -1);
            //Circles randomCircles = new Circles();
            int x = circle1.getCenter().getCoordX();
            if (Circle.haveShareDots(circle1, circle2)) {
                System.out.print("Circles have share dots");
            } else {
                System.out.print("Circles haven't share dots");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}