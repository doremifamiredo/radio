package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void setValidRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setBelowInvalidStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setAboveInvalidStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(10);

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationBeforeNine() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);

        station.nextRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAfterNine() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.nextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStationAfterZero() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);

        station.prevRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStationBeforeZero() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.prevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeBeforeHundred() {
        Radio station = new Radio();
        station.setCurrentVolume(99);

        station.upVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeIsHundred() {
        Radio station = new Radio();
        station.setCurrentVolume(100);

        station.upVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeAfterZero() {
        Radio station = new Radio();
        station.setCurrentVolume(1);

        station.downVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeIsZero() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        station.downVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}