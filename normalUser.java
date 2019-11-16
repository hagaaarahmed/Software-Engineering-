import java.util.*;


public class normalUser {
    public String name;



    public String address=null;
    public String ID;


    public normalUser() {
        this.name = null;
        this.ID = null;
    }
    public String getName() {
        return name;
    }

    public normalUser(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
