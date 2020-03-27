package com.neotech.phone;

import com.neotech.contract.ResultEntryInterface;

public class Commentary implements ResultEntryInterface {
    public String matchedPhoneCode;
    public String commentContent = "unassigned";

    public Commentary() {}

    public Commentary(String commentContent) {
        this.commentContent = commentContent;
    }

    @Override
    public void setMatchPhoneCode(String phoneCode) {
        this.matchedPhoneCode = phoneCode;
    }
}
