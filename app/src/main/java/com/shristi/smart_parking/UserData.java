package com.shristi.smart_parking;

public class UserData {
    private String name,veh,duration;
    private int phn;
    public UserData() {

    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public String getVeh() {
        return veh;
    }

    public void setVeh(String veh) {
        this.veh = veh;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPhn() {
        return phn;
    }

    public void setPhn(int phn) {
        this.phn = phn;
    }


}
