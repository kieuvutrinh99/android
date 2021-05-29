package com.example.kieuvutrinh_appbtl.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kieuvutrinh_appbtl.Adapter.FoodAdapter;
import com.example.kieuvutrinh_appbtl.Category;
import com.example.kieuvutrinh_appbtl.Food;
import com.example.kieuvutrinh_appbtl.MainActivity;
import com.example.kieuvutrinh_appbtl.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {
    RecyclerView recyclerView;
    List<Food> list_food = new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FoodFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoodFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodFragment newInstance(String param1, String param2) {
        FoodFragment fragment = new FoodFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food,container,false);
        recyclerView = view.findViewById(R.id.rcv_food);
        list_food.add(new Food(R.drawable.canhga,"Cách làm gà chiên kiểu thái"));
        list_food.add(new Food(R.drawable.phocuon,"Cách làm phở cuốn thịt bò ngon"));
        list_food.add(new Food(R.drawable.canhga,"Cách làm gà chiên kiểu thái"));
        list_food.add(new Food(R.drawable.canhga,"Cách làm gà chiên kiểu thái"));

        FoodAdapter adapter = new FoodAdapter(getActivity(),list_food,R.layout.item_food);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}