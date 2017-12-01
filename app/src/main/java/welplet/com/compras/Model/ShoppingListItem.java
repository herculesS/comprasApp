package welplet.com.compras.Model;

/**
 * Created by hercules on 01/12/17.
 */

public class ShoppingListItem {
    private float mPrice;
    private float mAmount;
    private String mProductId;
    private String mId;

    public ShoppingListItem() {
    }

    public float getPrice() {
        return mPrice;
    }

    public void setPrice(float price) {
        mPrice = price;
    }

    public float getAmount() {
        return mAmount;
    }

    public void setAmount(float amount) {
        mAmount = amount;
    }

    public String getProductId() {
        return mProductId;
    }

    public void setProductId(String productId) {
        mProductId = productId;
    }

    public float getTotalPrice() {
        return mPrice * mAmount;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }
}
