package shapes;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**
 * Класс для окружности
 * <p>Методы: {@link #haveShareDots(Circles, Circles)}
 */
public class Circle {
    private final int radius;
    Dot center;

    /**
     * Конструктор окружности по параметрам
     *
     * @param coordX координата центра по оси Х
     * @param coordY координата центра по оси Y
     * @param radius радиус создаваемой окружности, принимает только значения больше 1, иначе вызывает исключение {@link IllegalArgumentException}
     */
    public Circle(int coordX, int coordY, int radius) {
        center = new Dot(coordX, coordY);
        if (radius >= 1) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius can't be less 1");
        }
    }

    /**
     * Конструктор для случайной окружности, не принимает параметров
     */
    public Circle() {
        Random rnd = new Random();
        center = new Dot(rnd.nextInt(-255, 256), rnd.nextInt(-255, 256));
        this.radius = rnd.nextInt(1, 50);
    }

    /**
     * Метод для определения общих точек у двух {@link #Circle окружностей}
     *
     * @param circle1 объект первой окружности
     * @param circle2 объект второй окружности
     * @return true/false - если окружности имеют одну и больше общих точек или не имеют
     */
    public static boolean haveShareDots(@NotNull Circles circles1, @NotNull Circles circles2) {
        double distance = Dots.distanceBeetwenDots(circles1.dots, circles2.dots);
        return (circles1.radius + circles2.radius) >= distance;
    }

    public Dot getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }
}
