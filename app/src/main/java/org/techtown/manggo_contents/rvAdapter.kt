package org.techtown.manggo_contents

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class rvAdapter(val context : Context ,val list : MutableList<ContentModel>) : RecyclerView.Adapter<rvAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rvAdapter.ViewHolder {
        var v = LayoutInflater.from(parent?.context).inflate(R.layout.rv_item,parent,false)

        return ViewHolder(v) //1 -> 3
    }

    override fun onBindViewHolder(holder: rvAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return list.size
    }
    //3
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        //여기서 바인딩을해야 사진이들어간다
        fun bindItems(item : ContentModel){
            var rv_img = itemView.findViewById<ImageView>(R.id.rvImageArea)
            var rv_text = itemView.findViewById<TextView>(R.id.rvTextArea)
            //하나한 들어온다한다.
            rv_text.text =  item.titleText

            Glide.with(context).load(item.imageUrl).into(rv_img)
        }
    }
}