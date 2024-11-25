package marketitems;

import java.util.ArrayList;

public class Store {



        ArrayList<Items> store_list = new ArrayList<>();
        Items i1 = new Items(1, "Bread", 10);
    Items i2 = new Items(2, "Pav", 40);
    Items i3 = new Items(3, "Biscuits", 20);
    Items i4 = new Items(4, "VadaPav", 60);
    Items i5 = new Items(5, "Samosa", 15);

    public void addStoreItem()
    {
        store_list.add(i1);
        store_list.add(i2);
        store_list.add(i3);
        store_list.add(i4);
        store_list.add(i5);
    }


}
