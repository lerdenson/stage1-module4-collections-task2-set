package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        return new TreeSet<>(
                sourceList.stream()
                        .map(a -> a * a)
                        .filter(a ->
                                (a >= lowerBound && a <= upperBound)
                        )
                        .collect(Collectors.toSet()));
    }
}
