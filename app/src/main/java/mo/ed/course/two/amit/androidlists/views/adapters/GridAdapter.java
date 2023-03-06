package mo.ed.course.two.amit.androidlists.views.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import mo.ed.course.two.amit.androidlists.R;
import mo.ed.course.two.amit.androidlists.views.models.CoursesModel;

public class GridAdapter extends ArrayAdapter<CoursesModel> {
    private final Context mContext;
    private final ArrayList<CoursesModel> mCoursesList;
    private View gridItem;

    public GridAdapter(@NonNull Context context, @NonNull ArrayList<CoursesModel> coursesModelArrayList) {
        super(context,0, coursesModelArrayList);
        this.mContext= context;
        this.mCoursesList=coursesModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (mCoursesList!=null){
            if (convertView ==null){
                gridItem = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
            }
            CoursesModel coursesModel=  mCoursesList.get(position);
            if (coursesModel != null){
                TextView tvPrice = gridItem.findViewById(R.id.tvPrice);
                TextView tvTime=gridItem.findViewById(R.id.tvTime);
                TextView tvTitle= gridItem.findViewById(R.id.tvTitle);

                tvTitle.setText((String.valueOf(coursesModel.getCourseTitle())));
                tvPrice.setText(String.valueOf(coursesModel.getCoursePrice()));
                tvTime.setText(coursesModel.getCourseTime());
                ImageView imageView= gridItem.findViewById(R.id.courseImg);
                Glide.with(mContext)
                        .load(coursesModel.getCoursePhoto())
                        .centerCrop()
                        .into(imageView);
            }
        }
        return gridItem;
    }
}
