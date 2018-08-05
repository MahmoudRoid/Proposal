package com.example.mahmoud.proposal.Activity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mahmoud.proposal.Classes.Algorithm;
import com.example.mahmoud.proposal.Classes.Constants;
import com.example.mahmoud.proposal.Classes.JavaUtils;
import com.example.mahmoud.proposal.Model.Model;
import com.example.mahmoud.proposal.R;
import com.example.mahmoud.proposal.Service.myService;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    AlarmManager alarm;
    PendingIntent pintent;
    Process root;

    // first test commit

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            root = Runtime.getRuntime().exec("su");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showasasasasa(Long x) {
        Toast.makeText(this, String.valueOf(x), Toast.LENGTH_SHORT).show();
    }

    public void startService(View view) {
        Calendar cur_cal = Calendar.getInstance();
        intent = new Intent(this, myService.class);
        pintent = PendingIntent.getService(this, 0, intent, 0);
        alarm = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        alarm.setRepeating(AlarmManager.RTC_WAKEUP, cur_cal.getTimeInMillis(), Constants.getInstance().serviceIntervalTime, pintent);
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
    }

    public void stopService(View view) {
        try {
            alarm.cancel(pintent);
            Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startAlgorithmService(View view) {
        Algorithm.getInstance().init(this);
    }

    public void stopAlgorithmService(View view) {
        Algorithm.getInstance().cancelService(this);
    }
}
