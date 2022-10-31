package com.mukanda.taekwondocoachbooking.DataRetrievalClass;

public class AppointmentRequest {
    private String DateAndTime,CoachAppointKey,Name,AthleteAppointKey,AthleteEmail,AthleteID,AthletePhone;

    public AppointmentRequest() {
    }

    public AppointmentRequest(String dateAndTime, String coachAppointKey, String name, String athleteAppointKey, String athleteEmail, String athleteID, String athletePhone) {
        DateAndTime = dateAndTime;
        CoachAppointKey = coachAppointKey;
        Name = name;
        AthleteAppointKey = athleteAppointKey;
        AthleteEmail = athleteEmail;
        AthleteID = athleteID;
        AthletePhone = athletePhone;
    }


    public String getDateAndTime() {
        return DateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        DateAndTime = dateAndTime;
    }

    public String getCoachAppointKey() {
        return CoachAppointKey;
    }

    public void setCoachAppointKey(String coachAppointKey) {
        CoachAppointKey = coachAppointKey;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAthleteAppointKey() {
        return AthleteAppointKey;
    }

    public void setAthleteAppointKey(String athleteAppointKey) {
        AthleteAppointKey = athleteAppointKey;
    }

    public String getAthleteEmail() {
        return AthleteEmail;
    }

    public void setAthleteEmail(String athleteEmail) {
        AthleteEmail = athleteEmail;
    }

    public String getAthleteID() {
        return AthleteID;
    }

    public void setAthleteID(String athleteID) {
        AthleteID = athleteID;
    }

    public String getAthletePhone() {
        return AthletePhone;
    }

    public void setAthletePhone(String athletePhone) {
        AthletePhone = athletePhone;
    }
}
