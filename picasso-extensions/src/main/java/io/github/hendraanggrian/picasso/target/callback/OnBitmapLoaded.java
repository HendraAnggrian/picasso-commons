package io.github.hendraanggrian.picasso.target.callback;

import android.graphics.Bitmap;

import com.squareup.picasso.Picasso;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public interface OnBitmapLoaded {

    void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from);
}
