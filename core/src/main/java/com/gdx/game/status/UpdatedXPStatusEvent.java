package com.gdx.game.status;

import com.gdx.game.profile.ProfileManager;

public class UpdatedXPStatusEvent implements StatusEvent {
    public UpdatedXPStatusEvent() {}
    @Override
    public void changeStatus(StatusSubject battleStatusUI) {
        ProfileManager.getInstance().setProperty("currentPlayerXP", battleStatusUI.getXPValue());
    }
}
