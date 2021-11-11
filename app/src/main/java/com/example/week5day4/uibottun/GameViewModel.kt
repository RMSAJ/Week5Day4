package com.example.week5day4.uibottun

import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
private val score = 0
private   var _curruntScore: Int


init {
    _curruntScore = 0
}

 private fun _plusOne() {

 ++_curruntScore

}

 private fun _minusTwo() {
return if (_curruntScore >= 2 ) { _curruntScore -= 2}
        else _curruntScore = 0
}

 private fun _plusFour() {
 _curruntScore += 4
}

val currentScore get() = _curruntScore
val plusOne get() = _plusOne()
val minusTwo get() = _minusTwo()
val plusfore get() = _plusFour()


}