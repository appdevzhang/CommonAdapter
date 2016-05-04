package com.nfmedia.appdevzhang.commonadapter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.SparseArray;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Pack200;

public class MainActivity extends Activity {

    private ListView mListView;
    private List<String> mDatas = new ArrayList<String>(Arrays.asList("Hello","World","Welcome",
            "Hello","World","Welcome","Hello","World","Welcome","Hello","World","Welcome",
            "Hello","World","Welcome","Hello","World","Welcome","Hello","World","Welcome"));
    private MyAdapter mMyAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.id_lv_main);
        mListView.setAdapter(mMyAdapter = new MyAdapter(this,mDatas));

    }
}
