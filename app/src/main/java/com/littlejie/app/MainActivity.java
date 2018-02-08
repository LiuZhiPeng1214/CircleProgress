package com.littlejie.app;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.littlejie.circleprogress.CircleProgress;
import com.littlejie.circleprogress.DialProgress;
import com.littlejie.circleprogress.HorizontalProgressBar;
import com.littlejie.circleprogress.PictureProgress;
import com.littlejie.circleprogress.WaveProgress;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static int[] COLORS = new int[]{Color.RED};

    private Button mBtnResetAll;
    private CircleProgress mCircleProgress1, mCircleProgress2, mCircleProgress3;
    private DialProgress mDialProgress;
    private WaveProgress mWaveProgress;
    private Random mRandom;
    public PictureProgress pb_1;
    public PictureProgress pb_2;
    public PictureProgress pb_3;
    public PictureProgress pb_4;
    public PictureProgress pb_5;
    public Button mStart;
    public ValueAnimator mValueAnimator;
    public HorizontalProgressBar mHorizontalProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnResetAll = (Button) findViewById(R.id.btn_reset_all);
        mCircleProgress1 = (CircleProgress) findViewById(R.id.circle_progress_bar1);
        mCircleProgress2 = (CircleProgress) findViewById(R.id.circle_progress_bar2);
        mCircleProgress3 = (CircleProgress) findViewById(R.id.circle_progress_bar3);
        mDialProgress = (DialProgress) findViewById(R.id.dial_progress_bar);
        mWaveProgress = (WaveProgress) findViewById(R.id.wave_progress_bar);
        pb_1 = (PictureProgress) findViewById(R.id.pb_1);
        pb_2 = (PictureProgress) findViewById(R.id.pb_2);
        pb_3 = (PictureProgress) findViewById(R.id.pb_3);
        pb_4 = (PictureProgress) findViewById(R.id.pb_4);
        pb_5 = (PictureProgress) findViewById(R.id.pb_5);
        mStart = (Button) findViewById(R.id.btn_start);
        mHorizontalProgressBar = (HorizontalProgressBar) findViewById(R.id.horizontalprogressbar);

        mBtnResetAll.setOnClickListener(this);
        mCircleProgress1.setOnClickListener(this);
        mCircleProgress2.setOnClickListener(this);
        mCircleProgress3.setOnClickListener(this);
        mDialProgress.setOnClickListener(this);
        mWaveProgress.setOnClickListener(this);
        mStart.setOnClickListener(this);
        mRandom = new Random();


        pb_1.setDrawableIds(new int[] {R.mipmap.i00,R.mipmap.i01,R.mipmap.i02,R.mipmap.i03,R.mipmap.i04,R.mipmap.i05});
        mValueAnimator = ValueAnimator.ofInt(0, 100);
        mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Log.d("sdsa", "onAnimationUpdate: " + Integer.parseInt(animation.getAnimatedValue().toString()));
                pb_1.setProgress(Integer.parseInt(animation.getAnimatedValue().toString()));
                if (pb_1.getProgress() >= pb_1.getMax()) {
                    //进度满了之后停止动画
                    pb_1.setAnimRun(false);
                }
                pb_2.setProgress(Integer.parseInt(animation.getAnimatedValue().toString()));
                if (pb_2.getProgress() >= pb_2.getMax()) {
                    //进度满了之后改变图片
                    pb_2.setPicture(R.mipmap.b666);
                }
                pb_3.setProgress(Integer.parseInt(animation.getAnimatedValue().toString()));
                if (pb_3.getProgress() >= pb_3.getMax()) {
                    pb_3.setAnimRun(false);
                }
                pb_4.setProgress(Integer.parseInt(animation.getAnimatedValue().toString()));
                if (pb_4.getProgress() >= pb_4.getMax()) {
                    pb_4.setAnimRun(false);
                }
                pb_5.setProgress(Integer.parseInt(animation.getAnimatedValue().toString()));
                if (pb_5.getProgress() >= pb_5.getMax()) {
                    pb_5.setAnimRun(false);
                }

                mHorizontalProgressBar.setCurrentProgress(Integer.parseInt(animation.getAnimatedValue().toString()));
            }
        });
        mValueAnimator.setDuration(10000);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_reset_all:
                mCircleProgress1.reset();
                mCircleProgress2.reset();
                mCircleProgress3.reset();
                mDialProgress.reset();
                break;
            case R.id.circle_progress_bar1:
                mCircleProgress1.setValue(mRandom.nextInt((int) mCircleProgress1.getMaxValue()));
                break;
            case R.id.circle_progress_bar2:
                mCircleProgress2.setmIsSweepGradient(false);
                mCircleProgress2.setGradientColors(COLORS);
                mCircleProgress2.setValue(mRandom.nextFloat() * mCircleProgress2.getMaxValue());
                break;
            case R.id.circle_progress_bar3:
                //在代码中动态改变渐变色，可能会导致颜色跳跃
                mCircleProgress3.setmIsSweepGradient(true);
                mCircleProgress3.setGradientColors(COLORS);
                mCircleProgress3.setValue(mRandom.nextFloat() * mCircleProgress3.getMaxValue());
                break;
            case R.id.dial_progress_bar:
                mDialProgress.setValue(mRandom.nextFloat() * mDialProgress.getMaxValue());
                break;
            case R.id.wave_progress_bar:
                mWaveProgress.setValue(mRandom.nextFloat() * mWaveProgress.getMaxValue());
                break;
            case R.id.btn_start:
                System.out.println("zxx");
                pb_1.setAnimRun(true);
                mValueAnimator.start();
                break;
        }
    }
}
