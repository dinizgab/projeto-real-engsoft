package com.gdx.game.status;

import com.gdx.game.profile.ProfileManager;

public class UpdatedLevelStatusEvent implements StatusEvent {

    public UpdatedLevelStatusEvent() {}

    @Override
    public void changeStatus(StatusSubject battleStatusUI) {
        ProfileManager.getInstance().setProperty("currentPlayerLevel", battleStatusUI.getLevelValue());
    }

}
