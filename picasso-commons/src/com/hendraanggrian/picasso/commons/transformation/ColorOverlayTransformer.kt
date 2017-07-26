package com.hendraanggrian.picasso.commons.transformation

import android.graphics.*
import android.support.annotation.ColorInt
import com.squareup.picasso.Transformation

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
internal class ColorOverlayTransformer(@ColorInt private val color: Int) : Transformation {

    override fun transform(source: Bitmap): Bitmap {
        val target = Bitmap.createBitmap(source.width, source.height, Bitmap.Config.ARGB_8888)
        Canvas(target).drawBitmap(source, 0f, 0f, Paint(Paint.ANTI_ALIAS_FLAG).apply {
            colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)
        })
        source.recycle()
        return target
    }

    override fun key() = "ColorOverlayTransformer[color=$color]"
}