package com.vladarsenjtev;

public class Treadmill implements Let {
    private final String nameTreadmill;
    private final int length;

    public Treadmill(String nameWall, int length) {
        this.nameTreadmill = nameWall;
        this.length = length;
    }

    @Override
    public String overcome(Participant participant) {
        participant.run();
        if (participant.maxDistance() >= length) {

            return "Участник " + participant.name() + " прошел препятствие " + nameTreadmill + " на дистанции " + length;
        } else {
            return "Участник " + participant.name() + " не прошел препятствие " + nameTreadmill + " на дистанции " + length;
        }
    }
}