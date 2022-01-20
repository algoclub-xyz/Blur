package st235.com.github.picassotransformer.blur

import android.graphics.Bitmap
import androidx.annotation.IntRange
import androidx.annotation.Px

fun Bitmap?.blur(
    @IntRange(from = 1L) @Px radius: Int,
    @IntRange(from = 1L) downscale: Int
): Bitmap? {
    if (this == null) {
        return null
    }

    return Blur.apply(radius, downscale, this)
}