package encapsulation;

public class person {

    private int id;
    private String name;

    // getters  : used to get the data from private variables
    // setters  : used to set the data to private variables

    // setter of id
    public void setId(int id){
        this.id = id;
    }
    // getter of id
    public int getId(){
        return id;
    }
    // getter of name
    public String getName() {
        return name;
    }
    // setter of name
    public void setName(String name) {
        this.name = name;
    }

}
