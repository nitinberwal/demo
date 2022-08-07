package com.nitinberwal.navi_assignment.util

import android.content.Context
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import java.util.concurrent.Executors


fun loadImageFromUrl(imageView: ImageView, imageUrl: String) {
    val executor = Executors.newSingleThreadExecutor()

    val handler = Handler(Looper.getMainLooper())

    var image: Bitmap? = null

    executor.execute {
        try {
            val `in` = java.net.URL(imageUrl).openStream()
            image = BitmapFactory.decodeStream(`in`)

            handler.post {
                imageView.setImageBitmap(image)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}


fun getProgressDrawable(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 10f
        centerRadius = 50f
        start()
    }
}
