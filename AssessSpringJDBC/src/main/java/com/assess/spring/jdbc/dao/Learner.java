package com.assess.spring.jdbc.dao;


public class Learner {

    private int Learner_id;
    private String Learner_first_name;
    private String Learner_last_name;
    private String Learner_email;
    private String Learner_password;

    public Learner() {
    }

    public Learner(int learner_id, String learner_first_name, String learner_last_name, String learner_email, String learner_password) {
        Learner_id = learner_id;
        Learner_first_name = learner_first_name;
        Learner_last_name = learner_last_name;
        Learner_email = learner_email;
        Learner_password = learner_password;
    }

    public Learner( String learner_first_name, String learner_last_name, String learner_email, String learner_password) {
        Learner_first_name = learner_first_name;
        Learner_last_name = learner_last_name;
        Learner_email = learner_email;
        Learner_password = learner_password;
    }
    public int getLearner_id() {
        return Learner_id;
    }

    public void setLearner_id(int learner_id) {
        Learner_id = learner_id;
    }

    public String getLearner_first_name() {
        return Learner_first_name;
    }

    public void setLearner_first_name(String learner_first_name) {
        Learner_first_name = learner_first_name;
    }

    public String getLearner_last_name() {
        return Learner_last_name;
    }

    public void setLearner_last_name(String learner_last_name) {
        Learner_last_name = learner_last_name;
    }

    public String getLearner_email() {
        return Learner_email;
    }

    public void setLearner_email(String learner_email) {
        Learner_email = learner_email;
    }

    public String getLearner_password() {
        return Learner_password;
    }

    public void setLearner_password(String learner_password) {
        Learner_password = learner_password;
    }

    @Override
    public String toString() {
        return "Learner{" +
                "Learner_id=" + Learner_id +
                ", Learner_first_name='" + Learner_first_name + '\'' +
                ", Learner_last_name='" + Learner_last_name + '\'' +
                ", Learner_email='" + Learner_email + '\'' +
                ", Learner_password='" + Learner_password + '\'' +
                '}';
    }
}
