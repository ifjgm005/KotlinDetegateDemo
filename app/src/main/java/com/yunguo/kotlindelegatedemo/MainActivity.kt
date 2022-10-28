package com.yunguo.kotlindelegatedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 实例化  CodePeople ，注意：CodePeople是委托了Code 的
        val codePeople = CodePeople("zhangsan")
        codePeople.eat()
        codePeople.sleep()

        //委托了Code 的CodePeople 可以调用coding 方法
        codePeople.coding()


        // CodePeople2 重写了委托类 Code 的coding 方法
        val codePeople2 = CodePeople2("张三")
        codePeople2.coding()


        val lz by lazy { "" }
    }


}