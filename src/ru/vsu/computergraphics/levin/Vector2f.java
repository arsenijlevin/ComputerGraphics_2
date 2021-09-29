package ru.vsu.computergraphics.levin;

import java.util.Objects;

// В будущем эти классы будут реализовывать общий интерфейс. Это тема следующих занятий.
public class Vector2f {
    float x, y;

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2f vector2f = (Vector2f) o;
        return Float.compare(vector2f.x, x) == 0 &&
                Float.compare(vector2f.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
