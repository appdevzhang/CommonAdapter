package com.nfmedia.appdevzhang.commonadapter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Pack200;

public class MainActivity extends Activity {

    private ListView mListView;
    private List<String> mDatas = new ArrayList<String>(Arrays.asList("Hello","World","Welcome",
            "Hello","World","Welcome","Hello","World","Welcome","Hello","World","Welcome",
            "Hello","World","Welcome","Hello","World","Welcome","Hello","World","Welcome"));
//    private MyAdapter mMyAdapter ;
    private BaseAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.id_lv_main);
//        mListView.setAdapter(mMyAdapter = new MyAdapter(this,mDatas));
        mListView.setAdapter(mAdapter = new CommonAdapter<String>(getApplicationContext(),mDatas,
                R.layout.adapter_item) {
            @Override
            public void convert(CommonViewHolder helper, String item) {
                TextView title = (TextView) findViewById(R.id.id_tv_title);
                title.setText(item);
            }
        });

    }
}
