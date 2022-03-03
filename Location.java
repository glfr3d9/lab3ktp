/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location {
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;

    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location() {
        this(0, 0);
    }

    //Подготовка класса
    /** Метод сравнения **/
    public boolean equals(Object target) {
        if (target instanceof Location){
            Location other = (Location) target;
            if (xCoord == other.xCoord && yCoord == other.yCoord){
                return true;
            }
        }
        return false;
    }

    /** Генерация Хэш-кода **/
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + xCoord;
        result = PRIME * result + yCoord;
        return result;
    }
}
