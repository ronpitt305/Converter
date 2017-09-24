package com.ronone.weight;


public class WeighConverter {

    public double poundsToStones(double x){
        double stoneToPoundRatio = 0.0714;
        double lbs = x*stoneToPoundRatio;
        return lbs;
    }

    public double poundsToKgrams(double x){
        double kgramsToPoundRatio = 0.454;
        double lbs = x*kgramsToPoundRatio;
        return lbs;
    }

    public double stonesToPounds(double x){
         double poundToStoneRatio = 14;
         double st = x*poundToStoneRatio;
         return st;
    }

    public double stonesToKgrams(double x){
        double kgramsToStonesRatio = 6.35;
        double st = x*kgramsToStonesRatio;
        return st;
    }

    public double kgramsToPounds(double x){
        double poundsToKgramsRatio = 2.205;
        double kg = x*poundsToKgramsRatio;
        return kg;
    }

    public double kgramsToStones(double x){
        double stonesToKgramsRatio = 0.157;
        double kg = x*stonesToKgramsRatio;
        return kg;
    }

}
