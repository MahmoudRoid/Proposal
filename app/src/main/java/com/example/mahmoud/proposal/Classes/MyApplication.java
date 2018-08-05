package com.example.mahmoud.proposal.Classes;

import android.app.Application;
import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by mahmoud on 3/2/18.
 */

public class MyApplication extends Application {

    public static final String ROOT = Environment.getExternalStorageDirectory() + "/Proposal";
    public static final String DataFile = ROOT + "/Data.txt";

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
//        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this)
//                .name("MyDB")
//                .schemaVersion(0)
//                .build();
//        Realm.setDefaultConfiguration(realmConfiguration);

        createFile();
    }

    private void createFile() {
        try {
            File dir = new File(ROOT);
            if(!dir.exists()) dir.mkdir();
            File file = new File(DataFile);
            if(!file.exists()){
                file.createNewFile();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
