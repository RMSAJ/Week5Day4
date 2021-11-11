package com.example.week5day4.uibottun

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
private val score = 0
private   val _curruntScore = MutableLiveData <Int> (0)




 private fun _plusOne() {

 _curruntScore.value = _curruntScore.value?.plus(1)

}

 private fun _minusTwo() {
     return if (_curruntScore.value!! >= 2) {
         _curruntScore.value = _curruntScore.value!!.minus(2)
     } else _curruntScore.value = 0
 }

 private fun _plusFour() {
     _curruntScore.value = _curruntScore.value?.plus(4)
}

val currentScore: LiveData<Int> get() = _curruntScore
val plusOne get() = _plusOne()
val minusTwo get() = _minusTwo()
val plusfore get() = _plusFour()


}