# Dockerfile
FROM php:5.5-apache

RUN docker-php-ext-install pdo_mysql
RUN a2enmod rewrite

COPY . /var/www
COPY ./public /var/www/html

RUN cd /var/www && chown 777 ./
