#!/bin/bash

# Execute this script from inside the openapi folder

SPEC_FILE=lxd.yml
CONF_FILE=lxd-config.yml
GEN_DIR=generated

cd ./openapi

if [[ -d "$GEN_DIR" ]]; then
    echo "$GEN_DIR exists."
    rm -rf ./generated
    echo "$GEN_DIR deleted."
    mkdir generated
    echo "$GEN_DIR created."
    openapi-generator-cli  generate -g java -i $SPEC_FILE -c $CONF_FILE -o ./generated --additional-properties=asyncNative=true --additional-properties=library=native -t ./templates

    # Copy the updated docs
    rm -rf ../docs
    rm -rf ../docs
    mkdir ../docs

    # Copy the new sources
    #rm -rf ../relxd-lxd/*
    cp -r ./generated/* ../lxd-openapi/

    else
      echo Directory "$GEN_DIR" not found
fi

