from pathlib import Path
import subprocess,tempfile,random
rng=random.Random(711)
cases=[[1,2,3,4,10,11],[1],[1000]*1000,[rng.randint(1,1000) for _ in range(57)]]
with tempfile.TemporaryDirectory() as d:
    subprocess.run(['javac','-d',d,str(Path(__file__).with_name('Solution.java'))],check=True)
    for a in cases:
        r=subprocess.run(['java','-cp',d,'Solution'],input=str(len(a))+'\n'+' '.join(map(str,a)),text=True,capture_output=True,check=True)
        assert int(r.stdout)==sum(a)
print('4 sample, single-item, maximum-size and deterministic random cases passed')
