import shapes.Circles;

public class Main {
    public static void main(String[] args) {
        try {
            Circles circles1 = new Circles(0, 0, 2);
            Circles circles2 = new Circles(1, 1, 2);
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