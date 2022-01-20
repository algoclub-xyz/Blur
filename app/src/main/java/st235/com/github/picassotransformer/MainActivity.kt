package st235.com.github.picassotransformer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.squareup.picasso.Picasso
import st235.com.github.picassotransformer.picasso.BlurTransformation

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: AppCompatImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.image_view)

        Picasso.get()
            .load("https://images.unsplash.com/photo-1637706636828-d6a4af8202b5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=4470&q=80")
            .transform(
                BlurTransformation(
                    radius = 16,
                    downscale = 4
                )
            )
            .into(imageView)
    }
}