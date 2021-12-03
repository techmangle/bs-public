package org.bs.train;

import java.util.HashMap;
import java.util.Map;

public class MobileStock {
    private Map<String, Mobile> mobileInfo = new HashMap<>();

    public MobileStock() {
        Mobile iphone = new Mobile("iphone","Apple",60000,5);
        addMobile(iphone);
    }

    public Boolean isMobileInStock(String modelName) {
        Mobile mobile = mobileInfo.get(modelName);
        return mobile != null && mobile.getStock()> 0;
    }

    public String getMobileInfo(String modelName) {
        Mobile mobile = mobileInfo.get(modelName);
        if(mobile == null) {
            return "{\"message\":\"Mobile with modelName: "+ modelName+" not found. \"}";
        }
        return mobile.toString();
    }

    public void addMobile(Mobile mobile) {
        mobileInfo.put(mobile.getModelName(), mobile);
    }
}
