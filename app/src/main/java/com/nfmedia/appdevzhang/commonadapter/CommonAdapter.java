package com.nfmedia.appdevzhang.commonadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by appdevzhang on 16/5/9.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {

    protected LayoutInflater mLayoutInflater;
    protected Context mContext;
    protected List<T> mDatas;
    protected final int mItemLayoutId;

    public CommonAdapter (Context context, List<T> datas,int itemLayoutId) {
        this.mLayoutInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mDatas = datas;
        this.mItemLayoutId = itemLayoutId;
    }

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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final CommonViewHolder commonViewHolder = getCommonViewHolder(position,convertView,parent);
        convert(commonViewHolder, (T) getItem(position));
        return commonViewHolder.getConvertView();
    }
    public abstract void convert(CommonViewHolder helper,T item);

    private CommonViewHolder getCommonViewHolder(int position,View convertView,ViewGroup parent){
        return CommonViewHolder.get(mContext,convertView,parent,mItemLayoutId,position);
    }

}
