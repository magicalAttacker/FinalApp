package ml.magicalattacker.finalapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    private List<UserEntry> localDataSet;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView userinfoTitle;
        private final TextView usernameInfo;
        private final TextView passwordInfo;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            userinfoTitle = (TextView) view.findViewById(R.id.userInfoTitle);
            usernameInfo = (TextView) view.findViewById(R.id.usernameInfo);
            passwordInfo = (TextView) view.findViewById(R.id.passwordInfo);

        }

        public TextView getUserinfoTitle() {
            return userinfoTitle;
        }

        public TextView getUsernameTextView() {
            return usernameInfo;
        }

        public TextView getPasswordTextView() {
            return passwordInfo;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public MyRecyclerAdapter(List<UserEntry> dataSet) {
        localDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        String userInfoTitle = "???" + (position + 1) + "???????????????";
        String userInfo = "????????????" + localDataSet.get(position).getUsername();
        String passInfo = "????????????" + localDataSet.get(position).getPassword();
        viewHolder.getUserinfoTitle().setText(userInfoTitle);
        viewHolder.getUsernameTextView().setText(userInfo);
        viewHolder.getPasswordTextView().setText(passInfo);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
