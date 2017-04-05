#!/bin/bash
# automate push to github
# by jakob vendegna
git status

# Add
echo "Add? y/n: "
read userInput
if [[ $userInput = y ]]; then
  git add *
  git status
fi

# Remove
echo "Remove? y/n"
read userInput
if [[ $userInput = "y" ]]; then
  git remove *
  git status
fi

# Commit
echo "Commit? y/n"
read userInput
if [[ $userInput = "y"  ]]; then
  echo "Message?"
  read message
  echo "git commit -m \"$message\" (-echo)"
  git commit -m "\"$message\""
  git status
fi

# Push
echo "Push? y/n"
read userInput
if [[ $userInput = y ]]; then
  echo "git push origin master (-echo)"
  git push origin master
fi

git status

# end of file
