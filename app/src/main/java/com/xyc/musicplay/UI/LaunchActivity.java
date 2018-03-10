package com.xyc.musicplay.UI;

import android.os.Bundle;
import android.view.View;

import com.xyc.guguviews.views.BaseActivity;
import com.xyc.musicplay.R;

public class LaunchActivity extends BaseActivity {

    @Override
    protected void initHeader() {
      setHeaderVisibility(View.GONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCenterView(R.layout.activity_launch);
    }
}
