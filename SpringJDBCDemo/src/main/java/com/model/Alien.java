package java.com.model;

public class Alien {

    private int id;
    private String name;
    private String tech;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return this.tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", tech='" + getTech() + "'" +
            "}";
    }


}
