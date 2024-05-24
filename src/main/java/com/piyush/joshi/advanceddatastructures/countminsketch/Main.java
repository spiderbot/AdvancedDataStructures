package com.piyush.joshi.advanceddatastructures.countminsketch;

import com.clearspring.analytics.stream.frequency.CountMinSketch;

public class Main {
    public static void main(String[] args) {
        CountMinSketch countMinSketch = new CountMinSketch(// epsilon
                0.001,
                // delta
                0.99,
                // seed
                1);

        countMinSketch.add("piyush",1000);
        countMinSketch.add("joshi",200);
        System.out.println(countMinSketch.estimateCount("piyush"));

    }
}
