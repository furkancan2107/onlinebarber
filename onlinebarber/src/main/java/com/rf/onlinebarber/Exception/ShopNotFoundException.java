package com.rf.onlinebarber.Exception;

public class ShopNotFoundException extends RuntimeException{

    public ShopNotFoundException(Long id) {
        super(id+" numaralı mağaza bulunamadi");
    }

    public ShopNotFoundException() {
        super("Mağaza bulunamadi lütfen tekrar deneyin");
    }
}
