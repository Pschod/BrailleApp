package com.mochivated.brailleapp

/* Template
	VCharacter('', arrayOf(
		arrayOf(false, false,
				false, false,
				false, false))),
 */

val characterLists: Array<Array<VCharacter>> = arrayOf(
	arrayOf(
	//Letters
	VCharacter('a', arrayOf(
		arrayOf(true, false,
			false, false,
			false, false))),
	VCharacter('b', arrayOf(
		arrayOf(true, false,
			true, false,
			false, false))),
	VCharacter('c', arrayOf(
		arrayOf(true, true,
			false, false,
			false, false))),
	VCharacter('d', arrayOf(
		arrayOf(true, true,
			false, true,
			false, false))),
	VCharacter('e', arrayOf(
		arrayOf(true, false,
			false, true,
			false, false))),
	VCharacter('f', arrayOf(
		arrayOf(true, true,
			true, false,
			false, false))),
	VCharacter('g', arrayOf(
		arrayOf(true, true,
			true, true,
			false, false))),
	VCharacter('h', arrayOf(
		arrayOf(true, false,
			true, true,
			false, false))),
	VCharacter('i', arrayOf(
		arrayOf(false, true,
			true, false,
			false, false))),
	VCharacter('j', arrayOf(
		arrayOf(false, true,
			true, true,
			false, false))),
	VCharacter('k', arrayOf(
		arrayOf(true, false,
			false, false,
			true, false))),
	VCharacter('l', arrayOf(
		arrayOf(true, false,
			true, false,
			true, false))),
	VCharacter('m', arrayOf(
		arrayOf(true, true,
			false, false,
			true, false))),
	VCharacter('n', arrayOf(
		arrayOf(true, true,
			false, true,
			true, false))),
	VCharacter('o', arrayOf(
		arrayOf(true, false,
			false, true,
			true, false))),
	VCharacter('p', arrayOf(
		arrayOf(true, true,
			true, false,
			true, false))),
	VCharacter('q', arrayOf(
		arrayOf(true, true,
			true, true,
			true, false))),
	VCharacter('r', arrayOf(
		arrayOf(true, false,
			true, true,
			true, false))),
	VCharacter('s', arrayOf(
		arrayOf(false, true,
			true, false,
			true, false))),
	VCharacter('t', arrayOf(
		arrayOf(false, true,
			true, true,
			true, false))),
	VCharacter('u', arrayOf(
		arrayOf(true, false,
			false, false,
			true, true))),
	VCharacter('v', arrayOf(
		arrayOf(true, false,
			true, false,
			true, true))),
	VCharacter('w', arrayOf(
		arrayOf(false, true,
			true, true,
			false, true))),
	VCharacter('x', arrayOf(
		arrayOf(true, true,
			false, false,
			true, true))),
	VCharacter('y', arrayOf(
		arrayOf(true, true,
			false, true,
			true, true))),
	VCharacter('z', arrayOf(
		arrayOf(true, false,
			false, true,
			true, true)))
	), arrayOf(
	
	//Numbers
	VCharacter('1', arrayOf(
		arrayOf(true, false,
			false, false,
			false, false))),
	VCharacter('2', arrayOf(
		arrayOf(true, false,
			true, false,
			false, false))),
	VCharacter('3', arrayOf(
		arrayOf(true, true,
			false, false,
			false, false))),
	VCharacter('4', arrayOf(
		arrayOf(true, true,
			false, true,
			false, false))),
	VCharacter('5', arrayOf(
		arrayOf(true, false,
			false, true,
			false, false))),
	VCharacter('6', arrayOf(
		arrayOf(true, true,
			true, false,
			false, false))),
	VCharacter('7', arrayOf(
		arrayOf(true, true,
			true, true,
			false, false))),
	VCharacter('8', arrayOf(
		arrayOf(true, false,
			true, true,
			false, false))),
	VCharacter('9', arrayOf(
		arrayOf(false, true,
			true, false,
			false, false))),
	VCharacter('0', arrayOf(
		arrayOf(false, true,
			true, true,
			false, false))),
	), arrayOf(
	
	//Punctuation Signs
		VCharacter('\'', arrayOf( //apostrophe
			arrayOf(false, false,
				false, false,
				true, false)
		)),
		VCharacter('*', arrayOf(
			arrayOf(false, false,
				false, true,
				false, false),
			arrayOf(false, false,
				false, true,
				true, false)
		)),
		VCharacter('[', arrayOf(
			arrayOf(false, true,
				false, false,
				false, true),
			arrayOf(true, false,
				true, false,
				false, true)
		)),
		VCharacter(']', arrayOf(
			arrayOf(false, true,
				false, false,
				false, true),
			arrayOf(false, true,
				false, true,
				true, false)
		)),
		VCharacter(':', arrayOf(
			arrayOf(false, false,
				true, true,
				false, false)
		)),
		VCharacter(',', arrayOf(
			arrayOf(false, false,
				true, false,
				false, false)
		)),
		VCharacter('-', arrayOf( // en dash
			arrayOf(false, false,
				false, false,
				false, true),
			arrayOf(false, false,
				false, false,
				true, true)
		)),
		VCharacter('!', arrayOf(
			arrayOf(false, false,
				true, true,
				true, false)
		)),
		VCharacter('#', arrayOf(
			arrayOf(false, true,
				false, true,
				true, true)
		)),
		VCharacter('(', arrayOf(
			arrayOf(false, false,
				false, true,
				false, false),
			arrayOf(true, false,
				true, false,
				false, true)
		)),
		VCharacter(')', arrayOf(
			arrayOf(false, false,
				false, true,
				false, false),
			arrayOf(false, true,
				false, true,
				true, false)
		)),
		VCharacter('.', arrayOf( //period
			arrayOf(false, false,
				true, true,
				false, true)
		)),
		VCharacter('?', arrayOf(
			arrayOf(false, false,
				true, false,
				true, true)
		)),
		VCharacter(';', arrayOf(
			arrayOf(false, false,
				true, false,
				true, false)
		)),
		VCharacter('/', arrayOf(
			arrayOf(false, true,
				false, true,
				false, true),
			arrayOf(false, true,
				false, false,
				true, false)
		))
	), arrayOf(
	
	//Composition Signs
		VCharacter('A', arrayOf( // Capital letter
			arrayOf(false, false,
				false, false,
				false, true))),
		VCharacter('B', arrayOf(
			arrayOf(false, false,
				false, false,
				false, true),
			arrayOf(false, false,
				false, false,
				false, true)))
	)
)