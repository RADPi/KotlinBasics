package com.radpi.helloandroidstudio

// Si no se les pone el tipo de variable, quedan como privadas
class Programmer(val name: String,
                 var age: Int,
                 var languages: Array<Language>,
                 val friends: Array<Programmer>? = null
                 ) {

    enum class Language {
        KOTLIN, JAVASCRIPT, TYPESCRIPT, JAVA
    }

    fun code(){
        for(language in languages){
            println("Estoy programando en $language")
        }
    }
}