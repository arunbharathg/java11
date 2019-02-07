package com.arun;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;

public class LambdaVar {

    public static void main(String args[]) {
        var list = new ArrayList<String>();
        list.add("Java11");
        list.add("Lambda");
        list.add("var");
        list.add("Example");

        list.forEach( (@NotNull var str) -> System.out.println(str));
    }

}
