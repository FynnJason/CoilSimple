# 基础使用
添加相关的依赖
```
    implementation("io.coil-kt:coil:1.4.0")
    implementation("io.coil-kt:coil-svg:1.4.0")
    implementation("io.coil-kt:coil-gif:1.4.0")
    implementation("io.coil-kt:coil-video:1.4.0")
```
在MainActivity中给出了一些常用的用法
```
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
```
