import java.util.ArrayList;
import java.util.List;

public class Tag extends Relatory{
    private List<Relatory> relatories;

    public Tag(String description){
        super(description);
        this.relatories = new ArrayList<Relatory>();
    }

    public void addRelatory(Relatory relatory){
        this.relatories.add(relatory);
    }

    public String getRelatory(){
        String end = "";
        end = "Tag: " + this.getDescription() + "\n";
        for (Relatory relatory : relatories) {
            end += relatory.getRelatory();
        }
        return end;
    }
}
