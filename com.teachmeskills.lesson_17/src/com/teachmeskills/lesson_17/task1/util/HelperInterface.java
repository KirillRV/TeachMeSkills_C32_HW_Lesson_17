package com.teachmeskills.lesson_17.task1.util;

@FunctionalInterface
public interface HelperInterface<T> {

    T apply(T obj);
}