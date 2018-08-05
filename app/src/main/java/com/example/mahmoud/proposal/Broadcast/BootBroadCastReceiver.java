package com.example.mahmoud.proposal.Broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.mahmoud.proposal.Classes.JavaUtils;

/**
 * Created by soheilsystem on 3/7/2018.
 */

public class BootBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "salammamsmasdm", Toast.LENGTH_SHORT).show();
        JavaUtils.getInstance().setGov(context,"userspace");
    }
}
