package com.example.mahmoud.proposal.Model;

import android.graphics.Region;

import io.realm.RealmObject;

/**
 * Created by soheilsystem on 3/6/2018.
 */

public class Model extends RealmObject {

    private Long cpuOneFreq,cpuTwoFreq,cpuThreeFreq,cpuFourFreq;
    private float cpuLoad,cpuUsage,cpuTemperature;

    public Model(){}


    public Long getCpuOneFreq() {
        return cpuOneFreq;
    }

    public void setCpuOneFreq(Long cpuOneFreq) {
        this.cpuOneFreq = cpuOneFreq;
    }

    public Long getCpuTwoFreq() {
        return cpuTwoFreq;
    }

    public void setCpuTwoFreq(Long cpuTwoFreq) {
        this.cpuTwoFreq = cpuTwoFreq;
    }

    public Long getCpuThreeFreq() {
        return cpuThreeFreq;
    }

    public void setCpuThreeFreq(Long cpuThreeFreq) {
        this.cpuThreeFreq = cpuThreeFreq;
    }

    public Long getCpuFourFreq() {
        return cpuFourFreq;
    }

    public void setCpuFourFreq(Long cpuFourFreq) {
        this.cpuFourFreq = cpuFourFreq;
    }

    public float getCpuLoad() {
        return cpuLoad;
    }

    public void setCpuLoad(float cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    public float getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(float cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public float getCpuTemperature() {
        return cpuTemperature;
    }

    public void setCpuTemperature(float cpuTemperature) {
        this.cpuTemperature = cpuTemperature;
    }
}
