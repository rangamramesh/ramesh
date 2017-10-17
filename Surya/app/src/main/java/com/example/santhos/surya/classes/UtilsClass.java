package com.example.santhos.surya.classes;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by santhos on 20/9/17.
 */

public class UtilsClass {

    public static Typeface getRoboto_condenced_bold(Context context) {

        Typeface tf1 = Typeface.createFromAsset(context.getAssets(), "RobotoCondensed-Bold.ttf");
        return tf1;
    }

    public static Typeface getRoboto_Black(Context context) {

        Typeface tf1 = Typeface.createFromAsset(context.getAssets(), "Roboto-Black.ttf");
        return tf1;
    }

    public static Typeface getRoboto_Regular(Context context) {

        Typeface tf1 = Typeface.createFromAsset(context.getAssets(), "Roboto-Regular.ttf");
        return tf1;
    }

    public static Typeface getRoboto_condenced_Regular(Context context) {

        Typeface tf1 = Typeface.createFromAsset(context.getAssets(), "RobotoCondensed-Regular.ttf");
        return tf1;
    }
}
