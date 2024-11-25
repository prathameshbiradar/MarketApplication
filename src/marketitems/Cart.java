package marketitems;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    ArrayList<Items>cart_list = new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    public void addCart() {

        Store s1 = new Store();
        s1.addStoreItem();
        System.out.println("Items added successfully in store");

        int total_bill=0;
        boolean exit = true;
        while(exit)
        {

            System.out.println("Welcome to cart");
            System.out.println("1.add item.");
            System.out.println("2.Print cart");
            System.out.println("3.checkout price");
            System.out.println("4.Delete item ");
            System.out.println("Enter your choice");
            int input = sc.nextInt();
            switch(input)
            {

                case 1:
                    System.out.println("Enter Id to add in cart");
                    int input1 = sc.nextInt();

                    for(Items i : s1.store_list ){
                        if(i.getId()==input1)
                        {
                            cart_list.add(i);
                        }
                    }


                    break;
                case 2 :
                    for(Items i : cart_list)
                    {
                        System.out.println(i);
                    }
                    break;
                case 3:
                    System.out.println("Checkout: ");
                    for(Items i : cart_list)
                    {
                       total_bill = total_bill + i.getPrice();
                    }
                    System.out.println("Total bill of cart is: "+total_bill);
                    try {
                        if (total_bill < 30) {
                            CustomException e = new CustomException();
                            throw new RuntimeException("Price is less than 30 add more items");

                        }
                    }
                    catch(CustomException e){
                        e.printStackTrace();
                    }

                    break;
                case 4:
                    System.out.println("Enter Id to remove from cart");
                    int input3 = sc.nextInt();
                    for(Items i: cart_list) {
                        if(i.getId()==input3) {
                            cart_list.remove(i);
                        }
                    }
                    break;
                default:
                    exit =false;
                    break;


            }


        }

    }
}
