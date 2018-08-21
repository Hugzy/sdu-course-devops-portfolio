git checkout new-feature
git merge master
**fix mergeconflict**
git add .
git commit -m "fix mergeconflict when adding feature from master"
git checkout master
git reset --hard HEAD~1


```
* 879a4bd (HEAD -> new-feature) forgot to save file ups...
*   1f02485 fix mergeconflict
|\
| * 881fa75 Implement second part of feature
| * 1784228 (master) Fix bug
* | 5069fd8 Implement first part of feature
|/
* 348d860 Initial commit
```