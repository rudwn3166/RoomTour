package com.example.roomtour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomtour.datas.RoomClass
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

//Serializable를 사용했기 떄문에 우리가 만든 RoomClass의 정보를 모두 가져올 수 있다
//   가격따로 상세정보따로 층수 따로 putExtra로 하지 않게하기 위해 Serializable를 사용함
//   as 함수명을 하면 자료형변환이 아닌 클래스 변환을 도와준다
//   getExtra로 하면 getExtra자료형 이렇게 해야하기 때문에 우리는 roomclass를 통째로 가져와서
// getExtra자료형은 불가함 ->따라서 클래스를 통쨰로 가져오게 하는 아래 as라는 구문 과 getSerializabletra를 사용
         val roomData = intent.getSerializableExtra("room") as RoomClass

//        기존에 만들어 둔 함수도 사용가능

        priceTextView.text=roomData.getFomattedPrice()
        descriptionTextView.text=roomData.description
        addressTextview.text=roomData.address
        FloorTextview.text=roomData.getFomattedFloor()


    }
}