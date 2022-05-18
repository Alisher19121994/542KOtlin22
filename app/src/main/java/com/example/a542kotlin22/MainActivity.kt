package com.example.a542kotlin22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a542kotlin.Adapters
import com.example.a542kotlin.VedioImage

class MainActivity : AppCompatActivity() {
lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.main_recyclerview_id)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        getAdapter(data())
    }

    private fun getAdapter(list: ArrayList<VedioImage>) {
        val adaper = Adapters(this, list)
        recyclerView.adapter = adaper
    }

    private fun data(): ArrayList<VedioImage> {
        val list = ArrayList<VedioImage>()
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "Add to Story"))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "Alisher Daminov"))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "Abbos KING"))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "Add to Story"))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, " Story"))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "Add to "))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, " Story"))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "aLISHER "))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "Add to Story"))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "bIG Story"))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "Add to Story"))
        list.add(VedioImage(R.drawable.rasm, R.drawable.rasm10, "ALL COOL"))
        return list
    }
}