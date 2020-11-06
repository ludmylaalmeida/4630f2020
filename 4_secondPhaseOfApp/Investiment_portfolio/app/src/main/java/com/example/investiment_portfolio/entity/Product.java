package com.example.investiment_portfolio.entity;

import java.io.Serializable;

public class Product implements Serializable {

    private String symbol;

    private double last;

    private double daysGain;

    private double totalGain;

    public String getSymbol() {
        return this.symbol;

    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getLast() {
        return this.last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getDaysGain() {
        return this.daysGain;
    }

    public void setDaysGain(double daysGain) {
        this.daysGain = daysGain;
    }

    public double getTotalGain() {
        return this.totalGain;
    }

    public void setTotalGain(double totalGain) {
        this.totalGain = totalGain;
    }

    public Product() {
    }

    public Product(String symbol, double last, double daysGain, double totalGain) {
        this.symbol = symbol;
        this.last = last;
        this.daysGain = daysGain;
        this.totalGain = totalGain;
    }
}