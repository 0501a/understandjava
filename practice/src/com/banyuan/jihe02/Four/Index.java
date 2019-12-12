package com.banyuan.jihe02.Four;

import java.util.Objects;

public class Index {
    int ind;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Index index = (Index) o;
        return ind == index.ind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ind);
    }
}
