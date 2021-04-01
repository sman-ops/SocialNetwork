package com.socialnetwork.entity;

import java.util.ArrayList;

public class Member {
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Integer>  idlikedPages = new ArrayList<Integer>();
    private ArrayList<Integer>  idJoinedGroups = new ArrayList<Integer>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Integer> getIdlikedPages() {
        return idlikedPages;
    }

    public void setIdlikedPages(ArrayList<Integer> idlikedPages) {
        this.idlikedPages = idlikedPages;
    }

    public ArrayList<Integer> getIdJoinedGroups() {
        return idJoinedGroups;
    }

    public void setIdJoinedGroups(ArrayList<Integer> idJoinedGroups) {
        this.idJoinedGroups = idJoinedGroups;
    }

    public int createPage(){
        return 0;
    }
    public boolean demandeAmis(){
        return false;
    }

    public void likerPage(){
        //TODO: ajouter la nouvelle page à la liste des pages déjà liker
    }
    public void rejoindreGroupe(){
        //TODO: ajouter le nouvelle groupe  à la liste des groupes  déjà membre
    }

}
