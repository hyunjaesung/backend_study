package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest();
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
}


class CalculatorTest {
    fun addTest() {
        // given when then 패턴으로 작성
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        if(calculator.number != 8){ // number가 public이면 이렇게
            throw IllegalStateException();
        }
    }

    fun minusTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(3)

        // then
        if(calculator.number != 2){
            throw IllegalStateException();
        }
    }
    fun multiplyTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        if(calculator.number != 15){
            throw IllegalStateException();
        }
    }

}
