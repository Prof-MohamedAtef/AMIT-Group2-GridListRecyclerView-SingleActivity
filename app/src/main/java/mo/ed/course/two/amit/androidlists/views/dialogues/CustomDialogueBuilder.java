package mo.ed.course.two.amit.androidlists.views.dialogues;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class CustomDialogueBuilder extends DialogFragment {

    OnDialogueBuilderUserResponse onDialogueBuilderUserResponse;

    public static CustomDialogueBuilder newInstance(){
        return new CustomDialogueBuilder();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        onDialogueBuilderUserResponse = (OnDialogueBuilderUserResponse) context;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("AMIT Courses");
        builder.setMessage("Android Course | Flutter Course | Machine Learning Course");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                onDialogueBuilderUserResponse.onOk("Cairo");
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                onDialogueBuilderUserResponse.onCancel(-1);
            }
        });
        return builder.create();
    }

    public interface OnDialogueBuilderUserResponse{
        public void onOk(String location);
        public void onCancel(int value);
    }
}
