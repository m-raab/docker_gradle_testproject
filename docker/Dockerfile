FROM ubuntu:20.04 as BUILD

RUN mkdir -p /intershop-prj &&\
    adduser intershop && \
    chown -R intershop /intershop-prj

FROM ubuntu:20.04

COPY --from=BUILD --chown=intershop:intershop /intershop-prj/ /intershop/
USER intershop

# assign customization's name to env-variable CUSTOMIZATION_NAME (used by icm-as-customization-base)
ENV CUSTOMIZATION_NAME=TEST