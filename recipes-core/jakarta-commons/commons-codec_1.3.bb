require jakarta-commons.inc
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"

PR = "${INC_PR}.1"

DESCRIPTION = "Java library with simple encoder and decoders for various formats such as Base64 and Hexadecimal"

SRC_URI = "http://archive.apache.org/dist/commons/codec/source/${BP}-src.tar.gz \
           file://${BP}/LICENSE.txt"

S = "${WORKDIR}/${BP}"

SRC_URI[md5sum] = "af3c3acf618de6108d65fcdc92b492e1"
SRC_URI[sha256sum] = "12effcf3fea025bd34edbfec60a6216ca453fb27e781d8e5783caf75fd33d90e"
