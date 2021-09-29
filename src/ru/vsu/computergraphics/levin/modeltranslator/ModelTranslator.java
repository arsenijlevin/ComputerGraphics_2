package ru.vsu.computergraphics.levin.modeltranslator;

import ru.vsu.computergraphics.levin.Model;
import ru.vsu.computergraphics.levin.Vector3f;

public class ModelTranslator {
    private final Model model;

    public ModelTranslator(Model model) {
        this.model = model;
    }

    public void translate(float x, float y, float z) {
        for (Vector3f vector3f : model.getVertices()) {
            Vector3fTranslator vector3fTranslator = new Vector3fTranslator(vector3f);
            vector3fTranslator.translate(x, y, z);
        }
    }

    public Model getModel() {
        return model;
    }
}
