#!/bin/bash

salt-ssh '*' --roster-file=./roster -r "ls -a" -c ~/lib/salt --force-color
