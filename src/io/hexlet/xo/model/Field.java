package io.hexlet.xo.model;

import io.hexlet.xo.model.exceptions.InvalidPointException;

import java.awt.*;

/**
 * Created by OTBA}|{HbIu` on 06.08.16.
 */
public class Field {

    private static final int FIELD_SIZE = 3;
    private static final int MIN_COORDINATE = 0;
    private final Figure[][] field= new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize(){

        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException{
        if (!checkPoint(point)){
            throw new InvalidPointException();
        }
            return field[point.x][point.y];

    }

    public void setFigure(final Point point,
                          final  Figure figure)
            throws InvalidPointException{
        //тут идет проверка правильности координаты,
        // т.к. при неправильной координате мы получим
        // исключение ArrayIndexOutOfBounds и эту проверку
        //в контроллер не перекинешь
        if (!checkPoint(point)){
            throw new InvalidPointException();
        }

        field[point.x][point.y]=figure;
    }

    private boolean checkPoint(final Point point){

        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate){

        return coordinate>= MIN_COORDINATE && coordinate< FIELD_SIZE;
    }
}
