package io.hexlet.xo.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by OTBA}|{HbIu` on 06.08.16.
 */
public class PlayerTest {
    @Test
    public void getName() throws Exception {

        final String inputValue="Dima";
        final String expectedValue=inputValue;

        Player player= new Player(inputValue,null);

        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getFigure() throws Exception {

        final Figure inputValue=Figure.O;
        final Figure expectedValue=inputValue;

        Player player= new Player(null,inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);
    }

}