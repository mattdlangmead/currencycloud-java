package com.currencycloud.client.model;

import java.util.List;

public class Balances extends PaginatedData {

    private List<Balance> balances;

    public List<Balance> getBalances() {
        return balances;
    }
}