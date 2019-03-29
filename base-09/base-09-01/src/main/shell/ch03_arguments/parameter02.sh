#!/usr/bin/env bash

# arguments：-a 1 -b 2 -c 3

while getopts "a:b:c:" opt
do
    case ${opt} in
        a)
        echo "参数a的值$OPTARG"
        ;;
        b)
        echo "参数b的值$OPTARG"
        ;;
        c)
        echo "参数c的值$OPTARG"
        ;;
        ?)
        echo "未知参数"
        exit 1
        ;;
    esac
done