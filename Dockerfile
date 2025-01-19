# Base Image
FROM 378653672129.dkr.ecr.us-east-1.amazonaws.com/op-mx-dev-openarch-docker-java21:latest

# Environment Variables
ENV JOB_JAVA_OPTS=""
ENV JOB_PROFILE_ACTIVE=undefined
ENV JOB_SECRET_NAME=undefined
ENV JOB_CLOUD_CONFIG_URI=undefined

# Volumes
VOLUME /tmp

# Workspace Setup
RUN rm -rf /workspace
RUN mkdir /workspace

# App Setup
RUN mkdir /workspace/app
WORKDIR /workspace/app
COPY ./target/some-unexistant-target*[SNAPSHOT|RELEASE].jar app.jar
RUN sh -c "touch app.jar"
ENTRYPOINT exec java $JOB_JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=$JOB_PROFILE_ACTIVE -Dcustom.secret.name=$JOB_SECRET_NAME -Dcustom.cloud.config.uri=$JOB_CLOUD_CONFIG_URI -jar app.jar
