package encapsulation;

public class person {

    private int id;
    private String name;
    private String department;

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
    // getter of department
    public String getDepartment() {
        return department;
    }
    // setter of department
    public void setDepartment(String department) {
        this.department = department;
    }

    private int passcode;

    public void setPasscode(int passcode){
        this.passcode = passcode;
    }

    public int getPasscode(){
        return passcode;
    }


    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
