import java.util.*;


public class StoreController
{
    public static ArrayList <store> allStores = new ArrayList<store>();
    public UserDataManager manage = new UserDataManager();

    public  boolean AddStore(String ID){
        store S = new store();
        System.out.println("Enter your Store name :");
        Scanner input = new Scanner(System.in);
        S.Name=input.next();
        System.out.println("Enter your Store type :");
        S.Type=input.next();
        System.out.println("Enter your Store Address :");
        S.Address=input.next();
        System.out.println("Enter your Store ID:");
        S.ID=input.next();
        storeOwner own=null;
        for(int i=0 ; i<manage.allStoreOwners.size(); i++){
            if(Objects.equals(ID, manage.allStoreOwners.get(i).ID)){
                own=manage.allStoreOwners.get(i);
                break;
            }

        }
        S.Owner=own;

        allStores.add(S);
        own.MyStores.add(S);

        System.out.println(S.getName()+" STORE ADDED SUCCESSFULLY !");
        return true;


    }

}
