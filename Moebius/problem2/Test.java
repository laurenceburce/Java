package Moebius.problem2;

public class Test {
    public static void main(String[] args) {
        ItemStoreTest store = new ItemStoreTest();

        // Create some items
        ItemStore.Item test1 = new ItemStoreTest.ItemTest("101", "Grapes");
        store.put(test1);
        ItemStore.Item test2 = new ItemStoreTest.ItemTest("102", "Apple");
        store.put(test2);
        ItemStore.Item test3 = new ItemStoreTest.ItemTest("103", "Banana");
        store.put(test3);
        ItemStore.Item test4 = new ItemStoreTest.ItemTest("104", "Apple");
        store.put(test4);
        ItemStore.Item test5 = new ItemStoreTest.ItemTest("105", "Pineapple");
        store.put(test5);

        // Retrieve the size of the store
        System.out.println("Size of the store: " + store.size());
        
        // Retrieve an item by ID
        System.out.println("Item with ID 102: " + store.get("102").getTag());

        // Retrieve an item by ID
        System.out.println("Item with ID 105: " + store.get("105").getTag());

        // Delete all items with tag "Apple"
        store.dropAllByTag("Apple");

        // Check store size
        System.out.println("Size of the store: " + store.size());
    }
}
