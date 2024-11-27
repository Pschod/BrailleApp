package com.mochivated.brailleapp

class CharacterQuestion(private val answer: Char, private val question: VCharacter) {
	
	fun isCorrect(): Boolean {
		return answer == question.character
	}
}