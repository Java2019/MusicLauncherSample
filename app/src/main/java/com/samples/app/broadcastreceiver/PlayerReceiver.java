package com.samples.app.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by use on 21.06.17.
 */
public class PlayerReceiver extends BroadcastReceiver {

    private static final String TYPE = "type";
    private static final int ID_ACTION_PLAY = 0;
    private static final int ID_ACTION_STOP = 1;

    @Override
    public void onReceive(Context context, Intent intent) {
        int type = intent.getIntExtra(TYPE, ID_ACTION_STOP);
        switch (type){
            case ID_ACTION_PLAY:
                Toast.makeText(context, "Received action: play", Toast.LENGTH_SHORT).show();
                context.stopService(new Intent(context, PlayService.class));
                break;
            case ID_ACTION_STOP:
                Toast.makeText(context, "Received action: stop", Toast.LENGTH_SHORT).show();
                context.stopService(new Intent(context, PlayService.class));
                break;
        }
    }
}
