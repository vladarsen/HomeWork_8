package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        Participant[] participant = getParticipant();
        Let[] let = getLet();

        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < let.length; j++) {
                if (participant[i].isSuccess()) {
                    System.out.println(let[j].overcome(participant[i]));
                } else System.out.println(participant[i].name() + " выбыл из участия в соревнованиях");
            }
        }
    }

    public static Participant[] getParticipant() {
        return new Participant[]{
                new Human("Human", 400, 10),
                new Cat("Cat", 200, 2),
                new Robot("Robot", 1000, 200)};
    }

    public static Let[] getLet() {
        return new Let[]{new Wall("Wall", 10),
                new Treadmill("Treadmill", 199)};
    }
}
