package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Adapters.RecyclerAdapters;

import java.util.ArrayList;
import java.util.List;

public class UserList extends AppCompatActivity {
    List<NewUser> userList = new ArrayList<>();

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        recyclerView=findViewById(R.id.recycler_view);

        userList.add(new NewUser("Prabh",1,"prabh@gmial.com","hello good to see you"));
        userList.add(new NewUser("Harman",2,"harman@gmial.com","hello good to see you"));
        userList.add(new NewUser("Nav",3,"nav@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jasvir",4,"jasvir@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));
        userList.add(new NewUser("Jatin",5,"jatin@gmial.com","hello good to see you"));


        RecyclerAdapters recyclerAdapters = new RecyclerAdapters(userList, this);
        recyclerView.setAdapter(recyclerAdapters);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
    }
}