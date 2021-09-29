package ru.vsu.cs.levin;

import ru.vsu.computergraphics.levin.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.computergraphics.levin.modeltranslator.ModelTranslator;
import ru.vsu.computergraphics.levin.objreader.ObjReader;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class ModelTranslatorTest {
    @Test
    void testModelTranslator01() throws IOException {
        Model model = ObjReader.read(new String(Files.readAllBytes(Paths.get("test/input/test.obj")), StandardCharsets.UTF_8));
        Model expectedResult = ObjReader.read(new String(Files.readAllBytes(Paths.get("test/result/result1.obj")), StandardCharsets.UTF_8));
        ModelTranslator modelTranslator = new ModelTranslator(model);
        modelTranslator.translate(1f, 2f, 3f);
        Assertions.assertEquals(expectedResult, model);
    }

    @Test
    void testModelTranslator02() throws IOException {
        Model model = ObjReader.read(new String(Files.readAllBytes(Paths.get("test/input/test.obj")), StandardCharsets.UTF_8));
        Model expectedResult = ObjReader.read(new String(Files.readAllBytes(Paths.get("test/result/result2.obj")), StandardCharsets.UTF_8));
        ModelTranslator modelTranslator = new ModelTranslator(model);
        modelTranslator.translate(0, 0, 0);
        Assertions.assertEquals(expectedResult, model);
    }

    @Test
    void testModelTranslator03() throws IOException {
        Model model = ObjReader.read(new String(Files.readAllBytes(Paths.get("test/input/test.obj")), StandardCharsets.UTF_8));
        Model expectedResult = ObjReader.read(new String(Files.readAllBytes(Paths.get("test/result/result3.obj")), StandardCharsets.UTF_8));
        ModelTranslator modelTranslator = new ModelTranslator(model);
        modelTranslator.translate(-1f, -1f, -1f);
        Assertions.assertEquals(expectedResult, model);
    }
}
