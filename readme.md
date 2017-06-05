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
    	    compile 'com.github.LiuZhiPeng1214:CircleProgress:-SNAPSHOT'
    	}
```

## XML 配置
关于 XML 的配置请见 circleprogress module 下的 [attrs.xml](circleprogress/src/main/res/values/attrs.xml) 文件
