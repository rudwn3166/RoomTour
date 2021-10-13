package com.example.roomtour.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*
//방의 데이터를 담은 룸클래스를 만들었다
//아래 Serializable는 putExtra를 위해 만듬
//Serializable는 클래스에 있는 모든 데이터를 putExtra로 이동하게 해주는 것
class RoomClass(val price : Int,
                val address:String,
                val floor:Int,
                val description:String):Serializable {


//가격을 가공해주는 함수 getFormattedPrice를 만듬
    fun getFomattedPrice() :String{

//리스트에 나와있는 가격이 10000이상이면
//    ?억 ????원으로 나오도록 if문 사용
        if (this.price>=10000){

            val uk = this.price/10000
            val rest = this.price %10000

//금액에 쉼표(,)표시를 가공해주는 numberFormat을 구글에서 검색해서 적용했다
            return "${uk}억${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
        }
//10000이하면 ????원으로 적용되게 함
        else {
            NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return "${this.price}원"

        }


    }


    fun getFomattedFloor() :String{

        if(this.floor >= 1){

            return "${this.floor}층"
        }
        else if(this.floor == 0){

            return "반지하"
        }
        else{

            return "${-this.floor}층"

        }

    }
}