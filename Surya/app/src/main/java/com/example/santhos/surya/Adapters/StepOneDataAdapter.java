package com.example.santhos.surya.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.santhos.surya.MyView;
import com.example.santhos.surya.R;
import com.example.santhos.surya.classes.ListData;
import com.example.santhos.surya.classes.UtilsClass;

import java.util.ArrayList;

/**
 * Created by santhos on 20/9/17.
 */

public class StepOneDataAdapter extends RecyclerView.Adapter<StepOneDataAdapter.MyViewHolder>{

    Context context;
    ArrayList<ListData> dataList;

    public StepOneDataAdapter(Context context, ArrayList<ListData> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.step_one_recycler_item_view,parent,false);

        return new StepOneDataAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ListData listData=dataList.get(position);
           holder.head.setText(listData.getHead());
           holder.fare.setText(listData.getFare());
           holder.matter.setText(listData.getMatter());
           holder.rsfare.setText(listData.getRsfare());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView head,fare,matter,rsfare;
        private MyView myView;
        public MyViewHolder(View itemView) {
            super(itemView);
            head=(TextView)itemView.findViewById(R.id.item_name_head);
            fare=(TextView)itemView.findViewById(R.id.item_fare);
            matter=(TextView)itemView.findViewById(R.id.item_matter);
            rsfare=(TextView)itemView.findViewById(R.id.rs_fare);
            head.setTypeface(UtilsClass.getRoboto_condenced_bold(context));
            myView=(MyView)itemView.findViewById(R.id.my_custom_view);
        }
    }
}
