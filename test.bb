#!/usr/bin/env bb

@(babashka.process/process ["ls" "-la"] {:out :inherit :err :inherit})
