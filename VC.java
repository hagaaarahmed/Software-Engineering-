import java.util.*;

public class VC
{
    public String Scope;
    public String Features;
    public Integer EndDate;
    public Integer StartDate;
    public Integer Value;
    public ArrayList <store> allStores = new ArrayList<store>();
    public ArrayList <VC> allVCs = new ArrayList<VC>();

    public String getScope()
    {
        return Scope;
    }

    public void setScope(String name)
    {
        this.Scope = name;
    }

    public String getFeatures()
    {
        return Features;
    }
    public void setFeatures(String features)
    {
        this.Features = features;
    }
    public int getEndDate()
    {
        return EndDate;
    }

    public void setEndDate(int endDate)
    {
        this.EndDate = endDate;
    }

    public int getStartDate()
    {
        return StartDate;
    }

    public void setStartDate(int startDate)
    {
        this.StartDate = startDate;
    }

    public int getValue()
    {
        return Value;
    }

    public void setValue(int value)
    {
        this.Value = value;
    }
    public void viewStores()
    {
        for(int i=0; i<allStores.size() ;i++)
        {
            System.out.println(i+")" +" Name: " + allStores.get(i).getName());
            System.out.println(" Address: " +  allStores.get(i).getAddress());
            System.out.println(" Type: " +  allStores.get(i).getType());
            System.out.println(" ID: " +  allStores.get(i).getID());
        }

    }


    public void addVC()
    {
        VC vc = new VC();
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Scope of the VC");
        vc.setScope(ss.next());
        System.out.println("Enter the Features of the VC");
        vc.setFeatures(ss.next());
        System.out.println("Enter the StartDate the VC");
        vc.setStartDate(ss.nextInt());
        System.out.println("Enter the EndDate of the VC");
        vc.setEndDate(ss.nextInt());
        System.out.println("Enter the Value of the VC");
        vc.setValue(ss.nextInt());
        allVCs.add(vc);
    }



}