FROM php:8.2-apache

RUN apt-get update \
 && apt-get install -y --no-install-recommends \
    mariadb-server procps ca-certificates gcc \
 && rm -rf /var/lib/apt/lists/*

RUN docker-php-ext-install mysqli pdo_mysql

COPY html/ /var/www/html/
WORKDIR /var/www/html

ENV MYSQL_ROOT_PASSWORD=rootpass
ENV MYSQL_DATABASE=mydb
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=pass

COPY init.sql /docker-entrypoint-initdb.d/init.sql

COPY init.sh /init.sh
RUN chmod +x /init.sh

COPY readflag.c /tmp/readflag.c
RUN gcc /tmp/readflag.c -o /readflag && \
    chown root:root /readflag && \
    chmod 4711 /readflag && \
    rm /tmp/readflag.c

EXPOSE 80

CMD ["/init.sh"]
