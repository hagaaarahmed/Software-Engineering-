
import java.util.*;

public class store
{
    public String Name;
    public String Address;
    public String Type;
    public storeOwner Owner;
    public String ID;
    public ArrayList<VC> VCs  = new ArrayList<VC>();
    public ArrayList<product> storeProducts  = new ArrayList<product>();



    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        this.Name = name;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        this.Address = address;
    }

    public String getType()
    {
        return Type;
    }

    public void setType(String type)
    {
        this.Type = type;
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String id)
    {
        this.ID = id;
    }

    public void Add() {}
    public void update() {}
    public void delete() {}

}