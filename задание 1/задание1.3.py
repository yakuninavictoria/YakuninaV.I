# -*- coding: utf-8 -*-
age = int(input())
name = input()
if age>0 and age<75 and name != "Иван":
	if age >16:
		print("Поздравляем, вы поступили в ВГУИТ")
	else:
		print("Сначала нужно окончить школу","Осталось учиться лет:", (16-age))