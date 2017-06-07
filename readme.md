[![](https://jitpack.io/v/LiuZhiPeng1214/CircleProgress.svg)](https://jitpack.io/#LiuZhiPeng1214/CircleProgress)
# 圆形进度条
Android 自定义圆形进度条，包括传统传统的圆形(CircleProgress)、刻度(DialProgress)、水波纹(WaveProgress)效果的三种圆形进度条。

效果图如下：

![圆形进度条](circle.gif)

![刻度及水波纹进度条](dialandwave.gif)

## 使用方法
Add it in your root build.gradle at the end of repositories:
```
	allprojects {
 		repositories {
 			...
 			maven { url 'https://jitpack.io' }
 		}
 	}
```
 Add the dependency:
```
	dependencies {
    	   compile 'com.github.LiuZhiPeng1214:CircleProgress:0.0.1-beta'
    	}
```

## XML 配置
关于 XML 的配置请见 circleprogress module 下的 [attrs.xml](circleprogress/src/main/res/values/attrs.xml) 文件<br>
|语法|效果|
|----|-----|
|`*斜体1*`|*斜体1*|
|`_斜体2_`| _斜体2_|
|`**粗体1**`|**粗体1**|
|`__粗体2__`|__粗体2__|
|`这是一个 ~~删除线~~`|这是一个 ~~删除线~~|
|`***斜粗体1***`|***斜粗体1***|
|`___斜粗体2___`|___斜粗体2___|
|`***~~斜粗体删除线1~~***`|***~~斜粗体删除线1~~***|
|`~~***斜粗体删除线2***~~`|~~***斜粗体删除线2***~~|
