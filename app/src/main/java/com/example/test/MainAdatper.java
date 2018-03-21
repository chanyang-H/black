package com.example.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 곰발 on 2018-03-21.
 */

public class MainAdatper extends RecyclerView.Adapter<VHMain> {

    private List<String> strList;
    public  void setData(List<String> strList){
        this.strList =strList;
    }


    @Override
    public VHMain onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vh_main, parent, false);
        VHMain vhMain = new VHMain(view);
        return vhMain;
    }

    @Override
    public void onBindViewHolder(VHMain holder, int position) {

        TextView tv = holder.itemView.findViewById(R.id.txtTitle);
        tv.setText(strList.get(position));

    }

    @Override
    public int getItemCount() {
        return strList == null ? 0 : strList.size();
    }
}
