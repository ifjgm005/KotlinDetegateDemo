package com.yunguo.kotlindelegatedemo

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

object User {

    // 属性委托：将某个属性的get、set 逻辑委托给一个类
    // 若属性为var （可修改），则委托类需要继承接口类 ReadWriteProperty<User, String>，两个接口 getValue 和 setValue
    //若属性为val（不可修改），则委托类只需继承接口类 ReadOnlyProperty ，只有一个接口  getValue
    //详细接口内容可点击源码查看
    var userToken:String by TokenProperty()
}

//
//
class TokenProperty : ReadWriteProperty<User, String> {


    //
    override fun getValue(thisRef: User, property: KProperty<*>): String {
        val token = loadToken()
        return token
    }


    //
    override fun setValue(thisRef: User, property: KProperty<*>, value: String) {
        saveToken(value)
    }

    private fun saveToken(value: String) {
        print("保存token：$value")
    }

    private fun loadToken(): String {
        return "我是从服务端下载的token"
    }

}