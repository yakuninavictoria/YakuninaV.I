# -*- coding: utf-8 -*-
n = int(input('Введите количество чисел Фибоначчи:'))
sum = 0
(x, y) = (0, 1)
for i in range(1, n):
	(x, y) = (y, x + y)
	sum+= x
print('Сумма чисел Фибоначчи:',sum)