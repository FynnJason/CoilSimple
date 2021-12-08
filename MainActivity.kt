package com.example.coilsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val IMAGE_URL = "http://lmg.jj20.com/up/allimg/tp01/1ZZQ20QJS6-0-lp.jpg"
        const val GIF_URL = "http://c-ssl.duitang.com/uploads/item/202003/18/20200318112734_gjlma.thumb.1000_0.gif"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iv1()
        iv2()
        iv3()
        iv4()
        iv5()
        iv6()
        iv7()
    }

    /**
     * iv_1
     * 简单加载图片
     */
    private fun iv1() {
        iv_1.load(IMAGE_URL) {
            placeholder(R.mipmap.ic_launcher)
            error(R.mipmap.ic_launcher_round)
        }
    }

    /**
     * iv_2
     * 加载圆形头像
     */
    private fun iv2() {
        iv_2.load(IMAGE_URL) {
            placeholder(R.mipmap.ic_launcher)
            error(R.mipmap.ic_launcher_round)
            transformations(CircleCropTransformation())
        }
    }

    /**
     * iv_3
     * 加载圆角图片
     * 示例：10px圆角
     */
    private fun iv3(){
        iv_3.load(IMAGE_URL){
            placeholder(R.mipmap.ic_launcher)
            error(R.mipmap.ic_launcher_round)
            transformations(RoundedCornersTransformation(10f))
        }
    }

    /**
     * iv_4
     * 加载高斯模糊图片
     */
    private fun iv4(){
        iv_4.load(IMAGE_URL){
            placeholder(R.mipmap.ic_launcher)
            error(R.mipmap.ic_launcher_round)
            transformations(BlurTransformation(applicationContext))
        }
    }

    /**
     * iv_5
     * 加载灰度图片
     */
    private fun iv5(){
        iv_5.load(IMAGE_URL){
            placeholder(R.mipmap.ic_launcher)
            error(R.mipmap.ic_launcher_round)
            transformations(GrayscaleTransformation())
        }
    }

    /**
     * iv_6
     * 加载SVG图片
     */
    private fun iv6(){
        iv_6.load(R.drawable.ic_baseline_ac_unit_24)
    }

    /**
     * iv_7
     * 加载GIF图片
     */
    private fun iv7(){
        iv_7.load(GIF_URL){
            placeholder(R.mipmap.ic_launcher)
            error(R.mipmap.ic_launcher_round)
        }
    }
}