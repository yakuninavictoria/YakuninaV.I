
# -*- coding: utf-8 -*-
a=int(input('расстояние между рядами'))
b=int(input('расстояние между дырочками в ряду'))
l=int(input('длина свободного конца шнурка'))
n=int(input('количество дырочек в каждом ряду'))
def add(a ,b ,l ,n):
	return(2*l+2*(n-1)*a+2*(n-1)*b)
print(add(a ,b ,l ,n))
