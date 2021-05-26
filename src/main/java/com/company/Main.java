package com.company;

import com.google.gson.Gson;
import com.myntra.cart.domain.entry.CartEntry;
import com.myntra.sample.CartResponse.CartEntryDomain;


public class Main {

    public static void main(String[] args) {
        CartEntry cartEntryDomain = CartEntryDomain.getcartResponse();

        System.out.println(new Gson().toJson(cartEntryDomain));
    }
}
