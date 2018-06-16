package ndk.myapplication2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A custom adapter to use with the RecyclerView widget.
 */
public class CustomAdapter_Recycler extends RecyclerView.Adapter<CustomAdapter_Recycler.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_custom_adapter_recycler, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder itemViewHolder, int position) {

        //Here you can fill your row view
    }

    @Override
    public int getItemCount() {

        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
