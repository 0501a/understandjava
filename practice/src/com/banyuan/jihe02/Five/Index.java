package com.banyuan.jihe02.Five;

import CollectionDemo.src.com.banyuan.collectionDemo.collectionDemo.MyCollection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Index {
    static Set<String> ind=new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Index index = (Index) o;
        return Objects.equals(ind, index.ind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ind);
    }
}
