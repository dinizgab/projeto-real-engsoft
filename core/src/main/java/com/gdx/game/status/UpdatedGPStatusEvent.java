package com.gdx.game.status;

import com.gdx.game.profile.ProfileManager;

public class UpdatedGPStatusEvent implements StatusEvent {
    public UpdatedGPStatusEvent() {}

    @Override
    public void changeStatus(StatusSubject statusUI) {
        ProfileManager.getInstance().setProperty("currentPlayerGP", statusUI.getGoldValue());
    }
}
