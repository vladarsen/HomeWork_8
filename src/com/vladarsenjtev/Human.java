package com.vladarsenjtev;

public class Human implements Participant {
    private final String nameHuman;
    private final int maxDistance;
    private final int maxJump;
    private boolean success = true;


    public Human(String nameHuman, int maxDistance, int maxJump) {
        this.nameHuman = nameHuman;
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
    }

    @Override
    public void run() {
            System.out.println(name() + " бегает...");
        }


    @Override
    public void jump() {
        System.out.println(name() + " прыгает...");
    }

    public int maxDistance() {
        return maxDistance;
    }

    public int maxJump() {
        return maxJump;
    }

    @Override
    public String name() {
        return nameHuman;
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public void setSuccess(boolean success) {
        this.success = success;
    }

}
