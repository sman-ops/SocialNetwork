import java.sql.Timestamp;
import java.util.ArrayList;

public class Group {

    int id;
    String intituleGroupe;
    Member creator;
    String genre;
    Timestamp dateCreation;
    ArrayList<Member> administrators = new ArrayList<Member>();
}
