package welplet.com.compras.Model;

/**
 * Created by hercules on 01/12/17.
 */

public class Product {
    private String mUnit;
    private String mName;
    private String mId;
    private Category mCategory;

    public Product() {
    }

    public String getUnit() {
        return mUnit;
    }

    public void setUnit(String unit) {
        mUnit = unit;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(Category category) {
        mCategory = category;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }
}
