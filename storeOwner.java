
import java.util.ArrayList;

public class storeOwner {
    public String name;
    public String ID;
    ArrayList<store> MyStores=new ArrayList<store>();

    public storeOwner(){
        this.name = "";
        this.ID = "";

    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<store> getMyStores() {
        return MyStores;
    }

    public void setMyStores(ArrayList<store> myStores) {
        MyStores = myStores;
    }



}
