package com.hussi.nse.api;

public enum StockEnum
{

    INDUSIND_BANK_LTD("INDUSINDBK"),
    GRAPHITE_INDIA_LTD("GRAPHITE"),
    EQUITAS_HOLDINGS_LTD("EQUITAS");

    private String value;

    private StockEnum(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

//    public Integer getIntValue()
//    {
//        return Integer.parseInt(value);
//    }

}
