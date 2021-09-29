package ru.vsu.computergraphics.levin;

import java.util.*;

public class Model {


    ArrayList<Vector3f> vertices;
    ArrayList<Vector2f> textureVertices;
    ArrayList<Vector3f> normals;
    // Каждый контейнер - список полигонов, где полигон описывается индексами вершин, текстурных вершин или нормалей.
    // Индексов для полигона может быть 3 (треугольник) и более.
    ArrayList<ArrayList<Integer>> polygonVertexIndices;
    ArrayList<ArrayList<Integer>> polygonTextureVertexIndices;
    ArrayList<ArrayList<Integer>> polygonNormalIndices;
    public Model() {
        vertices = new ArrayList<>();
        textureVertices = new ArrayList<>();
        normals = new ArrayList<>();
        polygonVertexIndices = new ArrayList<>();
        polygonTextureVertexIndices = new ArrayList<>();
        polygonNormalIndices = new ArrayList<>();
    }

    public List<Vector3f> getVertices() {
        return vertices;
    }

    public List<Vector2f> getTextureVertices() {
        return textureVertices;
    }

    public List<Vector3f> getNormals() {
        return normals;
    }

    public List<ArrayList<Integer>> getPolygonVertexIndices() {
        return polygonVertexIndices;
    }

    public List<ArrayList<Integer>> getPolygonTextureVertexIndices() {
        return polygonTextureVertexIndices;
    }

    public List<ArrayList<Integer>> getPolygonNormalIndices() {
        return polygonNormalIndices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(vertices, model.vertices) &&
                Objects.equals(textureVertices, model.textureVertices) &&
                Objects.equals(normals, model.normals) &&
                Objects.equals(polygonVertexIndices, model.polygonVertexIndices) &&
                Objects.equals(polygonTextureVertexIndices, model.polygonTextureVertexIndices) &&
                Objects.equals(polygonNormalIndices, model.polygonNormalIndices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertices, textureVertices, normals, polygonVertexIndices, polygonTextureVertexIndices, polygonNormalIndices);
    }
}
