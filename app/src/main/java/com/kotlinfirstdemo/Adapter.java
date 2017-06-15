package com.kotlinfirstdemo;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by mayur.p on 6/13/2017.
 */

public class Adapter {
    public static String strStatic = "New";
    Context context;
    String[] strA = {"", ""};

    public Adapter(Context context, String[] str) {
        this.context = context;
        ArrayAdapter<String> strArr = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, strA);
    }

    @Target(ElementType.METHOD)
    @interface Status {

    }
}
