package com.softserve.homework13.ex01;

public interface Converter <T1, T2, T3> {
    T1 convert(T2 str, T3 n);
}
