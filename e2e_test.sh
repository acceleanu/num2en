#!/bin/bash

function assertEquals {
	local actual="$1"
	local expected="$2"

	if [ "$actual" == "$expected" ]; then
		echo "[OK]"
	else
		echo "[Error] expected='$expected' but actual='$actual'"
	fi	
}

assertEquals "$(./num2en)" 		"Usage: num2en <number>"
assertEquals "$(./num2en 0)" 	"zero"
assertEquals "$(./num2en 1)" 	"one"
assertEquals "$(./num2en 777)" 	"seven hundred seventy-seven"


