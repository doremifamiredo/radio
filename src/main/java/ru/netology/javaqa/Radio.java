package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int numberOfStation;

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation - 1;
    }

    public Radio() {
        numberOfStation = 9;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentRadioStation = 0;
            return;
        }
        if (newCurrentStation > numberOfStation) {
            currentRadioStation = numberOfStation;
            return;
        }
        currentRadioStation = newCurrentStation;
    }
    public void nextRadioStation() {
        if (currentRadioStation == numberOfStation) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = numberOfStation;
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


