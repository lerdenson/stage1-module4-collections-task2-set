package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> res = new HashSet<>();
        for (Integer el: sourceList) {
            if (el != 0 && el % 2 == 0) {
                int v = el;
                while (v % 2 == 0) {
                    res.add(v);
                    v /= 2;
                }
                res.add(v);
            } else {
                res.add(el);
                res.add(el * 2);
            }
        }

        return res;
    }
}
