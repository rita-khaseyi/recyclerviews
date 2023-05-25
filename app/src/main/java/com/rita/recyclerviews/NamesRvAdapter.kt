import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rita.recyclerviews.R

class NamesRvAdapter(var fibonacciList: List<Long>) : Adapter<NamesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.name_list_item, parent, false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val fibonacciNumber = fibonacciList[position]
        holder.tvName.text = fibonacciNumber.toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
}

class NamesViewHolder(itemView: View) : ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
}




//package com.rita.recyclerviews
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView.Adapter
//import androidx.recyclerview.widget.RecyclerView.ViewHolder
//
//
//class NamesRvAdapter(var namesList: List<String>):Adapter<NamesViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
//        val itemView=
//            LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
//        return NamesViewHolder(itemView)
//    }
//
//    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
//        val currentName=namesList.get(position)
//        holder.tvName.text=currentName
//
//    }
//
//    override fun getItemCount(): Int {
//        return namesList.size
//
//
//    }
//}
//class NamesViewHolder(itemView: View):ViewHolder(itemView){
//    var tvName=itemView.findViewById<TextView>(R.id.tvName)
//
//}