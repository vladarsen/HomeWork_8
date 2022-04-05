package com.vladarsenjtev;

public interface Participant {
    void run();

    void jump();

    int maxDistance();

    int maxJump();

    String name();

    boolean isSuccess();

    void setSuccess(boolean success);

}


