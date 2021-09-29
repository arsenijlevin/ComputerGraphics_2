package ru.vsu.cs.levin;


import ru.vsu.computergraphics.levin.Vector3f;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.computergraphics.levin.modeltranslator.Vector3fTranslator;


class Vector3FTranslatorTest {
    @Test
    void testVectorMover01() {
        Vector3f vector3f = new Vector3f(1, 2, 3);
        Vector3f result = new Vector3f(1.01f, 2.01f, 3.01f);
        Vector3f expectedResult = new Vector3fTranslator(vector3f).translate(0.01f, 0.01f, 0.01f);
        Assertions.assertTrue(result.vector3fEquals(expectedResult));
    }

    @Test
    void testVectorMover02() {
        Vector3f vector3f = new Vector3f(0, 0, 0);
        Vector3f result = new Vector3f(0.01f, 0.01f, 0.01f);
        Vector3f expectedResult = new Vector3fTranslator(vector3f).translate(0.01f, 0.01f, 0.01f);
        Assertions.assertTrue(result.vector3fEquals(expectedResult));
    }

    @Test
    void testVectorMover03() {
        Vector3f vector3f = new Vector3f(1000, 1000, 1000);
        Vector3f result = new Vector3f(-1000f, -2000f, -3000f);
        Vector3f expectedResult = new Vector3fTranslator(vector3f).translate(-2000f, -3000f, -4000f);
        Assertions.assertTrue(result.vector3fEquals(expectedResult));
    }

    @Test
    void testVectorMover04() {
        Vector3f vector3f = new Vector3f(-10, -20, -30);
        Vector3f result = new Vector3f(0, 0, 0);
        Vector3f expectedResult = new Vector3fTranslator(vector3f).translate(10f, 20f, 30f);
        Assertions.assertTrue(result.vector3fEquals(expectedResult));
    }

    @Test
    void testVectorMover05() {
        Vector3f vector3f = new Vector3f(-10, -20, -30);
        Vector3f result = new Vector3f(0, 0, 0);
        Vector3f expectedResult = new Vector3fTranslator(vector3f).translate(10f, 20f, 30f);
        Assertions.assertTrue(result.vector3fEquals(expectedResult));
    }
}
