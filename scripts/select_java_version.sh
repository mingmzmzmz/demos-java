#!/bin/bash

# this script allows you to select the java version you
# are using on ubuntu

#clear
PS3="please select java version> "
select item in sun openjdk auto quit
do
	case $item in
		sun)
			sudo update-java-alternatives --set java-7-sun
			exit 0
			;;
		openjdk)
			sudo update-java-alternatives --set java-7-openjdk
			exit 0
			;;
		auto)
			sudo update-java-alternatives --auto
			exit 0
			;;
		quit)
			exit 0
			;;
	esac
done
