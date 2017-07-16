#!/bin/bash

function assertErrorCode {
	local actual=$1
	local expected=$2

	if [ "$actual" == "$expected" ]; then
		echo -e "\t[ERR_CODE_OK]"
	else
		echo -e "\t[ERR_CODE_FAILURE] expected=$expected actual=$actual"
	fi
}

function assertEquals {
	local cmd="$1"
	local expected_err_code="$2"
	local expected_result="$3"
	
	echo "Testing $cmd"
	actual_result=$($cmd)
	actual_err_code=$?

	if [ "$actual_result" == "$expected_result" ]; then
		echo "[OK]"
	else
		echo "[Error] expected='$expected_result' but actual='$actual_result'"
	fi	
	assertErrorCode "$actual_err_code" "$expected_err_code"
	echo "------------"
}

assertEquals "./num2en" 		1	"Usage: num2en <number>"
assertEquals "./num2en 0" 		0 	"zero"
assertEquals "./num2en 1" 		0	"one"
assertEquals "./num2en 777" 	0	"seven hundred and seventy-seven"
assertEquals "./num2en 1001" 	1 	"Number 1001 is not in [1..1000]"
assertEquals "./num2en -1" 		1 	"Number -1 is not in [1..1000]"
assertEquals "./num2en invalid" 1 	"Not a number: 'invalid'"


