package mo.ed.course.two.amit.androidlists.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import mo.ed.course.two.amit.androidlists.R;
import mo.ed.course.two.amit.androidlists.databinding.ActivityMainBinding;
import mo.ed.course.two.amit.androidlists.views.fragments.GridViewFragment;
import mo.ed.course.two.amit.androidlists.views.fragments.ListViewFragment;
import mo.ed.course.two.amit.androidlists.views.fragments.RecyclerViewFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(binding.frameLayout.getId(),
                        new ListViewFragment()).commitAllowingStateLoss();
            }
        });


        binding.btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(binding.frameLayout.getId(),
                        new GridViewFragment()).commitAllowingStateLoss();
            }
        });

        binding.btnRViewHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(binding.frameLayout.getId(),
                        new RecyclerViewFragment().newInstance(LinearLayoutManager.HORIZONTAL)).commitAllowingStateLoss();
            }
        });

        binding.btnRViewVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(binding.frameLayout.getId(),
                        new RecyclerViewFragment().newInstance(LinearLayoutManager.VERTICAL)).commitAllowingStateLoss();
            }
        });
    }
}