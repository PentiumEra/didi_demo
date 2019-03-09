package com.haodong.dididemo.account.model.response;


import com.haodong.dididemo.common.http.biz.BaseBizResponse;


public class LoginResponse extends BaseBizResponse {
    Account data;

    public Account getData() {
        return data;
    }

    public void setData(Account data) {
        this.data = data;
    }
}
