package com.kotlinfirstdemo;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by mayur.p on 6/13/2017.
 */

/*
Use this class to convert your java code to kotlin
For this go to Code click Convert Java File to Kotlin File.
*/

public class JavaToKotlin {
    public static String strStatic = "New";
    private Context context;
    private String[] strA = {"", ""};

    public JavaToKotlin(Context context, String[] str) {
        this.context = context;
        ArrayAdapter<String> strArr = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, strA);
    }

    @Target(ElementType.METHOD)
    @interface Status {

    }
}
