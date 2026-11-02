from pathlib import Path
import subprocess,tempfile
cases=[([5,6,7],[3,6,10],[1,1]),([17,28,30],[99,16,8],[2,1]),([1,1,1],[1,1,1],[0,0]),([100]*3,[1]*3,[3,0]),([1]*3,[100]*3,[0,3]),([1,2,3],[3,2,1],[1,1])]
with tempfile.TemporaryDirectory() as d:
    subprocess.run(['javac','-d',d,str(Path(__file__).with_name('Solution.java'))],check=True)
    for a,b,expected in cases:
        r=subprocess.run(['java','-cp',d,'Solution'],input=' '.join(map(str,a))+'\n'+' '.join(map(str,b)),text=True,capture_output=True,check=True)
        assert list(map(int,r.stdout.split()))==expected
print('6 sample, equal-score, ordered and reversed comparisons passed')
