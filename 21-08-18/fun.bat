FOR /L %%A in (10000, 1, 11000) DO (
echo %%A >> %%A.txt
git add .
git commit -m %%A
git pull 
git push
)
