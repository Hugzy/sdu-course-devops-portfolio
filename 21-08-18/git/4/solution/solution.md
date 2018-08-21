The git repository contains one branch `master` with two commits on it, currently there are two changes in the workspace one staged for commit and one not staged.

> remove the work in progress using git.
>>`git checkout afile.txt` to remove unstaged changes
> remove the staged change
>> git reset HEAD afile.txt
> make master go back to the commit before the bad commit
>> git reset HEAD~1
> does git track bfile.txt? Reason your answer. 
>> no because it is specificed in the .gitignore