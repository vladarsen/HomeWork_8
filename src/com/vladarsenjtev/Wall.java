package com.vladarsenjtev;

public class Wall implements Let {
    private final String nameWall;
    private final int height;

    public Wall(String nameWall, int height) {
        this.nameWall = nameWall;
        this.height = height;
    }

    @Override
    public String overcome(Participant participant) {
        participant.jump();
        participant.setSuccess (participant.maxJump() >= height);
        if (participant.isSuccess()) {
            return "Участник " + participant.name() + " прошел препятствие " + nameWall + " на дистанции " + height;
        } else {
            return "Участник " + participant.name() + " не прошел препятствие " + nameWall + " на дистанции " + height;
        }
    }
}
