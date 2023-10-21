package com.gdx.game.status;


public interface StatusSubject {
    void addObserver(StatusObserver statusObserver);
    void removeObserver(StatusObserver statusObserver);
    void removeAllObservers();
    void notify(final int value, StatusEvent event);
    int getGoldValue();
    int getHPValue();
    int getLevelValue();
    int getMPValue();
    int getXPValue();
}
