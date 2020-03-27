package com.neotech.phone;

import com.neotech.contract.ResultEntryInterface;

public class CodeData {
    private String code;
    private ResultEntryInterface resultEntry;

    public CodeData(String code, ResultEntryInterface resultEntry) {
        this.code = code;
        this.resultEntry = resultEntry;
    }

    public String getCode() {
        return code;
    }

    public ResultEntryInterface getOutput()
    {
        return this.resultEntry;
    }
}
