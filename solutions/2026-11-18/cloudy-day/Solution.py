#!/bin/python3

import math
import os
import random
import re
import sys
import bisect

def maximumPeople(p, x, y, r):
    n = len(p)
    m = len(y)
    
    towns = sorted(zip(x, p, range(n)))
    sx = [t[0] for t in towns]
    sp = [t[1] for t in towns]
    
    total_pop = sum(p)
    
    clouds = []
    for i in range(m):
        clouds.append((y[i] - r[i], y[i] + r[i]))
        
    cloud_unique_pop = [0] * m
    covered_count = [0] * n
    no_cloud_pop = 0
    
    events = []
    for i in range(m):
        c_start, c_end = clouds[i]
        idx_start = bisect.bisect_left(sx, c_start)
        idx_end = bisect.bisect_right(sx, c_end) - 1
        if idx_start <= idx_end:
            events.append((idx_start, i, 1))
            events.append((idx_end + 1, i, -1))
            
    active_clouds = set()
    event_dict = {}
    for idx, c_idx, val in events:
        if idx not in event_dict:
            event_dict[idx] = []
        event_dict[idx].append((c_idx, val))
        
    curr_active = set()
    for i in range(n):
        if i in event_dict:
            for c_idx, val in event_dict[i]:
                if val == 1:
                    curr_active.add(c_idx)
                else:
                    curr_active.remove(c_idx)
                    
        covered_count[i] = len(curr_active)
        if len(curr_active) == 0:
            no_cloud_pop += sp[i]
        elif len(curr_active) == 1:
            c_idx = list(curr_active)[0]
            cloud_unique_pop[c_idx] += sp[i]
            
    max_sunny = no_cloud_pop
    if m > 0:
        max_sunny += max(cloud_unique_pop)
    else:
        max_sunny = total_pop
        
    return max_sunny

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    p = list(map(int, input().rstrip().split()))

    x = list(map(int, input().rstrip().split()))

    m = int(input().strip())

    y = list(map(int, input().rstrip().split()))

    r = list(map(int, input().rstrip().split()))

    result = maximumPeople(p, x, y, r)

    fptr.write(str(result) + '\n')

    fptr.close()