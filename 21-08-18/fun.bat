FOR /L %%A in (0, 1, 1000) DO (
echo %%A > %%A.txt
git add .
git commit -m %%A
git pull 
git push
)
