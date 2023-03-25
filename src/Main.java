public class Main {
    public static void main(String[] args) {
        try {
            Circles circles1 = new Circles(0, 0, 2);
            Circles circles2 = new Circles(1, 1, 2);
            Circles circles3 = new Circles(1, 1, -1);
            Circles randomCircles = new Circles();
            if (Circles.haveShareDots(circles1, circles2)) {
                System.out.print("Circles have share dots");
            } else {
                System.out.print("Circles haven't share dots");
            }
        } catch (Exception e) {
            System.out.println("Circles radius less 1!!");
        }
    }
}