package org.bs.train;

import org.bs.train.MobileStock;

public class MobileService {

    public static void main(String[] args) {
        MobileStock mobileStock = new MobileStock();
        Mobile iphone = new Mobile("iPhone","Apple",60000,5);
        mobileStock.addMobile(iphone);

        String mobileInfo = mobileStock.getMobileInfo("iPhone");

        System.out.println("Mobile info for iPhone : " + mobileInfo);

    }
}
