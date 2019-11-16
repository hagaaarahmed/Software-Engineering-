
import java.util.Objects;
import java.util.Scanner;

public class userDataController {

    public boolean register(int num) {

        Scanner input = new Scanner(System.in);

        boolean found = false;

        if (num == 1) {
            normalUser user = new normalUser();

            System.out.println("Enter your name: ");
            user.setName(input.next());

            System.out.println("Enter your ID: ");
            user.setID(input.next());

            found = false;
            for (int i = 0; i < UserDataManager.allUsers.size(); i++) {
                if (Objects.equals(user.ID, UserDataManager.allUsers.get(i).ID)) {
                    found = true;
                }
            }
            if (found == true) {
                System.out.println("Error, you entered data that already exist please try again.");

            } else {
                UserDataManager.allUsers.add(user);
            }

        } else if (num == 2) {
            storeOwner owner = new storeOwner();

            System.out.println("Enter your name: ");
            owner.setName(input.next());

            System.out.println("Enter your ID: ");
            owner.setID(input.next());

            found = false;
            for (int i = 0; i < UserDataManager.allStoreOwners.size(); i++) {
                if (Objects.equals(owner.ID, UserDataManager.allStoreOwners.get(i).ID)) {
                    found = true;
                }
            }
            if (found == true) {
                System.out.println("Error, you entered data that already exist please try again.");

            } else {
                UserDataManager.allStoreOwners.add(owner);
            }
        } else if (num == 3) {
            administrator admin = new administrator();

            System.out.println("Enter your name: ");
            admin.setName(input.next());

            System.out.println("Enter your ID: ");
            admin.setID(input.next());

            found = false;
            for (int i = 0; i < UserDataManager.allAdmins.size(); i++) {
                if (Objects.equals(admin.ID, UserDataManager.allAdmins.get(i).ID)) {
                    found = true;
                }
            }
            if (found == true) {
                System.out.println("Error, you entered data that already exist please try again.");

            } else {
                UserDataManager.allAdmins.add(admin);
            }
        }
        return found;
    }

    public String Signin(int num) {
        Scanner input = new Scanner(System.in);

        if (num == 1) {

            String ID = "";

            System.out.println("Enter your ID: ");
            ID = input.next();

            boolean found = false;
            for (int i = 0; i < UserDataManager.allUsers.size(); i++) {
                if (Objects.equals(ID, UserDataManager.allUsers.get(i).ID)) {
                    found = true;
                }
            }
            if (found == true) {
                System.out.println("Signed in successfully.");
                return ID;
            }


        } else if( num == 2) {

            String ID = "";

            System.out.println("Enter your ID: ");
            ID = input.next();

            boolean found = false;
            for (int i = 0; i < UserDataManager.allStoreOwners.size(); i++) {
                if (Objects.equals(ID, UserDataManager.allStoreOwners.get(i).ID)) {
                    found = true;
                }
            }
            if (found == true) {
                System.out.println("Signed in successfully.");
                return ID;
            }


        }
        else if( num == 3) {

            String ID = "";

            System.out.println("Enter your ID: ");
            ID = input.next();

            boolean found = false;
            for (int i = 0; i < UserDataManager.allAdmins.size(); i++) {
                if (Objects.equals(ID, UserDataManager.allAdmins.get(i).ID)) {
                    found = true;
                }
            }
            if (found == true) {
                System.out.println("Signed in successfully.");
                return ID;
            }
        }
        System.out.println("Couldn't Sign`in.");
        return null;
    }


}
