package com.example.coilsimple

import android.app.Application
import android.os.Build.VERSION.SDK_INT
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.decode.SvgDecoder
import coil.decode.VideoFrameDecoder
import coil.fetch.VideoFrameFileFetcher
import coil.fetch.VideoFrameUriFetcher
import coil.util.CoilUtils
import okhttp3.OkHttpClient

/**
 * https://github.com/coil-kt/coil
 */
class BaseApplication : Application(), ImageLoaderFactory {
    override fun onCreate() {
        super.onCreate()
    }

    override fun newImageLoader(): ImageLoader =
        ImageLoader.Builder(applicationContext)
            .componentRegistry {
                add(SvgDecoder(applicationContext))
                if (SDK_INT >= 28) {
                    add(ImageDecoderDecoder(applicationContext))
                } else {
                    add(GifDecoder())
                }
                add(VideoFrameFileFetcher(applicationContext))
                add(VideoFrameUriFetcher(applicationContext))
                add(VideoFrameDecoder(applicationContext))
            }.crossfade(true)
            .okHttpClient {
                OkHttpClient.Builder().cache(CoilUtils.createDefaultCache(applicationContext))
                    .build()
            }.build()
}