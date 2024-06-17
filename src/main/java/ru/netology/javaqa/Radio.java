package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentRadioStation = 0;
            return;
        }
        if (newCurrentStation > 9) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation = newCurrentStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation--;
    }

    public void upVolume() {
        if (currentVolume == 100) {
            return;
        }
        currentVolume++;
    }

    public void downVolume() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume--;
    }
}


