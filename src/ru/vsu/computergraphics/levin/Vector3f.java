package ru.vsu.computergraphics.levin;

import java.util.Objects;

// В будущем эти классы будут реализовывать общий интерфейс. Это тема следующих занятий.
public class Vector3f {
    protected float x;
    float y;
    float z;
    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean vector3fEquals(Vector3f other) {
        // todo: потом это будет глобальная константа
        final float eps = 1e-7f;
        return Math.abs(x - other.x) < eps && Math.abs(y - other.y) < eps && Math.abs(z - other.z) < eps;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3f vector3f = (Vector3f) o;
        return Float.compare(vector3f.x, x) == 0 &&
                Float.compare(vector3f.y, y) == 0 &&
                Float.compare(vector3f.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
