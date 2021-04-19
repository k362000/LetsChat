package com.example.letschat.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.letschat.R
import com.example.letschat.Supplier
import com.example.letschat.adapters.HobbiesAdapter
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity: AppCompatActivity(){

    companion object{
        val TAG: String= HobbiesActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecyclerView()

    }

    private fun setupRecyclerView() {
        val layoutManager= LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager= layoutManager

        val adapter= HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter= adapter

    }
}
