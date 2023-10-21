package com.gdx.game.status;

import com.gdx.game.profile.ProfileManager;

public class UpdatedHPStatusEvent implements StatusEvent {

    public UpdatedHPStatusEvent() {}

    @Override
    public void changeStatus(StatusSubject battleStatusUI) {
        ProfileManager.getInstance().setProperty("currentPlayerHP", battleStatusUI.getHPValue());
    }
}
