package welplet.com.compras.Model;

import java.util.ArrayList;

/**
 * Created by hercules on 01/12/17.
 */

public class ShoppingList {
    private String mDate;
    private float mTotalPrice;
    private String mUserId;
    private ArrayList<ShoppingListItem> mListItems;

    public ShoppingList() {
        mListItems = new ArrayList<>();
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public float getTotalPrice() {
        return mTotalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        mTotalPrice = totalPrice;
    }

    public String getUserId() {
        return mUserId;
    }

    public void setUserId(String userId) {
        mUserId = userId;
    }

    public ArrayList<ShoppingListItem> getListItems() {
        return mListItems;
    }

    public void setListItems(ArrayList<ShoppingListItem> listItems) {
        mListItems = listItems;
    }

    public void addShoppingListItem(ShoppingListItem item) {
        if (item != null) {
            mTotalPrice += item.getTotalPrice();
            mListItems.add(item);
        }
    }

    public void removeShoppingListItem(ShoppingListItem item) {
        if (mListItems.contains(item)) {
            mTotalPrice -= mListItems.get(mListItems.indexOf(item)).getTotalPrice();
            mListItems.remove(item);
        }
    }
}
