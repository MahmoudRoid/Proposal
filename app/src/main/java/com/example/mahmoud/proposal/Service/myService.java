package com.example.mahmoud.proposal.Service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.example.mahmoud.proposal.Classes.GetData;

/**
 * Created by mahmoud on 3/1/18.
 */

public class myService extends IntentService {

    public myService() {
        super("nothing");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        GetData.getInstance().saveData();
    }

}
