#!/bin/bash

GEN_PATH="$(pwd)/../"
VERSION=4.0.0

openapi-generator generate \
  -i https://api-gateway.sajari.com/v4/openapi.json  \
  -g java \
  -o $GEN_PATH \
  --artifact-version $VERSION \
  --http-user-agent "sajari-sdk-java-$VERSION" \
  --group-id com.sajari \
  --git-host "github.com/sajari" \
  --git-repo-id sdk-java \
  --api-package com.sajari.client.api \
  --model-package com.sajari.client.model \
  --additional-properties useGzipFeature=true \
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



#docker-entrypoint.sh generate \
#    -i /openapi.json \
#    -g java \
#    --git-user-id sajari \
#    --git-repo-id sdk-java \
#    -t $TEMPLATES_PATH \
#    --additional-properties invokerPackage=Sajari \
#    --additional-properties artifactVersion=$VERSION \
#    -o $GEN_PATH
