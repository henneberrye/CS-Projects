package eugenehenneberry.cs.lewisu.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import eugenehenneberry.cs.lewisu.finalproject1.R;

public class PasswordAdapter extends FirebaseRecyclerAdapter<Password, PasswordAdapter.PassHolder> {

    private final PasswordAdapterOnClickHandler onClickHandler;

    public interface PasswordAdapterOnClickHandler{
        void onClick(int passCategory);
    }

    public PasswordAdapter(@NonNull FirebaseRecyclerOptions<Password> options, PasswordAdapterOnClickHandler onClickHandler){
        super(options);
        this.onClickHandler = onClickHandler;
    }

    @Override
    protected void onBindViewHolder(@NonNull PasswordAdapter.PassHolder holder, int position, @NonNull Password model) {
        holder.passwordListView.setText(model.getPassName());

    }

    @NonNull
    @Override
    public PasswordAdapter.PassHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater newInflater = LayoutInflater.from(context);
        View view = newInflater.inflate(R.layout.list_item, parent, false);
        return new PassHolder(view);
    }

    class PassHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private final TextView passwordListView;

        public PassHolder( View itemView) {
            super(itemView);
            passwordListView = itemView.findViewById(R.id.password_list_view);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int adapterPosition = getAdapterPosition();
            onClickHandler.onClick(adapterPosition);

        }
    }
}
