package com.yunguo.kotlindelegatedemo


//注意：这里将Code 委托给了CodePeople，所以后面CodePeople 的实例就可以调用coding方法了
//那直接实现接口也可以实现这个功能，但是，这个代码就会耦合到 CodePeople 中。
//所以委托就相当于将业务外包给第三方公司
//如果没有委托，那么这个公司的业务要么由一个部门完成（一个方法），要么由一个子公司（子类）完成，都是至上而下的。

class CodePeople (name:String):People(name),ICode by Code(name)



// 重写委托类的 coding 方法
// 很多人会说，我们这不是实现了多继承？
//但这里要注意：Code 类中的属性是无法委的，类委托只能委托接口中定义的方法。
// 还是和继承有比较大的区别的（仔细想想多继承也不可能存在）
class CodePeople2(name:String):People(name),ICode by Code(name){
    override fun coding(){
        print("$name ：写超牛批的代码！！")
    }
}
