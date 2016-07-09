package com.meewah.staggeredlayoutdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import com.meewah.staggeredlayoutdemo.adapters.MyCustomAdapter;
import com.meewah.staggeredlayoutdemo.models.ImageModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    MyCustomAdapter adapter;
    Context mContext;
    ArrayList<ImageModel> mImageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mContext = this;
        setupData();
        setupView();

    }

    private void setupView() {

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new MyCustomAdapter(this, mImageList); // pass context and list of imageModel
        recyclerView.setAdapter(adapter);

        // (int spanCount, int orientation)
        StaggeredGridLayoutManager mStaggeredHorizontalLayoutManager =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(mStaggeredHorizontalLayoutManager);
    }

    private void setupData() {
        int[] images = {
                R.drawable.peacock_1,
                R.drawable.peacock_2,
                R.drawable.peacock_3,
                R.drawable.peacock_4,
                R.drawable.peacock_5,
                R.drawable.peacock_6,
                R.drawable.peacock_7,
                R.drawable.peacock_8,
                R.drawable.peacock_9,
                R.drawable.peacock_10,
                R.drawable.peacock_11,
                R.drawable.peacock_12
        };

        for (int i = 0; i < images.length; i++) {

            ImageModel imageModel = new ImageModel(images[i], "peakcock_" + (i+1));
            mImageList.add(imageModel);

        }
    }

}
