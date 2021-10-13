package com.example.roomtour.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class RoomClass(val price : Int,
                val address:String,
                val floor:Int,
                val description:String):Serializable {


    fun getFomattedPrice() :String{


        if (this.price>=10000){

            val uk = this.price/10000
            val rest = this.price %10000


            return "${uk}억${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
        }

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