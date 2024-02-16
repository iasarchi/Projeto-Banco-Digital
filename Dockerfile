FROM ubuntu:latest
LABEL authors="iamsim"

ENTRYPOINT ["top", "-b"]