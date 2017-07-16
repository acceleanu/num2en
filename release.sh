#!/bin/bash

git clean -fdx

PROJECT_NAME="${PWD##*/}"

echo $PROJECT_NAME

DATE=$(date +%Y%m%d_%H%M%S)
PKG_NAME="${PROJECT_NAME}-${DATE}"

cd ..

tar -zcvf "$PKG_NAME.tgz" "$PROJECT_NAME"

cd - > /dev/null

