# -*- coding: utf-8 -*-
n=int(input())
hour= n//3600
minutes=(n-hour*3600)//60
if hour>24: hour=hour-24
print(hour,'час', minutes,'мин')
