#!/usr/bin/env bash
if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    openssl aes-256-cbc -K $encrypted_f1181ebdf3ca_key -iv $encrypted_f1181ebdf3ca_iv -in cd/codesign.asc.enc -out cd/codesign.asc -d
    gpg --fast-import cd/codesign.asc
fi
