#!/usr/bin/env bb

@(babashka.process/process ["ls" "-la"] {:out :inherit :err :inherit})

@(babashka.process/process ["pwd"] {:inherit true})

(babashka.tasks/shell "cat" "test.bb")
