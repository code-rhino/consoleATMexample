package com.codedifferently.atm.accounts;

public abstract class Account {
    private static Integer idCount =1;
    private Integer id;
    private Double balance;

    public Account(Double balance) {
        this.id = idCount++;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return String.format("%d %.2f", id, balance);
    }
}
