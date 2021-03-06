package com.mohanad.myownbank.model.entity;


import androidx.annotation.NonNull;

import java.util.List;

public class Account {

    private String accountType;
    private String IBAN;
    private double balance;
    private String accountCurrency;
    private String fullAccountNumber;
    private String currencyLabel;


    private String fullName;
    private String mobileNumber;
    private List<Transactions> tranactions;
    private List<Card> cards;

    private String ACCOUNT_ID;


    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public String getFullAccountNumber() {
        return fullAccountNumber;
    }

    public void setFullAccountNumber(String fullAccountNumber) {
        this.fullAccountNumber = fullAccountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<Transactions> getTranactions() {
        return tranactions;
    }

    public void setTranactions(List<Transactions> tranactions) {
        this.tranactions = tranactions;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @NonNull
    @Override
    public String toString() {
        String account=this.fullAccountNumber+"\n"
                +this.getAccountType()+"\n"
                +this.getFullName();
        return account;
    }

    public String getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public void setACCOUNT_ID(String ACCOUNT_ID) {
        this.ACCOUNT_ID = ACCOUNT_ID;
    }

    public String getCurrencyLabel() {
        return currencyLabel;
    }

    public void setCurrencyLabel(String currencyLabel) {
        this.currencyLabel = currencyLabel;
    }

}
