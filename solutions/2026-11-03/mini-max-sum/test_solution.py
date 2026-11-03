from pathlib import Path
import tempfile,subprocess
p=Path(__file__).parent
cases=[('1 2 3 4 5\n', '10 14'), ('7 7 7 7 7', '28 28'), ('1000000000 1000000000 1000000000 1000000000 1000000000', '4000000000 4000000000'), ('9 1 8 2 7', '18 26')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Solution.java')],check=True)
 for data,want in cases:
  r=subprocess.run(['java','-cp',d,'Solution'],input=data,text=True,capture_output=True,check=True,timeout=5)
  assert r.stdout.strip()==want.strip(),(data,r.stdout,want)
print(str(len(cases))+' sample and original edge checks passed')
