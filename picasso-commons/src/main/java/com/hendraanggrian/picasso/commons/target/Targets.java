package com.hendraanggrian.picasso.commons.target;

import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Targets {

    /**
     * Set default progress bar as target's placeholder.
     */
    @NonNull
    public static PlaceholderTarget placeholder(@NonNull ImageView target) {
        ProgressBar progressBar = new ProgressBar(target.getContext());
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        ((FrameLayout.LayoutParams) progressBar.getLayoutParams()).gravity = Gravity.CENTER;
        return new PlaceholderTarget(target, progressBar);
    }

    /**
     * Set custom view as target's placeholder.
     */
    @NonNull
    public static PlaceholderTarget placeholder(@NonNull ImageView target, @NonNull View placeholder) {
        return new PlaceholderTarget(target, placeholder);
    }

    public interface OnSuccess {
        void onSuccess();
    }

    public interface OnError {
        void onError();
    }
}