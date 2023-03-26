package shapes;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**
 * Класс для окружности
 * <p>Методы: {@link #haveShareDots(Circles, Circles)}
 */
public class Circles {
    private final int radius;
    Dots dots;

    /**
     * Конструктор окружности по параметрам
     *
     * @param coordX координата центра по оси Х
     * @param coordY координата центра по оси Y
     * @param radius радиус создаваемой окружности, принимает только значения больше 1, иначе вызывает исключение {@link IllegalArgumentException}
     */
    public Circles(int coordX, int coordY, int radius) {
        dots = new Dots(coordX, coordY);
        if (radius >= 1) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Конструктор для случайной окружности, не принимает параметров
     */
    public Circles() {
        Random rnd = new Random();
        dots = new Dots(rnd.nextInt(-255, 256), rnd.nextInt(-255, 256));
        this.radius = rnd.nextInt(1, 50);
    }

    /**
     * Метод для определения общих точек у двух {@link #Circles окружностей}
     *
     * @param circles1 объект первой окружности
     * @param circles2 объект второй окружности
     * @return true/false - если окружности имеют одну и больше общих точек или не имеют
     */
    public static boolean haveShareDots(@NotNull Circles circles1, @NotNull Circles circles2) {
        double distance = Dots.distanceBeetwenDots(circles1.dots, circles2.dots);
        return (circles1.radius + circles2.radius) >= distance;
    }

    public Dots getDots() {
        return dots;
    }

    public int getRadius() {
        return radius;
    }
}
