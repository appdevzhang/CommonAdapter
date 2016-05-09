package com.nfmedia.appdevzhang.commonadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by appdevzhang on 16/5/3.
 */
public class MyAdapter extends CommonAdapter {

//    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<String> mDatas;

    public MyAdapter(Context context, List<String> datas) {
        /*
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        mDatas = datas;
        */
        super(context,datas);
    }

    /*
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*
        ViewHolder viewHolder = null;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.adapter_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.mTextView = (TextView) convertView.findViewById(R.id.id_tv_title);
            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();

        }

        viewHolder.mTextView.setText(mDatas.get(position));
        return convertView;
        */
        CommonViewHolder commonViewHolder = CommonViewHolder.get(mContext,convertView,parent,
                R.layout.adapter_item,position);
        TextView mTitle = commonViewHolder.getView(R.id.id_tv_title);
        mTitle.setText(mDatas.get(position));
        return commonViewHolder.getConvertView();
    }

    /*
    private final class ViewHolder{
        TextView mTextView;
    }
    */
}
