# -*- coding: utf-8 -*-
N=int(input())
Um = 1
sum=0
for i in range(1,N+1):
	Um*=i
	sum+=Um
print(sum)