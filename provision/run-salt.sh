#!/bin/bash

salt-ssh '*' --roster-file=./roster -r "sudo apt-get install python-apt" -c ~/lib/salt --force-color

salt-ssh app state.apply javasetup --roster-file=./roster -c ~/lib/salt --force-color 
