package com.designPatterns.PrototypePattern.Example1;

public interface Prototype<T extends Prototype<T>> {
    T copy();
}
