/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.pkg2;

/**
 *
 * @author 4Chasc78
 */
public class Heart {

    private int bpm;
    private int restingRate;

    public Heart(int restingRate) {
        this.restingRate = restingRate;
        this.bpm = restingRate;
    }

    public boolean increaseBPM(int increaseRate) {
        if (bpm < restingRate + 100) {
            bpm = bpm + increaseRate;
            return true;
        }
        return false;
    }

    public void rest() {
        bpm = restingRate;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public int getRestingRate() {
        return restingRate;
    }

    public void setRestingRate(int restingRate) {
        this.restingRate = restingRate;
    }

    public int getBPM() {
        return bpm;
    }
}
