#!/bin/bash

DIR=$(dirname $0)
CMD="$DIR/gtfs.sh"
CLASS="de.topobyte.Test"

exec "$CMD" "$CLASS" "$@"
