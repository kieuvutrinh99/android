package com.example.kieuvutrinh_appbtl.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kieuvutrinh_appbtl.Food;
import com.example.kieuvutrinh_appbtl.R;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private Context context;
    private List<Food> mListFood;
    private int layout;

    public FoodAdapter(Context context, List<Food> mListFood, int layout) {
        this.context = context;
        this.mListFood = mListFood;
        this.layout = layout;
    }


    @NonNull
    @Override
    public FoodAdapter.FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(layout,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.FoodViewHolder holder, int position) {
        Food food = mListFood.get(position);
        holder.img.setImageResource(food.getImg_food());
        holder.textView.setText(food.getName_Food());
    }

    @Override
    public int getItemCount() {
        if(mListFood!=null) return mListFood.size();
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView textView;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_item_food);
            textView = itemView.findViewById(R.id.tv_food_item);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    
                }
            });
        }
    }
}
