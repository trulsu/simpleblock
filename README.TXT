# Creating minecraft mods

## Commonly used gradlew commands
Build:   > gradlew build
Client:  > gradlew runClient
Server:  > gradlew runServer
Release: > gradlew ?

Inital setup: > gradlew setupDecompWorkspace

## Setup
- Install Java 1.8
- Download Forge MDK (Minecraft Development Kit)
- Make a mod folder (/mymod)
- Copy the following files to the mymod folder from the forge package:
-- gradlew
-- gradlew.bat
-- build.gradle
-- gradle/*

Edit your .bash_profile and add the following line:

  set JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"

## Setup workspace

  >cd mymod
  >gradlew setupDecompWorkspace

## Files to edit:

build.gradle - contains name and version of your mod

## Building and testing your mod

Build: >gradlew build
Test client: >gradlew runClient
Test server: >gradlew runServer

## Important files:

### Mod info file
src/main/resources/mcmod.info

 [{
  "modid": "examplemod",
  "name": "Example Mod",
  "description": "Lets you craft dirt into diamonds. This is a traditional mod that has existed for eons. It is ancient. The holy Notch created it. Jeb rainbowfied it. Dinnerbone made it upside down. Etc.",
  "version": "1.0.0.0",
  "mcversion": "1.10.2",
  "logoFile": "assets/examplemod/textures/logo.png",
  "url": "minecraftforge.net/",
  "updateJSON": "minecraftforge.net/versions.json",
  "authorList": ["Author"],
  "credits": "I'd like to thank my mother and father."
}]

