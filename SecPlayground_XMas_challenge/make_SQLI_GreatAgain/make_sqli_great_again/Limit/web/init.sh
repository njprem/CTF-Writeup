#!/usr/bin/env bash
set -e

# Runtime setup: write dynamic flag from $RANDOM_SECRET
echo "$RANDOM_SECRET" > /root/flag.txt
chmod 100 /root/flag.txt
chown root:root /root/flag.txt

# Start MariaDB and initialize database once
service mariadb start --secure-file-priv=/var/www/html
sleep 5
if [ ! -f /var/lib/mysql/.db_initialized ]; then
    mariadb < /docker-entrypoint-initdb.d/init.sql
    touch /var/lib/mysql/.db_initialized
fi

# Start Apache (foreground)
exec apache2-foreground

