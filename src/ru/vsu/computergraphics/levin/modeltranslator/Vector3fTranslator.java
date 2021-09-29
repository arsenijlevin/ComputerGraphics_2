package ru.vsu.computergraphics.levin.modeltranslator;

import ru.vsu.computergraphics.levin.Vector3f;

public class Vector3fTranslator {
    private final Vector3f vector3f;

    public Vector3fTranslator(Vector3f vector3f) {
        this.vector3f = vector3f;
    }

    public Vector3f translate(float x, float y, float z) {
        vector3f.setX(vector3f.getX() + x);
        vector3f.setY(vector3f.getY() + y);
        vector3f.setZ(vector3f.getZ() + z);
        return this.vector3f;
    }

    public Vector3f getVector3f() {
        return this.vector3f;
    }
}
