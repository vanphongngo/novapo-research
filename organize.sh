#!/bin/bash

# Get a list of folders with the prefix "mm-dd-yy_"
folders=$(find . -maxdepth 1 -type d -name "[0-9][0-9]-[0-9][0-9]-[0-9][0-9]_*")

# Loop through each folder
for folder in $folders; do
    # Extract the month, day, and year from the folder name
    month=$(basename "$folder" | cut -d "-" -f1)
    day=$(basename "$folder" | cut -d "-" -f2)
    year=$(basename "$folder" | cut -d "-" -f3 | cut -d "_" -f1)
    prefix=$(basename "$folder" | cut -d "_" -f1)

    # Create the destination folder using the month and year
    destination_folder="${month}-${year}"

    # Check if the destination folder already exists
    if [ -d "${destination_folder}" ]; then
        original_name=$(basename "$folder" | cut -d "_" -f2)
        suffix=1
        while [ -d "${destination_folder}/${prefix}_${original_name}_${suffix}" ]; do
            suffix=$((suffix + 1))
        done
        mv "$folder" "${destination_folder}/${prefix}_${original_name}_${suffix}"
    else
        mv "$folder" "${destination_folder}/${prefix}_${day}-${month}-${year}"
    fi
done