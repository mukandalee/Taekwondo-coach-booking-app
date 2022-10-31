package com.mukanda.taekwondocoachbooking.DataRetrievalClass;

public class DiseaseAndSymptoms {
    private String SpecializationName,Activity;
    public DiseaseAndSymptoms() {
    }

    public DiseaseAndSymptoms(String specializationName, String activity) {
        SpecializationName = specializationName;
        Activity = activity;
    }

    public String getSpecializationName() {
        return SpecializationName;
    }

    public void setSpecializationName(String specializationName) {
        SpecializationName = specializationName;
    }

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String activity) {
        Activity = activity;
    }
}
