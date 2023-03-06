package mo.ed.course.two.amit.androidlists.views.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import mo.ed.course.two.amit.androidlists.R;
import mo.ed.course.two.amit.androidlists.databinding.ExclusiveListItemBinding;
import mo.ed.course.two.amit.androidlists.views.models.ExclusiveOffer;

public class ExclusiveRecyclerAdapter extends RecyclerView.Adapter<ExclusiveRecyclerAdapter.ViewHolder>{

    private final Context mContext;
    private final ArrayList<ExclusiveOffer> offersList;
    ExclusiveListItemBinding binding;

    public ExclusiveRecyclerAdapter(Context context, ArrayList<ExclusiveOffer> list){
        this.mContext=context;
        this.offersList=list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e("Adapter","onCreateViewHolder Adapter");
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.exclusive_list_item, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.e("Adapter","onBindViewHolder Adapter");
        ExclusiveOffer exclusiveOffer = offersList.get(position);
        if (exclusiveOffer != null){
            if (exclusiveOffer.getImage()!=null){
                Glide
                        .with(mContext)
                        .load(exclusiveOffer.getImage())
                        .centerCrop()
                        .into(binding.fruitImage);
            }
            binding.tvTitle.setText(exclusiveOffer.getTitle());
            binding.tvCurrency.setText("E£"+String.valueOf(exclusiveOffer.getWeight()));
            binding.tvPrice.setText(String.valueOf(exclusiveOffer.getPrice())+" g");
        }
    }

    @Override
    public int getItemCount() {
        return offersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ExclusiveListItemBinding itemRowBinding;

        public ViewHolder(ExclusiveListItemBinding itemRowBinding) {
            super(itemRowBinding.getRoot());
            this.itemRowBinding = itemRowBinding;
        }
    }
}
