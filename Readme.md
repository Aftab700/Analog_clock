Hello there...

site link: ***https://aftab700.github.io/Analog_clock/***

---

## create a new repository on the command line

```bash
echo "# rough" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Manoj-Mukund/rough.git
git push -u origin main
```

## push an existing repository from the command line

```bash
git remote add origin https://github.com/Manoj-Mukund/rough.git
git branch -M main
git push -u origin main
```

## delete all commit history in github

```bash
git checkout --orphan latest_branch
git add -A
git commit -am "commit message"
git branch -D main
git branch -m main
git push -f origin main
```

---

```bash
# Check out to a temporary branch:
git checkout --orphan TEMP_BRANCH

# Add all the files:
git add -A

# Commit the changes:
git commit -am "Initial commit"

# Delete the old branch:
git branch -D master

# Rename the temporary branch to master:
git branch -m master

# Finally, force update to our repository:
git push -f origin master
```


### merge history
```bash
git checkout --orphan latest_branch
git pull origin main
git merge master --allow-unrelated-histories
git branch -m main
git push -f origin main
```

### Rename branch from master to main
```bash
git branch -m master main
git fetch origin
git branch -u origin/main main
git remote set-head origin -a
```
