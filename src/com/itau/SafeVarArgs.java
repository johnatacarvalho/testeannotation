package com.itau;

import java.util.ArrayList;
import java.util.List;

public class SafeVarArgs<T> {

    private List<T> topics = new ArrayList<>();

    @SafeVarargs
    public final void add(T... toAdd)
    {
        for (T topic : toAdd) {
            topics.add(topic);
        }
    }

    public static void main(String[] args)
    {
        SafeVarArgs safeVarArgs = new SafeVarArgs();
        safeVarArgs.add("OI",
                "OI 1",
                "OI 2");
        System.out.println(safeVarArgs.topics);
    }
}
