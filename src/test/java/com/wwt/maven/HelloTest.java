package com.wwt.maven;

import org.junit.Test;
/**
 * @author ：wwt
 * @date ：Created in 2021/12/7 21:58
 * @description：
 * @modified By：
 * @version:
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}
