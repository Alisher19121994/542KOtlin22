package com.example.a542kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a542kotlin22.R
import com.google.android.material.imageview.ShapeableImageView

class Adapters(var context: Context, var list: ArrayList<VedioImage>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_vedios, parent, false)
        return MyImageVedios(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val vedioImage = list[position]
        if (holder is MyImageVedios) {
            holder.image.setImageResource(vedioImage.image)
            holder.shapeableImageView.setImageResource(vedioImage.roundImage)
            holder.text.text = vedioImage.addStories
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyImageVedios(item: View) : RecyclerView.ViewHolder(item) {
        val image: ImageView = item.findViewById(R.id.image_fullscren1)
        val shapeableImageView: ShapeableImageView = item.findViewById(R.id.image_shape1)
        val text: TextView = item.findViewById(R.id.stories_id1)
    }
}