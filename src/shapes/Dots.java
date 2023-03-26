package shapes;

import org.jetbrains.annotations.NotNull;

public class Dots {
    private final int coordX;
    private final int coordY;

    public Dots(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    public int getCoordX() {
        return coordX;
    }
    public int getCoordY() {
        return coordY;
    }
    /**
     * Метод для подсчета расстояния между двумя координатами {@link Circles#Circles окружностей}
     *
     * @param circles1Dots объект {@link #Dots} первой окружности
     * @param circles2Dots объект {@link #Dots} второй окружности
     * @return расстояние, число типа {@code double}
     */
    static protected double distanceBeetwenDots(@NotNull Dots circles1Dots, @NotNull Dots circles2Dots) {
        return Math.sqrt(Math.pow((circles1Dots.getCoordX() - circles2Dots.getCoordX()), 2) + Math.pow((circles1Dots.getCoordY() - circles2Dots.getCoordY()), 2));
    }
}
