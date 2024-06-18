package Moebius.problem2;

import java.util.*;

public class ItemStoreTest implements ItemStore {
    // Map to store items
    private Map<String, Item> iMap;
    public ItemStoreTest() {
        this.iMap = new HashMap<>();
    }

    // Add item to the store - replace existing item with same ID
    @Override
    public void put(Item item) {
        iMap.put(item.getID(), item);
    }

    // Get item by ID
    @Override
    public Item get(String id) {
        return iMap.get(id);
    }

    // Delete item from map by specific tag
    @Override
    public void dropAllByTag(String tag) {
        iMap.values().removeIf(item -> item.getTag().equals(tag));
    }

    // Get the size of the map
    @Override
    public int size() {
        return iMap.size();
    }

    // Item class implements Item interface
    static class ItemTest implements Item {
        private String id;
        private String tag;

        public ItemTest(String id, String tag) {
            this.id = id;
            this.tag = tag;
        }

        @Override
        public String getID() {
            return id;
        }

        @Override
        public String getTag() {
            return tag;
        }
    }
}