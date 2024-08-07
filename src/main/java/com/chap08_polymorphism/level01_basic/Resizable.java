package com.chap08_polymorphism.level01_basic;

public interface Resizable {
    /* 도형의 모든 속성을 인자만큼 곱해서 크기를 조정하는 메소드 */
    /* 추상 메소드만 작성이 가능하다.
    *  묵시적으로 public abstract의 의미를 가진다.*/
    void resize(double factor);

}
