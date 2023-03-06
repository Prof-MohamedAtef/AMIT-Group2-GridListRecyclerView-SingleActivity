package mo.ed.course.two.amit.androidlists.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import mo.ed.course.two.amit.androidlists.R;
import mo.ed.course.two.amit.androidlists.databinding.ListViewFragmentBinding;

public class ListViewFragment extends Fragment {
    private ListViewFragmentBinding binding;
    private ArrayAdapter<String> listAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.list_view_fragment, container, false);

        String names[]={"Ahmed Samaha", "Shimaa Antar", "Basma Magdy", "Hanaa Gamal", "Omar Mahrous", "Ahmed Abdmonem"};
        listAdapter=new ArrayAdapter<String>(getActivity(),
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                names);

        binding.rvListView.setAdapter(listAdapter);

        return binding.getRoot();
    }
}
