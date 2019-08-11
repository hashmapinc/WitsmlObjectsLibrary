#!/usr/bin/env bash
if [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    mvn deploy  -q -P sign,build-extras --settings cd/mvnsettings.xml
fi
