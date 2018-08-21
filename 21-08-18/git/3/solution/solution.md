git rebase feature


```
C:\dev\uni\semester5\sdu-course-devops-portfolio\21-08-18\git\3\exercise>git log --oneline --graph --decorate --all
* 174eb86 (HEAD -> master) Add readme
* ef3fa36 (feature) Change greeting to uppercase
* e4713a4 Add content to greeting.txt
* eedf8a3 Add file greeting.txt
```

>Why does the commit with message "Change greeting to uppercase" change sha, when the others do not?
>>When the rebase occurs a new commit is created in succession of the commits on the masterbranch with new parents, therefore a new sha is also generated.