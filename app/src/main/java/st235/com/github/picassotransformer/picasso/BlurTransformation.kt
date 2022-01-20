package st235.com.github.picassotransformer.picasso

import android.graphics.Bitmap
import androidx.annotation.IntRange
import androidx.annotation.Px
import com.squareup.picasso.Transformation
import st235.com.github.picassotransformer.blur.blur

class BlurTransformation(
    @IntRange(from = 1L) @Px private val radius: Int,
    @IntRange(from = 1L) private val downscale: Int
): Transformation {

    private companion object {
        const val KEY = "BlurTransformation"
    }

    override fun transform(source: Bitmap?): Bitmap? {
        return source?.blur(radius, downscale)
    }

    override fun key(): String {
        return KEY
    }
}