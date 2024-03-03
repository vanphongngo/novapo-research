#!/bin/bash

folder_name=$1
current_date=$(date +"%d-%m-%y")
new_folder_name="${current_date}_${folder_name}"
suffix=1

while [ -d "$new_folder_name" ]; do
  new_folder_name="${current_date}_${folder_name}_${suffix}"
  suffix=$((suffix + 1))
done

mkdir "$new_folder_name"