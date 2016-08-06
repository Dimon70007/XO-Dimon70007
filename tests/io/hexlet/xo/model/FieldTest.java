package io.hexlet.xo.model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by OTBA}|{HbIu` on 06.08.16.
 */
public class FieldTest {
    @Test
    public void getSize() throws Exception {

        Field field=new Field();

        assertEquals(3,field.getSize());
    }

    @Test
    public void setFigure() throws Exception {

        final Field field= new Field();
        final Point inputPoint=new Point(0,0);
        final Figure inputFigure=Figure.X;

        field.setFigure(inputPoint,inputFigure);
        final Figure actualFigure=field.getFigure(inputPoint);

        assertEquals(inputFigure,actualFigure);

    }

}