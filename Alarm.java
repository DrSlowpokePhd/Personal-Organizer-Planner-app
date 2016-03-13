/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organiser;

import java.net.*;
import java.applet.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import java.text.*;
/**
 *
 * @author drslowpokephd
 */
public abstract class Alarm implements Network{
    int hour;
    int minute;
    String file;
    static String sound;// = ""//"/home/drslowpokephd/Downloads/Dial Up Modem-SoundBible.com-909377495.wav";
    String time;
    Date CurrentDate = new Date();
    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm");
    String currentTime = timeFormat.format(CurrentDate);
    File alarmFile = new File("/AlarmFiles/Alarms.alarm");
    FileOutputStream save = new FileOutputStream(alarmFile);
    
    
    public Alarm(String Name, String Time) {
        
        Time = time;       
        Name = file;
    }
    
    public static void beep() {
        try {
            AudioClip clip = Applet.newAudioClip(new URL(sound));
            clip.play();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Alarm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveLocal() {
        //TODO save alarm to file
        File alarmFile = new File("/AlarmFiles/");
        OutputStream save = new FileOutputStream();
    }
    
    public void pushToServer() {
        //TODO push saved file to server
    }
    
    public void compare() {
        //TODO if alarm is true, start beeping
        if (time == currentTime) {
            Alarm.beep();
        }
    }
        
}
