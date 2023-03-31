package shapes;

import org.jetbrains.annotations.NotNull;

public class Dot {
    private final int coordX;
    private final int coordY;

    public Dot(int coordX, int coordY) {
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
     * Метод для подсчета расстояния между двумя координатами {@link Circle#Circle окружностей}
     *
     * @param circles1Dot объект {@link #Dot} первой окружности
     * @param circles2Dot объект {@link #Dot} второй окружности
     * @return расстояние, число типа {@code double}
     */
    static protected double distanceBeetwenDots(@NotNull Dot circles1Dot, @NotNull Dot circles2Dot) {
        return Math.sqrt(Math.pow((circles1Dot.getCoordX() - circles2Dot.getCoordX()), 2) + Math.pow((circles1Dot.getCoordY() - circles2Dot.getCoordY()), 2));
    }
}
