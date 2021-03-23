import java.util.ArrayList;

public class Member {
    String nom;
    String prenom;
    ArrayList<Page>  likedPages = new ArrayList<Page>();
    ArrayList<Group>  joinedGroups = new ArrayList<Group>();

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
