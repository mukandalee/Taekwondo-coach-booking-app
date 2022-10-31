package com.mukanda.taekwondocoachbooking.DataRetrievalClass;

public class PatientAppointmentRequest {
    private String Address,City,DateAndTime,CoachID,CoachAppointKey,Name,AthleteAppointKey,Specialization;

    public PatientAppointmentRequest() {
    }

    public PatientAppointmentRequest(String address, String city, String dateAndTime, String coachID, String coachAppointKey, String name, String athleteAppointKey, String specialization) {
        Address = address;
        City = city;
        DateAndTime = dateAndTime;
        CoachID = coachID;
        CoachAppointKey = coachAppointKey;
        Name = name;
        AthleteAppointKey = athleteAppointKey;
        Specialization = specialization;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDateAndTime() {
        return DateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        DateAndTime = dateAndTime;
    }

    public String getCoachID() {
        return CoachID;
    }

    public void setCoachID(String coachID) {
       CoachID = coachID;
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

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
}
