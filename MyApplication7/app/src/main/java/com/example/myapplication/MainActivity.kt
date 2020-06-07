package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.myapplication.adapters.LanguageAdapters
import com.example.myapplication.model.LanguageItem

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var arrayList:ArrayList<LanguageItem> ? = null
    private var gridView: GridView ? = null
    private var languageAdapters:LanguageAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.my_grid_view_list)
        arrayList = ArrayList()
        arrayList = setDataInList()
        languageAdapters = LanguageAdapters(applicationContext,arrayList!!)
        gridView?.adapter = languageAdapters
        gridView?.onItemClickListener = this

    }

    private fun setDataInList(): ArrayList<LanguageItem>{

        var arrayList: ArrayList<LanguageItem> = ArrayList()

        arrayList.add(LanguageItem(R.drawable.bus_station,"Bus Station"))
        arrayList.add(LanguageItem(R.drawable.cookies,"Cookies"))
        arrayList.add(LanguageItem(R.drawable.landscape,"Landscape"))
        arrayList.add(LanguageItem(R.drawable.outside,"Outside"))
        arrayList.add(LanguageItem(R.drawable.sunset,"Sunset"))
        arrayList.add(LanguageItem(R.drawable.the_sun,"The_Sun"))
        return arrayList

    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        var items:LanguageItem = arrayList!!.get(position)
        Toast.makeText(applicationContext, items.name, Toast.LENGTH_LONG).show()
    }
}