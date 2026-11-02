from pathlib import Path
import subprocess,tempfile,random
rng=random.Random(711)
cases=[[1000000001,1000000002,1000000003,1000000004,1000000005],[0],[10**10]*10,[rng.randrange(10**10+1) for _ in range(10)],[2147483647,2147483647]]
with tempfile.TemporaryDirectory() as d:
    subprocess.run(['javac','-d',d,str(Path(__file__).with_name('Solution.java'))],check=True)
    for a in cases:
        r=subprocess.run(['java','-cp',d,'Solution'],input=str(len(a))+'\n'+' '.join(map(str,a)),text=True,capture_output=True,check=True)
        assert int(r.stdout)==sum(a)
print('5 sample, zero, 64-bit overflow and deterministic random cases passed')
