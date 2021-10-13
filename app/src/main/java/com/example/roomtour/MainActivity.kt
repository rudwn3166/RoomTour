package com.example.roomtour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.roomtour.Adapters.RoomAdapter
import com.example.roomtour.datas.RoomClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//   방에대한 정보를 가지고 있는 리스트를 메인화면에 보여주기위해 아래와 같이 작성
    val mRoomList = ArrayList<RoomClass>()
//임시 변수 mAdapter 를 생성후 만들었던 어댑터 정보를 받아서 메인화면의 임시 변수 mAdapter에 넘겨준다
    lateinit var mAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        방의 데이터를 넣어준다
        mRoomList.add( RoomClass( 7500, "서울시 동대문구", 8, "동대문구의 8층 7500만원 방 입니다." ) )
        mRoomList.add( RoomClass( 24500, "서울시 서대문구", 0, "서대문구의 반지하 2억 4500만원 방 입니다." ) )
        mRoomList.add( RoomClass( 8500, "서울시 동작구", 0, " 동작구의 반지하 8500만원 방 입니다." ) )
        mRoomList.add( RoomClass( 4500, "서울시 은평구", -2, " 은평구의 지하 2층 4500만원 방 입니다." ) )
        mRoomList.add( RoomClass( 182500, "서울시 중랑구", 5, "중랑구의 5층 1억 18억 2500만원 방 입니다." ) )
        mRoomList.add( RoomClass( 235000, "서울시 도봉구", 7, "도봉구의 7층 1억 23억 5000만원 방 입니다." ) )
        mRoomList.add( RoomClass( 24000, "서울시 강남구", 19, "강남구의 19층 2억 4000만원 방 입니다." ) )
        mRoomList.add( RoomClass( 3700, "서울시 서초구", -1, "서초구의 지하 1층 3700만원 방 입니다." ) )
//어댑터를 메인 어댑터에 연결해줌
        mAdapter =RoomAdapter(this,R.layout.room_list_item,mRoomList)
        main_list.adapter =mAdapter

//        리스트뷰에서 아이템을 눌렀을때 이벤트 처리 작업
        main_list.setOnItemClickListener { adapterView, view, position, id ->

//            어떤 리스트 항목이 눌렸는지 확인 해줌
            val clicked =mRoomList[position]

//            인텐트를 사용해서 메인의 리스트 항목을 누르면 이동하는 Intent작업 및 정보도 같이 가져가도록함
//            인텐트 사용시 액티비티는 대소문자 구별해서 적어주자 파일명 그대로 적용됨
            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)

//            putExtra를 사용하고 clicked라는 리스트 항목 전체의 정보를 가져갈 수 있도록 함
            myIntent.putExtra("room",clicked)


            startActivity(myIntent)




        }


    }
}