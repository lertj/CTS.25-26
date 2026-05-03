package ro.ase.acs.flyweight;

public class Obiect3D {
    private float volume;
    private int x;
    private int y;
    private int z;
    private boolean isMoveable;

    public Obiect3D(float volume, int x, int y, int z, boolean isMoveable) {
        this.volume = volume;
        this.x = x;
        this.y = y;
        this.z = z;
        this.isMoveable = isMoveable;
    }

    @Override
    public String toString() {
        return "Obiect3D{" +
                "volume=" + volume +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", isMoveable=" + isMoveable +
                '}';
    }
}
