public class Company {

    private Relatory relatory;

    public void setRelatory(Relatory relatory){
        this.relatory = relatory;
    }

    public String getRelatory(){
        if(this.relatory == null){
            throw new NullPointerException("Relatory not found");
        }
        return this.relatory.getRelatory();
    }
}
