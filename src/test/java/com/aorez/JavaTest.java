package com.aorez;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//jdk1.8.0_351
public class JavaTest {

    @Test
    public void test() {
        Pattern pattern = Pattern.compile("1*");
        String s = "111";
        Matcher matcher = pattern.matcher(s);
        boolean matches = matcher.matches();
        System.out.println(matches);//true
        String group = matcher.group(0);
        System.out.println(group);//111
    }
}
