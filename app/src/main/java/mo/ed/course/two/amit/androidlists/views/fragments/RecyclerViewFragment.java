package mo.ed.course.two.amit.androidlists.views.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mo.ed.course.two.amit.androidlists.Config;
import mo.ed.course.two.amit.androidlists.R;
import mo.ed.course.two.amit.androidlists.databinding.RecyclerViewFragmentBinding;
import mo.ed.course.two.amit.androidlists.views.adapters.ExclusiveRecyclerAdapter;
import mo.ed.course.two.amit.androidlists.views.models.ExclusiveOffer;

public class RecyclerViewFragment extends Fragment {

    private int orientation;

    public Fragment newInstance(int orientation){
        Fragment fragment = new RecyclerViewFragment();
        Bundle bundle= new Bundle();
        bundle.putInt(Config.ORIENTATION, orientation);
        fragment.setArguments(bundle);
        return fragment;
    }
    private RecyclerViewFragmentBinding binding;
    private ArrayList<ExclusiveOffer> offersArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.recycler_view_fragment, container, false);

        Bundle bundle = getArguments();
        if (bundle !=null && bundle.containsKey(Config.ORIENTATION)){
            orientation= bundle.getInt(Config.ORIENTATION);
        }
        offersArrayList=new ArrayList<>();
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.banana), "banana",1800, 20));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.orange), "orange",2000, 25));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.straubry), "strawberry",1999, 28));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.mango), "Mango",2500, 29));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.ananas), "Ananas",1850, 30));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.peach), "Peach",1400, 15));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.mshmsh), "mshmsh",1250, 16));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.watermellon), "Watermelon",1000, 6));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.carrot), "Carrot",1200, 9));
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        populateRecyclerView(offersArrayList);
    }

    private void populateRecyclerView(ArrayList<ExclusiveOffer> offersArrayList) {
        ExclusiveRecyclerAdapter exclusiveRecyclerAdapter = new ExclusiveRecyclerAdapter(getActivity(), offersArrayList);
        RecyclerView.LayoutManager mLayoutManager=new LinearLayoutManager(getActivity(), orientation, false);
        binding.rvLayout.setLayoutManager(mLayoutManager);
        binding.rvLayout.setItemAnimator(new DefaultItemAnimator());
        binding.rvLayout.setAdapter(exclusiveRecyclerAdapter);
        exclusiveRecyclerAdapter.notifyDataSetChanged();
    }
}
