# -*- coding: utf-8 -*-
second=int(input())
hour= second//3600
minutes=(second-hour*3600)//60
seconds=second%60
print(hour,'час', minutes,'мин',seconds,'сек')