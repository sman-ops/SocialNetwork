import java.sql.Timestamp;
import java.util.ArrayList;

public class Page{
    int id;
    String intitulePage;
    Member creator;
    String genre;
    Timestamp dateCreation;
    ArrayList<Member> administrators = new ArrayList<Member>();

}

