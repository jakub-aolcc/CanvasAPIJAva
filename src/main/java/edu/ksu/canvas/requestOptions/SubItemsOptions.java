package edu.ksu.canvas.requestOptions;

public class SubItemsOptions extends BaseOptions{

    public String subItemsURL;

    public SubItemsOptions(String subItemsURL){
        this.subItemsURL = subItemsURL;
    }

    public String getSubItemsURL() {
        return subItemsURL;
    }

    public void setSubItemsURL(String subItemsURL) {
        this.subItemsURL = subItemsURL;
    }
}
