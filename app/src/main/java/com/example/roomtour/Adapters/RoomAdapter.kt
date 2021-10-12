package com.example.roomtour.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.roomtour.R
import com.example.roomtour.datas.RoomClass

class RoomAdapter(val mContext: Context,
                  val resId:Int,
                  val mList:ArrayList<RoomClass>) : ArrayAdapter<RoomClass>(mContext, resId,mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temprow = convertView

        if(temprow == null){

            temprow=inflater.inflate(R.layout.room_list_item,null)


        }

        var row = null!!

        return row

    }
}