package com.vladarsenjtev;

public class Cat implements Participant {
    private final String nameCat;
    private final int maxDistance;
    private final int maxJump;
    private boolean success = true;

    public Cat(String nameCat, int maxDistance, int maxJump) {
        this.nameCat = nameCat;
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
        return nameCat;
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



