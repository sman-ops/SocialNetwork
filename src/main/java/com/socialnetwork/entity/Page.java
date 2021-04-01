package com.socialnetwork.entity;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Page{
    private int id;
    private String titlePage;
    private int  idCreator;
    private String genre;
    Timestamp dateCreation;
    ArrayList<Integer> idAdministrators = new ArrayList<Integer>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlePage() {
        return titlePage;
    }

    public void setTitlePage(String titlePage) {
        this.titlePage = titlePage;
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

