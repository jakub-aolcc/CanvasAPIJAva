package edu.ksu.canvas.requestOptions;

public class PublishOptions extends BaseOptions {

    private String accountId;

    public PublishOptions(String accountId){
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
