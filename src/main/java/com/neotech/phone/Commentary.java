package com.neotech.phone;

import com.neotech.contract.ResultEntryInterface;

public class Commentary implements ResultEntryInterface {
    String commentContent = "unassigned";
    String matchedPhoneCode;

    public Commentary() {}

    public Commentary(String commentContent) {
        this.commentContent = commentContent;
    }

    @Override
    public void setMatchPhoneCode(String phoneCode) {
        this.matchedPhoneCode = phoneCode;
    }
}
