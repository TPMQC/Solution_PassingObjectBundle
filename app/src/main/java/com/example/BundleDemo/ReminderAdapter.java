package com.example.BundleDemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.BundleDemo.model.Reminder;

import java.util.List;

public class ReminderAdapter extends RecyclerView.Adapter<ReminderAdapter.ViewHolder> {
    public static final String RBUNDLE = "RBUNDLE";
    private Context context;
    private List<Reminder> reminderList;

    public ReminderAdapter(Context context, List<Reminder> reminderList) {
        this.context = context;
        this.reminderList = reminderList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.bind(reminderList.get(position));
    }

    @Override
    public int getItemCount() {
        return reminderList != null ? reminderList.size() : 0;
    }

    public void updateReminderList(List<Reminder> reminderList) {
        this.reminderList = reminderList;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTittle, tvDate, tvPriority;
        private View container;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTittle = itemView.findViewById(R.id.title_value_TexView);
            tvDate = itemView.findViewById(R.id.Time_value_TextView);
            tvPriority = itemView.findViewById(R.id.priority_Value_TextView);
            container = itemView.findViewById(R.id.relativelayout_container);
        }

        private void bind(final Reminder reminder) {
            tvTittle.setText(reminder.getTittle());
            tvPriority.setText(reminder.getPriority());
            tvDate.setText(reminder.getTime());
            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Todo: Passing this reminder object to detail activity
                    Bundle b = reminder.toBundle();
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra(RBUNDLE, b);
                    context.startActivity(intent);
                }
            });
        }
    }

}
