package io.hexlet.xo.model;

import io.hexlet.xo.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by OTBA}|{HbIu` on 06.08.16.
 */
public class FieldTest {
    @Test
    public void testGetSize() throws Exception {

        Field field=new Field();

        assertEquals(3,field.getSize());
    }

    @Test
    public void testSetFigure() throws Exception {

        final Field field= new Field();
        final Point inputPoint=new Point(0,0);
        final Figure inputFigure=Figure.X;

        field.setFigure(inputPoint,inputFigure);
        final Figure actualFigure=field.getFigure(inputPoint);

        assertEquals(inputFigure,actualFigure);

    }


    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception {

        final Field field= new Field();
        final Point inputPoint=new Point(0,0);

        final Figure actualFigure=field.getFigure(inputPoint);

        assertNull(actualFigure);

    }


    @Test
    public void testGetFigureWhenXIsLessThenZero() throws Exception {

        final Field field= new Field();
        final Point inputPoint=new Point(-1,0);

        try{
            field.getFigure(inputPoint);
            fail();
        }catch(InvalidPointException e){}

    }
    @Test
    public void testGetFigureWhenYIsLessThenZero() throws Exception {

        final Field field= new Field();
        final Point inputPoint=new Point(0,-1);

        try{
            field.getFigure(inputPoint);
            fail();
        }catch(InvalidPointException e){}

    }


    @Test
    public void testGetFigureWhenXIsMoreThenSize() throws Exception {

        final Field field= new Field();
        final Point inputPoint=new Point(field.getSize()+1,0);

        try{
            field.getFigure(inputPoint);
            fail();
        }catch(InvalidPointException e){}

    }
    @Test
    public void testGetFigureWhenYIsMoreThenSize() throws Exception {

        final Field field= new Field();
        final Point inputPoint=new Point(0,field.getSize()+1);

        try{
            field.getFigure(inputPoint);
            fail();
        }catch(InvalidPointException e){}

    }

}