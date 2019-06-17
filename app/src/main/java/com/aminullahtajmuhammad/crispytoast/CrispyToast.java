package com.aminullahtajmuhammad.crispytoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;

public class CrispyToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    CrispyToast(Context context) { super(context); }

    public Toast makeCrispyToast(Context context, String text, int type, int duration) {
        Toast toast = new Toast(context);

        // Set Toast Duration
        toast.setDuration(duration);


        return toast;
    }
}
