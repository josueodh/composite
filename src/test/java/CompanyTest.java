import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void sholdBeReturnRelatory(){
        Tag tag1 = new Tag("Tag1");

        Tag tag2 = new Tag("Tag2");
        Category category21 = new Category("Service", "Food");
        tag2.addRelatory(category21);

        Tag endTag = new Tag("All tags");
        endTag.addRelatory(tag1);
        endTag.addRelatory(tag2);

        Company company = new Company();
        company.setRelatory(endTag);

        assertEquals("Tag: All tags\n" + "Tag: Tag1\n" + "Tag: Tag2\n" + "Categoria: Food- Descrição: Service\n", company.getRelatory());
    }
    @Test
    void shoudlBeReturnExeption(){
        try{
            Company company = new Company();
            company.getRelatory();
            fail();
        }catch (NullPointerException e){
            assertEquals("Relatory not found", e.getMessage());
        }
    }

}