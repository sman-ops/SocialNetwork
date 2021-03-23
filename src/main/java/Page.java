import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Page{
    int id;
    String titrePage;
    Member creator;
    Genre genrePage;
    Timestamp dateCreation;
    ArrayList<Member> administrators = new ArrayList<Member>();

}

