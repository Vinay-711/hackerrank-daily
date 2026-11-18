import sys

def twoRobots(m, queries):
    # dp maps the position of the idle robot (or None if it hasn't been used yet)
    # to the minimal total distance after processing the already handled queries.
    dp = {None: 0}
    prev_b = None  # destination of the robot that executed the previous query
    for i, (a, b) in enumerate(queries):
        newdp = {}
        if i == 0:
            # First query: any robot can start at a for free, only transport cost counts.
            cost = abs(a - b)
            newdp[None] = cost
        else:
            for idle_pos, cur_cost in dp.items():
                # 1) Same robot that handled the previous query does this one.
                add_same = abs(prev_b - a) + abs(a - b)
                new_idle = idle_pos
                new_cost = cur_cost + add_same
                if new_idle not in newdp or new_cost < newdp[new_idle]:
                    newdp[new_idle] = new_cost
                # 2) Switch to the idle robot.
                travel_to_a = 0 if idle_pos is None else abs(idle_pos - a)
                add_switch = travel_to_a + abs(a - b)
                new_idle2 = prev_b  # the robot that just moved becomes idle
                new_cost2 = cur_cost + add_switch
                if new_idle2 not in newdp or new_cost2 < newdp[new_idle2]:
                    newdp[new_idle2] = new_cost2
        dp = newdp
        prev_b = b
    return min(dp.values())

def solve():
    data = sys.stdin.read().strip().split()
    if not data:
        return
    it = iter(data)
    t = int(next(it))
    results = []
    for _ in range(t):
        m = int(next(it))
        n = int(next(it))
        queries = [(int(next(it)), int(next(it))) for __ in range(n)]
        results.append(str(twoRobots(m, queries)))
    sys.stdout.write('\n'.join(results))

if __name__ == "__main__":
    solve()