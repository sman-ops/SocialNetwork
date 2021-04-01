package com.socialnetwork.entity;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Group {

    private int id;
    private String titleGroup;
    private int idCreator;
    private String genre;
    private Timestamp dateCreation;
    private ArrayList<Integer> idAdministrators = new ArrayList<Integer>();

    /*public Group(int id, String titleGroup, String genre, Timestamp dateCreation, int idCreator, ArrayList<Integer> idAdministrators) {
        this.id = id;
        this.titleGroup = titleGroup;
        this.idCreator = idCreator;
        this.genre = genre;
        this.dateCreation = dateCreation;
        this.idAdministrators = idAdministrators;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleGroup() {
        return titleGroup;
    }

    public void setTitleGroup(String titleGroup) {
        this.titleGroup = titleGroup;
    }

    public int getIdCreator() {
        return idCreator;
    }

    public void setIdCreator(int idCreator) {
        this.idCreator = idCreator;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    public ArrayList<Integer> getIdAdministrators() {
        return idAdministrators;
    }

    public void setIdAdministrators(ArrayList<Integer> idAdministrators) {
        this.idAdministrators = idAdministrators;
    }
}
