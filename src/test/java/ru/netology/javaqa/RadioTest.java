package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setNamberOfStation() {
        Radio station = new Radio(28);

        Assertions.assertEquals(27, station.getNumberOfStation());
    }

    @Test
    public void setValidRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        Assertions.assertEquals(9, station.getCurrentRadioStation());
    }

    @Test
    public void setBelowInvalidStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void setAboveInvalidStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(10);

        Assertions.assertEquals(9, station.getCurrentRadioStation());
    }

    @Test
    public void setNextStationBeforeNine() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);

        station.nextRadioStation();

        Assertions.assertEquals(9, station.getCurrentRadioStation());
    }

    @Test
    public void setNextStationAfterNine() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.nextRadioStation();

        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void setPreviousStationAfterZero() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);

        station.prevRadioStation();

        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void setPreviousStationBeforeZero() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.prevRadioStation();

        Assertions.assertEquals(9, station.getCurrentRadioStation());
    }

    @Test
    public void setNextStationAfterLastAndSetNumber() {
        Radio station = new Radio(48);
        station.setCurrentRadioStation(47);

        station.nextRadioStation();

        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void setPreviousStationBeforeZeroAndSetNumber() {
        Radio station = new Radio(13);
        station.setCurrentRadioStation(0);

        station.prevRadioStation();

        Assertions.assertEquals(12, station.getCurrentRadioStation());
    }

    @Test
    public void setValidStationAndSetNumber() {
        Radio station = new Radio(33);

        station.setCurrentRadioStation(29);

        Assertions.assertEquals(29, station.getCurrentRadioStation());
    }

    @Test
    public void upVolumeBeforeHundred() {
        Radio station = new Radio();
        station.setCurrentVolume(99);

        station.upVolume();

        Assertions.assertEquals(100, station.getCurrentVolume());
    }

    @Test
    public void upVolumeIsHundred() {
        Radio station = new Radio();
        station.setCurrentVolume(100);

        station.upVolume();

        Assertions.assertEquals(100, station.getCurrentVolume());
    }

    @Test
    public void downVolumeAfterZero() {
        Radio station = new Radio();
        station.setCurrentVolume(1);

        station.downVolume();

        Assertions.assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void downVolumeIsZero() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        station.downVolume();

        Assertions.assertEquals(0, station.getCurrentVolume());
    }
}