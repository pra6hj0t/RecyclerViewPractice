package com.example.recyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.NewUser;
import com.example.recyclerview.R;

import java.util.List;

public class RecyclerAdapters extends RecyclerView.Adapter<RecyclerAdapters.UserViewHolder> {

    List<NewUser> userList;
    Context context;

    public RecyclerAdapters(List<NewUser> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       //xml view to java object
        View view = LayoutInflater.from(context).inflate(R.layout.single_user, parent, false);

        UserViewHolder userViewHolder = new UserViewHolder(view);

        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        NewUser user = userList.get(position);
        holder.nameView.setText(user.getName());
        holder.emailView.setText(user.getEmail());
        holder.aboutView.setText(user.getAbout());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{
     TextView nameView,emailView,aboutView;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            nameView=itemView.findViewById(R.id.name);
            emailView=itemView.findViewById(R.id.email);
            aboutView=itemView.findViewById(R.id.about);

        }
    }

}
