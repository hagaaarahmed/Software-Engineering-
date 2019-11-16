import java.util.*;



public class productController {
    public static ArrayList<product> allProducts = new ArrayList<product>();
    public ArrayList<product> suggestedProducts = new ArrayList<>();
    public ArrayList<VC> allVCs = new ArrayList<>();
    public UserDataManager M = new UserDataManager();
    public storeOwner Owner = new storeOwner();
    public StoreController selectedStore = new StoreController();

    public void viewProducts() {
        for (int i = 0; i < allProducts.size(); i++) {
            System.out.println(i + ")" + " Name: " + allProducts.get(i).getName());
            System.out.println(" ID: " + allProducts.get(i).getID());
            System.out.println(" Price: " + allProducts.get(i).getPrice());
            System.out.println(" Category: " + allProducts.get(i).getCategory());
            System.out.println(" Type: " + allProducts.get(i).getType());
            System.out.println(" BrandName: " + allProducts.get(i).getBrandName());
        }
    }

    //Rana
    public boolean AddProduct_Store(String ID) {
        product p = new product();
        viewProducts();
        int Si = allProducts.size();
        if (Si != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number corresponding to the product you want to add: ");
            int index = input.nextInt();
            p = allProducts.get(index);


            for (int i = 0; i < M.allStoreOwners.size(); i++) {
                Owner = null;
                if (M.allStoreOwners.get(i).ID.equals(ID)) {
                    Owner = M.allStoreOwners.get(i);
                    break;
                }
            }

            System.out.println("Enter ID of the store you want to add the product in it : ");
            for (int i = 0; i < Owner.getMyStores().size(); i++) {
                System.out.println(i + ") " + Owner.getMyStores().get(i).Name + " ID: " + Owner.getMyStores().get(i).ID);
            }
            String idOfStore = input.next();


            store myStore = new store();
            for (int i = 0; i < selectedStore.allStores.size(); i++) {
                myStore = null;
                if (selectedStore.allStores.get(i).ID.equals(idOfStore)) {
                    myStore = selectedStore.allStores.get(i);
                    break;
                }

            }
            if (myStore == null) {
                System.out.println("SORRY WRONG STORE ID PLEASE TRY AGAIN!");
                return false;
            }
            myStore.storeProducts.add(p);
            System.out.println("Product Added Successfully to your Store ..");
            return true;
        } else {
            System.out.println("There are no products in the system. Please wait for the admin to add a new product!");
            return false;
        }
    }

// by store owner
    public boolean SuggestProduct(){
        product p = new product();
        Scanner input1= new Scanner(System.in);
        System.out.println("Please Enter product details to suggest it to the Administrator : ");
        System.out.println("Product type: ");
        p.Type=input1.next();
        System.out.println("Product name: ");
        p.Name=input1.next();
        System.out.println("Product average price: ");
        p.Price=input1.nextInt();
        suggestedProducts.add(p);
        System.out.println("YOUR PRODUCT HAS BEEN SUGGESTED SUCCESSFULLY, THANKS!");
        return true;
    }

    public void View_Specific_Product(){
        Scanner input2=new Scanner(System.in);
        for(int i=0; i<allProducts.size() ;i++){
            System.out.println(i+")" +" name: "+allProducts.get(i).getName());
        }
        System.out.println("Enter Product number to view it's Details : ");
        int index=input2.nextInt();
        System.out.println("Product Details :");
        System.out.println(" ID: "+allProducts.get(index).getID()+ " name: "+allProducts.get(index).getName()+" type: "+allProducts.get(index).getType()+" price: "+allProducts.get(index).getPrice());


    }
    //sana
    public void addProductAdmin()
    {
         product p=new product();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name of product: ");
            p.setName(in.next());

            System.out.println("Enter the ID of product: ");
            p.setID(in.next());

            System.out.println("Enter the type of product: ");
            p.setType(in.next());

            System.out.println("Enter the price of product: ");
            p.setPrice(in.nextInt());

            boolean found=false;
            for ( int i =0 ;i<allProducts.size();i++)
            {
                if( p == allProducts.get(i))
                {
                    found =true;
                }
            }
            if (found==true)
            {
                System.out.println("This product already exist! ");
                return;
            }
            else
            {
                allProducts.add(p);
                System.out.println("Product Added Successfully.. ");
            }


    }
    //hagar
    public void exploreProducts()
    {
        for(int i=0; i<allProducts.size() ;i++)
        {
            System.out.println(i+")" +" Name: " + allProducts.get(i).getName());
            System.out.println(" ID: " + allProducts.get(i).getID());
            System.out.println(" Price: " + allProducts.get(i).getPrice());
            System.out.println(" Category: " + allProducts.get(i).getCategory());
            System.out.println(" Type: " + allProducts.get(i).getType());
            System.out.println(" BrandName: " + allProducts.get(i).getBrandName());
        }
    }
    public void viewVCs()
    {
        for(int i=0 ; i<allVCs.size();i++)
        {
            System.out.println(i+")" +" Value: " + allVCs.get(i).getValue());
            System.out.println(" EndDate: " +  allVCs.get(i).getEndDate());
            System.out.println(" StartDate: " +  allVCs.get(i).getStartDate());
            System.out.println(" Features: " +  allVCs.get(i).getFeatures());
            System.out.println(" Scope: " +  allVCs.get(i).getScope());

        }

    }
    public void buyProduct()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your ID for verification:");
        String id=input.next();
        for(int i=0 ; i<UserDataManager.allUsers.size(); i++){
            if(id.equals(UserDataManager.allUsers.get(i).ID)){
               UserDataManager.allUsers.get(i);
                exploreProducts();
                System.out.println("Enter number of product you want to buy : ");
                int choice=input.nextInt();
                System.out.println("The price of the product you want to buy is : "+ allProducts.get(choice).getPrice());
                System.out.println("please enter your address for Delivery :");

                    System.out.println("Enter your address please :");
                    UserDataManager.allUsers.get(i).setAddress(input.next());
                    System.out.println("Thanks, The product will be their in 3 days !");


            }
        }




    }

    public void deleteProduct ()
    {
        System.out.println("Enter ID of the product you want to delete: ");
        Scanner inputID = new Scanner(System.in);
        String id = inputID.next();

        boolean found =false;
        int index=0;
        for (int i=0 ;i< allProducts.size(); i++)
        {
            if(id.equals(allProducts.get(i).ID))
            {
                index=i;
                found=true;

            }
        }

        if (found==true)
        {
            allProducts.remove(index);
            System.out.println("The product deleted successfully..");
        }
        else
        {
            System.out.println("This Product is not exist! ");
        }
    }


    public void View_Most_Viwed_Product(){

        int max=0;
        int indx=0;
        for(int i=0;i<allProducts.size();i++)
        {
            if(allProducts.get(i).views>max){
                max=allProducts.get(i).views;
                indx=i;
            }
        }
        System.out.println("Most viwed product name: "+allProducts.get(indx).Name+" Type: "+allProducts.get(indx).Type+" ID: "+allProducts.get(indx).ID) ;
    }



  public void ExploreNumberOfViews(){

        for(int i=0 ; i< productController.allProducts.size(); i++){
            System.out.println(allProducts.get(i).getName()+" viewed  "+allProducts.get(i).views +" times");
        }
  }















}