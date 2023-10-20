package com.example.mad_practical10_21012021120

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import java.io.Serializable

class PersonAdapter(context:Context,val array: ArrayList <Person>):ArrayAdapter<Person>(context,0,array){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false)
        return view


    }
}