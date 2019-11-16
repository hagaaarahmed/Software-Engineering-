import java.util.*;

public class brandController
{
    public ArrayList <brand> allBrands = new ArrayList<brand>();
    public     UserDataManager M = new UserDataManager();
    public     storeOwner Owner = new storeOwner();
    public void viewBrands()
    {
        for(int i=0; i<allBrands.size() ;i++)
        {
            System.out.println(i+") Name: " + allBrands.get(i).getName() + " Owner: " + allBrands.get(i).getOwner() + " Company: " + allBrands.get(i).getCompany() + " ID: " + allBrands.get(i).getID());
        }
    }

    public boolean addBrand()
    {
            brand Brand = new brand();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name of brand: ");
            Brand.setName(in.next());

            System.out.println("Enter the Owner of brand: ");
            Brand.setOwner(in.next());

            System.out.println("Enter the Company of brand: ");
            Brand.setCompany(in.next());

            System.out.println("Enter the ID of brand: ");
            Brand.setID(in.next());

            boolean found=false;
            for ( int i =0 ;i<allBrands.size();i++)
            {
                if( Brand == allBrands.get(i))
                {
                    found =true;
                }
            }
            if (found==true)
            {
                System.out.println("This product already exist! ");

            }
            else
            {
                allBrands.add(Brand);
                System.out.println("Brand Added Successfully.. ");
            }


        return false;

    }
}
