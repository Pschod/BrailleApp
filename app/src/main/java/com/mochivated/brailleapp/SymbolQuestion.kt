package com.mochivated.brailleapp

import java.util.Vector

class SymbolQuestion(private val answer: Vector<Boolean>, private val question: VCharacter) {
	
	fun isCorrect(): Boolean {
		return answer == question.symbol
	}
}