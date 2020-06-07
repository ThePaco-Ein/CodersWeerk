package com.example.myapplication.model

class LanguageItem {

    var icons: Int ? =0
    var name: String? = null

    constructor(iconsChar: Int?, alphaChar: String?) {
        this.icons = iconsChar
        this.name= alphaChar
    }
}