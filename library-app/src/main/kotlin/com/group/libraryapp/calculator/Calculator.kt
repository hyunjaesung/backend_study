package com.group.libraryapp.calculator

class Calculator(var number: Int) { // data class가 되면 equals 자동 구현

    // 프라이빗으로 하고싶으면 이렇게도 가능이지만
    // 간결한 코드를 위해 public으로 하고 세터를 바로 안쓰는것으로 합의보자
//    val number:Int
//        get() = this._number
    fun add(operand: Int){
        this.number += operand
    }

    fun minus(operand: Int){
        this.number -= operand
    }

    fun multiply(operand: Int){
        this.number *= operand
    }

    fun divide(operand: Int){
        if(operand == 0){
            throw IllegalArgumentException("0으로 나눌수 없습니다")
        }
        this.number /= operand
    }
}
