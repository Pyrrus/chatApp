package com.example.guest.chatapp.helper;

/**
 * Created by Guest on 12/7/16.
 */
/**
 * Created by Adam on 12/2/2016.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;


/**
 * Created by Guest on 11/30/16.
 */
public class FontManager {
    public static final String ROOT = "fonts/";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), ROOT + font);
    }

    public static String setIcon(Context context, int id) {
        String result = "";
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(context.getString(id),Html.FROM_HTML_MODE_LEGACY).toString();
        } else {
            result = Html.fromHtml(context.getString(id)).toString();
        }
        return result;
    }
}
