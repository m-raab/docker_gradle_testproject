ARG BASE_IMAGE
FROM ubuntu:20.04 as BUILD

RUN mkdir -p /intershop-prj


RUN mkdir -p /intershop-prj

FROM $BASE_IMAGE
ARG NAME

COPY --from=BUILD --chown=intershop:intershop /intershop-prj/ /intershop/
USER intershop

# assign customization's name to env-variable CUSTOMIZATION_NAME (used by icm-as-customization-base)
ENV CUSTOMIZATION_NAME=TEST