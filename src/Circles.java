import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Circles {
    private final int coordX;
    private final int coordY;
    private final int radius;

    /**
     * Конструктор окружности по параметрам
     *
     * @param coordX координата центра по оси Х
     * @param coordY координата центра по оси Y
     * @param radius радиус создаваемой окружности, принимает только значения больше 1, иначе вызывает исключение {@link IllegalArgumentException}
     */
    Circles(int coordX, int coordY, int radius) {
        this.coordX = coordX;
        this.coordY = coordY;
        if (radius >= 1) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Конструктор для случайной окружности, не принимает параметров
     */
    Circles() {
        Random rnd = new Random();
        this.coordX = rnd.nextInt(-255, 256);
        this.coordY = rnd.nextInt(-255, 256);
        this.radius = rnd.nextInt(1, 50);
    }

    /**
     * Метод для определения общих точек у двух {@link #Circles окружностей}
     *
     * @param circles1 объект первой окружности
     * @param circles2 объект второй окружности
     * @return true/false - если окружности имеют одну и больше общих точек или не имеют
     */
    public static boolean haveShareDots(Circles circles1, Circles circles2) {
        double distance = distanceBeetwenDots(circles1, circles2);
        return (circles1.radius + circles2.radius) >= distance;
    }

    /**
     * Метод для подсчета расстояния между двумя координатами {@link #Circles окружностей}
     *
     * @param circles1 объект первой окружности
     * @param circles2 объект второй окружности
     * @return расстояние, число типа {@code double}
     */
    private static double distanceBeetwenDots(@NotNull Circles circles1, @NotNull Circles circles2) {
        return Math.sqrt(Math.pow((circles1.coordX - circles2.coordX), 2) + Math.pow((circles1.coordY - circles2.coordY), 2));
    }

    //Нужны ли вообще геттеры?
    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public int getRadius() {
        return radius;
    }
}
