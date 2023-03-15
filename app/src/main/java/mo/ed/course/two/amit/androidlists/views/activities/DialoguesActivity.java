package mo.ed.course.two.amit.androidlists.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import mo.ed.course.two.amit.androidlists.R;
import mo.ed.course.two.amit.androidlists.databinding.ActivityDialoguesBinding;
import mo.ed.course.two.amit.androidlists.views.dialogues.CustomDialogueBuilder;
import mo.ed.course.two.amit.androidlists.views.dialogues.CustomDialogueFragment;

public class DialoguesActivity extends AppCompatActivity implements CustomDialogueBuilder.OnDialogueBuilderUserResponse {

    private ActivityDialoguesBinding binding;
    private boolean isLargeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dialogues);

        binding.showDialogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager= getSupportFragmentManager();
                CustomDialogueBuilder cm= CustomDialogueBuilder.newInstance();
                cm.show(manager, "dialogue");
            }
        });

        binding.showDialogueFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogueFragment();
            }
        });
    }

    private void showDialogueFragment() {
        FragmentManager fm = getSupportFragmentManager();
        CustomDialogueFragment customDialogueFragment = new CustomDialogueFragment(getApplicationContext(), DialoguesActivity.this);
        isLargeLayout = false;
        if (isLargeLayout){
            customDialogueFragment.show(fm, "MemberDialog");
            Log.e("fragmentTransaction","true");
        }else {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            transaction.add(android.R.id.content, customDialogueFragment,"MemberDialog")
                    .addToBackStack(null).commit();
            Log.e("fragmentTransaction","false");
        }
    }

    @Override
    public void onOk(String location) {
        Log.e("ClickOk", "User Clicked Ok "+location);
        Toast.makeText(getApplicationContext(), location, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCancel(int value) {
        Log.e("ClickCancel", "User Clicked Cancel "+value);
    }
}