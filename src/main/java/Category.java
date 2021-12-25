public class Category extends Relatory{

    private String name;

    public Category(String description, String name){
        super(description);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getRelatory() {
        return "Categoria: " + this.getName() + "- Descrição: " + this.getDescription() + "\n";
    }


}
