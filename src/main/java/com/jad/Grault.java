package com.jad;

public class Grault {
    private Foo foo;

    public Grault(Foo foo) {
        this.foo = foo;
    }
    public Foo getFoo() {
        return this.foo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
