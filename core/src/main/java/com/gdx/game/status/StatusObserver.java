package com.gdx.game.status;

public interface StatusObserver {
    void onNotify(final int value, StatusEvent event);
}
