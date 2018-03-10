package com.xyc.musicplay.UI;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.xyc.guguviews.views.BaseActivity;
import com.xyc.guguviews.views.PullListView;
import com.xyc.musicplay.R;

public class MainActivity extends BaseActivity {

    private ImageView ivBgUser;
    private ImageView ivPlayLogo;
    private ImageView ivLastMusic;
    private ImageView ivPauseMusic;
    private ImageView ivNextMusic;
    private TextView tvMusicName;
    private PullListView pullListView;

    @Override
    protected void initHeader() {
        setHeaderVisibility(View.GONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHeaderTitleBarColor(this.getResources().getColor(R.color.title_state_bar_color));
        setCenterView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        pullListView = (PullListView) findViewById(R.id.pullListView);
        ivBgUser = (ImageView) findViewById(R.id.ivBgUser);
        ivPlayLogo = (ImageView) findViewById(R.id.ivPlayLogo);
        ivLastMusic = (ImageView) findViewById(R.id.ivLastMusic);
        ivPauseMusic = (ImageView) findViewById(R.id.ivPauseMusic);
        ivNextMusic = (ImageView) findViewById(R.id.ivNextMusic);
        tvMusicName = (TextView) findViewById(R.id.tvMusicName);

    }

    public static Intent makeIntent(Context context) {

        return new Intent(context, MainActivity.class);
    }
}
