public abstract  class Relatory {

    private String description;

    public Relatory(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public abstract String getRelatory();

}
