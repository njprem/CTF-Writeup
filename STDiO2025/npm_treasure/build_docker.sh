#!/bin/bash

docker build --platform linux/amd64 -t npm_treasure .

docker run -d --rm -p 1337:1337 \
  --shm-size=256m \
  --name npm_treasure \
  npm_treasure