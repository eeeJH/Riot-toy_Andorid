package com.toy.riotapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val postList : ArrayList<MatchResult>, val context : Context)
    : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return RecyclerAdapter.ViewHolder(
            LayoutInflater.from(context)
            .inflate(R.layout.list_user_recent_result,parent ,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(postList[position],context)
    }

    override fun getItemCount(): Int {
        return postList.count()
    }

    class ViewHolder (itemView: View? ) : RecyclerView.ViewHolder(itemView!!){

        val photo = itemView?.findViewById<ImageView>(R.id.img_user_champion)
//        val title = itemView?.findViewById<TextView>(R.id.text_Title)
//        val size  = itemView?.findViewById<TextView>(R.id.text_size)
//        val url =   itemView?.findViewById<TextView>(R.id.text_url)
//        val date =  itemView?.findViewById<TextView>(R.id.text_date)

        fun bind(item : MatchResult? , context: Context){

         // Data Binding

        }

    }
}