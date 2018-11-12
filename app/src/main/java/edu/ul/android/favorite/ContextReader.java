package edu.ul.android.favorite;

import android.content.Context;

public class ContextReader {
    private Context context;

    /**
     * Construct a context reader for Android
     * @param context an Android context object
     */
    public ContextReader(Context context) {
        this.context = context;

        context.getPackageResourcePath();
    }

    public boolean myRestricted() {
        return context.isRestricted();
    }

    public String myName() {
        return context.getPackageName();
    }

    public int myPermitted() {
        return context.checkSelfPermission("root");
    }
}
