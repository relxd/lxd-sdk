#!/bin/bash

# Execute this script from inside the openapi folder

SPEC_FILE=lxd.yml
CONF_FILE=lxd.yml
GEN_DIR=generated

cd ./openapi || exit

#if [[ -f "$CONF_FILE" ]]; then
#  echo "$CONF_FILE deleted."
#  rm $CONF_FILE
#fi
#wget https://linuxcontainers.org/lxd/docs/latest/rest-api.yaml
#mv rest-api.yaml lxd.yaml
#echo "$CONF_FILE downloaded."

if [[ -d "$GEN_DIR" ]]; then
  echo "$GEN_DIR exists."
  rm -rf ./$GEN_DIR
  echo "$GEN_DIR deleted."
  mkdir $GEN_DIR
  echo "$GEN_DIR created."
else
  echo Directory "$GEN_DIR" not found
  mkdir $GEN_DIR
fi

openapi-generator-cli  generate -g java -i $SPEC_FILE -c $CONF_FILE -o ./generated --additional-properties=asyncNative=true --additional-properties=library=native -t ./templates

# Copy the updated docs
rm -rf ../docs
rm -rf ../docs
mkdir ../docs

# Copy the new sources
#rm -rf ../relxd-lxd/*
cp -r ./generated/* ../lxd-openapi/