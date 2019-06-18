package com.aminullahtajmuhammad.crispytoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CrispyToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public static int DEFAULT_STATE = 1;
    public static int ERROR_STATE = 2;
    public static int SUCCESS_STATE = 3;
    public static int WARNING_STATE = 4;
    public static int CONFUSE_STATE = 5;
    public static int CONNECTION_LOST_STATE = 6;


    CrispyToast(Context context) { super(context); }

    public static Toast makeCrispyToast(Context context, String text, int type, int duration) {

        RelativeLayout crispyToastLayout;
        TextView crispyToastText;
        ImageView crispyToastImage;

        View toastLayout = LayoutInflater.from(context).inflate(R.layout.crispy_toast_layout, null, false);

        crispyToastLayout = toastLayout.findViewById(R.id.crispyToastLayout);
        crispyToastImage = toastLayout.findViewById(R.id.crispyToastIcon);
        crispyToastText = toastLayout.findViewById(R.id.crispyToastText);

        Toast toast = new Toast(context);

        // Set CrispyToast Duration
        toast.setDuration(duration);

        // Set CrispyToast Text
        crispyToastText.setText(text);

        // Set CrispyToast Type
        switch (type) {
            case 1: {
                crispyToastLayout.setBackgroundResource(R.drawable.shape_default_state);
                crispyToastImage.setVisibility(View.GONE);
                break;
            }

            case 2: {
                crispyToastLayout.setBackgroundResource(R.drawable.shape_error_state);
                crispyToastImage.setImageResource(R.drawable.ic_clear_black_24dp);
                break;
            }

            case 3: {
                crispyToastLayout.setBackgroundResource(R.drawable.shape_success_state);
                crispyToastImage.setImageResource(R.drawable.ic_check_black_24dp);
                break;
            }

            case 4: {
                crispyToastLayout.setBackgroundResource(R.drawable.shape_warning_state);
                crispyToastImage.setImageResource(R.drawable.ic_info_outline_black_24dp);
                break;
            }

            case 5: {
                crispyToastLayout.setBackgroundResource(R.drawable.shape_confuse_state);
                crispyToastImage.setImageResource(R.drawable.ic_pan_tool_black_24dp);

                break;
            }

            case 6: {
                crispyToastLayout.setBackgroundResource(R.drawable.shape_connect_lost_state);
                crispyToastImage.setImageResource(R.drawable.ic_refresh_black_24dp);

                break;
            }

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

        toast.setView(toastLayout);
        return toast;
    }
}
