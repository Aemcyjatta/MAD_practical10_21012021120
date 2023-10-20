package com.example.mad_practical10_21012021120

import java.io.Serializable

class Person(var id:String,
    var name : String,
    var emailId : String,
    var phoneNo : String,
    var address : String,
    var latitude : Double,
    var longitude : Double):Serializable {
}