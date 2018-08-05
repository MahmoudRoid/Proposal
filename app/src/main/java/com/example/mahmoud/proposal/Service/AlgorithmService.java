package com.example.mahmoud.proposal.Service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.example.mahmoud.proposal.Classes.Algorithm;

public class AlgorithmService  extends IntentService {

    public AlgorithmService() {
        super("nothing");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Algorithm.getInstance().checkAlgorithmWithConsidrationHistory();
    }

}

