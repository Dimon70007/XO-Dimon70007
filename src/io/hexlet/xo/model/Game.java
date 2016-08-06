package io.hexlet.xo.model;

/**
 * Created by OTBA}|{HbIu` on 06.08.16.
 */
public class Game {

    private final Player[] players;
    private static String GAME_NAME="XO";
    private final Field field;

    public Game(Player[] players, Field field) {

        this.players = players;
        this.field = field;
    }

    public Player[] getPlayers() {
        return players;
    }

    public static String getGameName() {
        return GAME_NAME;
    }

    public Field getField() {
        return field;
    }


}
