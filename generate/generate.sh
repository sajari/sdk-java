#!/usr/bin/env bash

set -eo pipefail

cd "$(dirname "$0")"

function die() {
    echo 1>&2 $*
    exit 1
}

if [ -z "$GEN_PATH" ]; then
    die "GEN_PATH must be set, e.g. /path/to/sajari/sdk-java"
fi
if [ -z "$TEMPLATES_PATH" ]; then
    die "TEMPLATES_PATH must be set, e.g. /path/to/sajari/sdk-java/generate/templates"
fi

VERSION=4.0.0

docker-entrypoint.sh generate \
  -i /openapi.json  \
  -g java \
  -o $GEN_PATH \
  -t $TEMPLATES_PATH \
  --artifact-version $VERSION \
  --http-user-agent "sajari-sdk-java-$VERSION" \
  --group-id com.sajari \
  --git-host "github.com/sajari" \
  --git-repo-id sdk-java \
  --api-package com.sajari.client.api \
  --model-package com.sajari.client.model \
  --additional-properties useGzipFeature=false \
  --additional-properties licenseUrl="http://www.opensource.org/licenses/mit-license.php" \
  --additional-properties licenseName="MIT license" \
  --additional-properties fullJavaUtil=true \
  --additional-properties dateLibrary=java8 \
  --additional-properties artifactId=sajari-sdk-java-client \
  --additional-properties artifactUrl="https://github.com/sajari/sdk-java" \
  --additional-properties artifactDescription="Sajari SDK Java Client" \
  --additional-properties scmConnection="scm:git:git@github.com:sajari/sdk-java.git" \
  --additional-properties scmDeveloperConnection="scm:git:git@github.com:sajari/sdk-java.git" \
  --additional-properties scmUrl="https://github.com/sajari/sdk-java" \
  --additional-properties developerEmail="dev@sajari.com" \
  --additional-properties developerName="Justin Koke" \
  --additional-properties developerOrganization="Sajari" \
  --additional-properties developerOrganizationUrl="https://www.sajari.com"
