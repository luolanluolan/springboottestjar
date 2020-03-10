package com.sinosoft.thymController;

import java.util.List;
import java.util.Map;

/**
 * @Author luolan
 * @Description TODO
 * @Date 2020/3/10 17:42
 **/
public class ProductUtil {
    private String riskCode;
    private String riskName;
    private List<Map<String,String>> kindList;
    private List<Map<String,String>> itemList;

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }

    public List<Map<String, String>> getKindList() {
        return kindList;
    }

    public void setKindList(List<Map<String, String>> kindList) {
        this.kindList = kindList;
    }

    public List<Map<String, String>> getItemList() {
        return itemList;
    }

    public void setItemList(List<Map<String, String>> itemList) {
        this.itemList = itemList;
    }
}
