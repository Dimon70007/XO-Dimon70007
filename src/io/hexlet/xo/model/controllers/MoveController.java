package io.hexlet.xo.model.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Point point,
                            final Field field,
                            final Figure figure)
            throws InvalidPointException,
            AlreadyOccupiedException{
        //тут проверка соответствует правилам игры- то есть
        // бизнесс логике модели, а ее описывает контроллер
        if (field.getFigure(point)!=null){

            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }
}
