package com.ronone.currency;


public class CurrencyConverter {

    public double dollarsToPounds(double x){
        double poundsToDollarsRatio = 0.74;
        double dollars = x*poundsToDollarsRatio;
        return dollars;
    }

    public double dollarsToYens(double x){
        double yensToDollarsRatio = 110.85;
        double dollars = x*yensToDollarsRatio;
        return dollars;
    }

    public double dollarsToEuros(double x){
        double eurosToDollarsRatio = 0.84;
        double dollars = x*eurosToDollarsRatio;
        return dollars;
    }

    public double dollarsToRenminbi(double x){
        double renminbiToDollars = 6.55;
        double dollars = x*renminbiToDollars;
        return dollars;
    }

    public double poundsToDollars(double x){
        double dollarsToPounds = 1.36;
        double pounds = x*dollarsToPounds;
        return pounds;
    }

    public double poundsToEuros(double x){
        double eurosToPounds = 1.14;
        double pounds = x*eurosToPounds;
        return pounds;
    }

    public double poundsToYen(double x){
        double yensToPounds = 150.56;
        double pounds = x*yensToPounds;
        return pounds;
    }

    public double poundsToRenminbi(double x){
        double renminbiToPounds = 8.90;
        double pounds = x*renminbiToPounds;
        return pounds;
    }

    public double eurosToDollars(double x){
        double dollarsToEuros = 1.19;
        double euros = x*dollarsToEuros;
        return euros;
    }

    public double eurosToPounds(double x){
        double poundsToEuros = 0.88;
        double euros = x*poundsToEuros;
        return euros;
    }

    public double eurosToYen(double x){
        double yensToEuros = 132.41;
        double euros = x*yensToEuros;
        return euros;
    }

    public double eurosToRenminbi(double x){
        double renminbiToEuros = 7.83;
        double euros = x*renminbiToEuros;
        return euros;
    }

    public double yensToDollars(double x){
        double dollarsToYen = 0.0090;
        double yens = x*dollarsToYen;
        return yens;
    }

    public double yensToEuros(double x){
        double eurosToYen = 0.0076;
        double yens = x*eurosToYen;
        return yens;
    }

    public double yensToPounds(double x){
        double poundsToYen = 0.0066;
        double yens = x*poundsToYen;
        return yens;
    }

    public double yensToRenminbi(double x){
        double renminbiToYen = 0.059;
        double yens = x*renminbiToYen;
        return yens;
    }

    public double renminbiToDollars(double x){
        double dollarToRenminbi = 0.15;
        double ren = x*dollarToRenminbi;
        return ren;
    }

    public double renminbiToEuros(double x){
        double euroToRenminbi = 0.13;
        double ren = x*euroToRenminbi;
        return ren;
    }

    public double renminbiToPounds(double x){
        double poundsToRenminbi = 0.11;
        double ren = x*poundsToRenminbi;
        return ren;
    }

    public double renminbiToYen(double x){
        double yenToRenminbi = 16.91;
        double ren = x*yenToRenminbi;
        return ren;
    }
}
