#! /bin/bash

# store args in var
option=$1

# execute one option
case $option in

  "dev")
    echo "Starting containers"
    docker compose up --build -d
    ;;

  "stop")
    echo "Stoping containers"
    docker compose down
    ;;

  *)
    echo "Option not recognized"
    echo "Please select one of the following options:"
    echo "  dev"
    echo "  stop"
    ;;
esac