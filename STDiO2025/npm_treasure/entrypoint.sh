#!/bin/bash
set -euo pipefail

cat <<EOF > getflag.c
#include <stdio.h>
int main() {
  printf("${GZCTF_FLAG}\n");
  return 1;
}
EOF

gcc getflag.c -o /getflag -static

chown root:root /getflag

chmod 111 /getflag

rm getflag.c

export GZCTF_FLAG=""

exec su-exec node node /app/app.js