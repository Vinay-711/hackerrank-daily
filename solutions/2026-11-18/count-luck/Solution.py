import sys

def countLuck(matrix, k):
    n = len(matrix)
    m = len(matrix[0])
    start = None
    for r in range(n):
        for c in range(m):
            if matrix[r][c] == 'M':
                start = (r, c)
                break
    
    def get_neighbors(r, c):
        res = []
        for dr, dc in [(0, 1), (0, -1), (1, 0), (-1, 0)]:
            nr, nc = r + dr, c + dc
            if 0 <= nr < n and 0 <= nc < m and matrix[nr][nc] != 'X':
                res.append((nr, nc))
        return res

    def dfs(curr, parent):
        r, c = curr
        if matrix[r][c] == '*':
            return 0
        
        neighbors = get_neighbors(r, c)
        if parent:
            neighbors.remove(parent)
        
        is_decision = len(neighbors) > 1
        
        for neighbor in neighbors:
            res = dfs(neighbor, curr)
            if res != -1:
                return (1 if is_decision else 0) + res
        return -1

    total_waves = dfs(start, None)
    return "Impressed" if total_waves == k else "Oops!"

if __name__ == '__main__':
    input_data = sys.stdin.read().split()
    idx = 0
    t = int(input_data[idx])
    idx += 1
    for _ in range(t):
        n = int(input_data[idx])
        m = int(input_data[idx+1])
        idx += 2
        matrix = input_data[idx:idx+n]
        idx += n
        k = int(input_data[idx])
        idx += 1
        print(countLuck(matrix, k))