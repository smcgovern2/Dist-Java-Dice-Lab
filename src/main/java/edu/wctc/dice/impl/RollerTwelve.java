package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;

import java.util.Random;

public class RollerTwelve implements DieRoller {

    @Override
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(12) + 1;

    }
}
