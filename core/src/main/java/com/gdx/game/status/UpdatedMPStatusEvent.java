package com.gdx.game.status;

import com.gdx.game.profile.ProfileManager;

public class UpdatedMPStatusEvent implements StatusEvent {
    public UpdatedMPStatusEvent() {}

    @Override
    public void changeStatus(StatusSubject battleStatusUI) {
        ProfileManager.getInstance().setProperty("currentPlayerMP", battleStatusUI.getMPValue());
    }
}
