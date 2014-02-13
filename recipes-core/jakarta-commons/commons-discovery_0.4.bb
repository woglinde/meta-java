require jakarta-commons.inc
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

PR = "${INC_PR}.1"

DESCRIPTION = "discovering, or finding, implementations for pluggable interfaces"

SRC_URI = "http://archive.apache.org/dist/commons/discovery/source/${BP}-src.tar.gz"

DEPENDS += "commons-logging"
RDEPENDS_${PN} = "libcommons-logging-java"

CP = "commons-logging"

SRC_URI[md5sum] = "1275ad4c6ce54b9323269e30dc42dd0e"
SRC_URI[sha256sum] = "596242302be4f0502073f5a934c608289bba6221591e7dbea53ce629f67498a3"
