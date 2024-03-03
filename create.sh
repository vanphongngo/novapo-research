#!/bin/bash

folder_name=$1
current_date=$(date +"%d-%m-%y")
new_folder_name="${current_date}_${folder_name}"
suffix=1

while [ -d "$new_folder_name" ]; do
  new_folder_name="${current_date}_${folder_name}_${suffix}"
  suffix=$((suffix + 1))
done

datetime=$(date +"%Y-%m-%d %H:%M:%S")
echo "| $datetime created topic **$folder_name**" >> history.md
echo "" 
mkdir "$new_folder_name"