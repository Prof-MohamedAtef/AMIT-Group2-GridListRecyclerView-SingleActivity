package mo.ed.course.two.amit.androidlists.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import mo.ed.course.two.amit.androidlists.R;
import mo.ed.course.two.amit.androidlists.databinding.GridViewFragmentBinding;
import mo.ed.course.two.amit.androidlists.views.adapters.GridAdapter;
import mo.ed.course.two.amit.androidlists.views.models.CoursesModel;

public class GridViewFragment extends Fragment {
    private GridViewFragmentBinding binding;
    private ArrayList<CoursesModel> courseArr;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.grid_view_fragment, container, false);

        courseArr=new ArrayList<CoursesModel>();
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.banana)));
        courseArr.add(new CoursesModel("Machine Learning",1500,"07:00 PM",getResources().getDrawable(R.drawable.orange)));
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.straubry)));
        courseArr.add(new CoursesModel("Machine Learning",1500,"07:00 PM",getResources().getDrawable(R.drawable.mango)));
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.ananas)));
        courseArr.add(new CoursesModel("Machine Learning",1500,"07:00 PM",getResources().getDrawable(R.drawable.peach)));
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.mshmsh)));
        courseArr.add(new CoursesModel("Machine Learning",1500,"07:00 PM",getResources().getDrawable(R.drawable.watermellon)));
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.carrot)));
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.banana)));
        courseArr.add(new CoursesModel("Machine Learning",1500,"07:00 PM",getResources().getDrawable(R.drawable.orange)));
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.straubry)));
        courseArr.add(new CoursesModel("Machine Learning",1500,"07:00 PM",getResources().getDrawable(R.drawable.mango)));
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.ananas)));
        courseArr.add(new CoursesModel("Machine Learning",1500,"07:00 PM",getResources().getDrawable(R.drawable.peach)));
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.mshmsh)));
        courseArr.add(new CoursesModel("Machine Learning",1500,"07:00 PM",getResources().getDrawable(R.drawable.watermellon)));
        courseArr.add(new CoursesModel("Data Structure",500,"07:00 PM",getResources().getDrawable(R.drawable.carrot)));

        GridAdapter gridAdapter = new GridAdapter(getActivity(), courseArr);
        binding.idGVcourses.setAdapter(gridAdapter);
        return binding.getRoot();
    }
}