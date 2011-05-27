# Maven Download Plugin

# Overview

The idea of the Maven Download Plugin is that it sometimes it happens that
you need to download any kind of files or archives from a given URL
and unpack the archives.

## License

[Apache License, Version 2.0, January 2004](http://www.apache.org/licenses/)

## Issue Tracker

[The Issue Tracker](https://github.com/khmarbaise/maven-download-plugin/issues)

## Status


## TODOs


## Usage

The first and simplest usage is to configure the Maven Download Plugin

    <plugin>
      <groupId>com.soebes.maven.plugins</groupId>
      <artifactId>maven-download-plugin</artifactId>
      <version>0.1</version>
      <configuration>
        <url>http://archive.apache.org/dist/hadoop/common/hadoop-0.21.0/hadoop-0.21.0.tar.gz</url>
        <downloadDirectory>${project.build.directory}/downloads/</downloadDirectory>
        <unpackDirecotry>${project.build.directory}/installations/</unpackDirecotry>
      </configuration>
    </plugin>



## Settings Configuration





Examples
--------
