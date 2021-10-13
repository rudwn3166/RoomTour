package com.example.roomtour.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.roomtour.R
import com.example.roomtour.datas.RoomClass


//리스트를 연결해줄 어댑터 클래스를 생성했다
//어레이어댑터를 <데이터클래스>상속받는 클래스이다
class RoomAdapter(val mContext: Context,
                  val resId:Int,
                  val mList:ArrayList<RoomClass>) : ArrayAdapter<RoomClass>(mContext, resId,mList) {

//    현재 화면을 inflate먼저 함 아직도 왜 인플레이트를 해야하는지 모르겠음
    val inflater = LayoutInflater.from(mContext)
//겟뷰는 우리가 커스텀한 xml에 맞춰서 적용시키기 위해서 사용함
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//현재 화면이 비워있으면 안되서 임시 row를 만들었다
        var temprow = convertView

        if(temprow == null){

            temprow=inflater.inflate(R.layout.room_list_item,null)


        }
//로우가 절대 널이 아니니 메인 액티비티에서 넣은 리스트 정보를 아래와 같이 리스트에 반영해달라
        var row = temprow!!

        val roomData = mList[position]

        val priceTextView = row.findViewById<TextView>(R.id.priceTextView)
        val addressAndFloorTextView =row.findViewById<TextView>(R.id.addressAndFloorTextView)
        val descriptionTextView = row.findViewById<TextView>(R.id.descriptionTextView)

//    만들어둔 함수 getFomattedFloor,getFomattedPrice를 아래와 같이 적용함
        addressAndFloorTextView.text="${roomData.address},${roomData.getFomattedFloor()}"
        descriptionTextView.text=roomData.description
        priceTextView.text="${roomData.getFomattedPrice()}"




        return row

    }
}