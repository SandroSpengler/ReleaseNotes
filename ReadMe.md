<div align='center'>
  <a href='https://releasenote.axfert.com/swagger-ui/index.html#'>
    <img src='https://img.shields.io/badge/Docs-Swagger-green?logo=swagger'>
  </a>
</div>

# **Release Notes**

This project is a Java Spring-Boot Backend.
The main purpose of this backend is to store information about releases.

## Table of Contents

- [Getting started](#Getting-started)
    - [Installation](#Installation)
    - [Docker](#Docker-Image)
    - [Environment variables](#Environment-variables)
        - [Required](#Required-Environment-Variables)
    - [Running the Backend](#Running-the-Backend)
        - [Postgres](#MongoDB)
- [Documentation](#Documentation)
    - [Swagger](#Swagger)

## Getting started

### Installation

In order to run the Backend locally on your machine you need to clone the repository. To accomplish this use
the following command:

`git clone https://github.com/SandroSpengler/ReleaseNotes.git`

### Docker-Image

An up to date and publicly available Docker-Image is stored
on [Dockerhub](https://hub.docker.com/r/sandrospengler/release_notes/tags).

`docker pull sandrospengler/sandrospengler:<VersionTag>`

**Don't forget to replace \<VersionTag> with the latest version!**

### Environment variables

In order to run the Backend a few environment variables are required:

#### Required Environment Variables

- **postgres_username**
  The username of your PostgresDB
- **postgres_password**
  The password of your PostgresDB

They are loaded via the resources/application-dev.yaml file.

### Running the Backend

#### Postgres

The backend requires a PostgresDB in order to read and write data.
After you've created your DB you can use the SQL-Scripts und ./sql to generate and insert initial Data.

The backend uses the maven packages [postgresql](https://mvnrepository.com/artifact/org.postgresql/postgresql)
and [spring-boot-starter-data-jpa](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
to establish the DB Connection and perform CRUD-Operations.

## Documentation

### Swagger

The Backend provides an automatically generated swagger file, which includes all possible endpoints. You can view
the [swagger file here](https://releasenote.axfert.com/swagger-ui/index.html#).

You can find more information about Swagger and Open-API on
their [website](https://swagger.io/docs/specification/2-0/what-is-swagger/).
