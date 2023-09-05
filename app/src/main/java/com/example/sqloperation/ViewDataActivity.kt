package com.example.sqloperation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ViewDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_data)

        val db = DataBaseHelper(this, null)
        var listofData: ArrayList<ViewDataModel> = db.listOfUserInfo()
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager= GridLayoutManager(this,1)
        val recyclerAdapter=ViewRecyclerViewAdapter(this,listofData,this)
        recyclerView.adapter=recyclerAdapter
    }
}