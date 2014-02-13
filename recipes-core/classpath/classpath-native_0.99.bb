require classpath-native.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=af0004801732bc4b20d90f351cf80510"
DEPENDS += "ecj-initial virtual/java-initial"

PR = "${INC_PR}.1"

SRC_URI += " \
            file://sun-security-getproperty.patch;striplevel=0 \
            file://ecj_java_dir.patch \
            file://autotools.patch \
            file://miscompilation.patch \
            file://toolwrapper-exithook.patch \
           "

# tools using java-initial rather than java sed it out
do_compile_append () {

	COMMANDS="gappletviewer gjarsigner gkeytool \
                  gjar gnative2ascii gserialver grmiregistry \
                  gtnameserv gorbd grmid grmic gjavah \
                 "

        for i in ${COMMANDS};
        do
                 sed -i -e "s/java-initial/java/g" tools/${i}
        done
}

SRC_URI[md5sum] = "0ae1571249172acd82488724a3b8acb4"
SRC_URI[sha256sum] = "f929297f8ae9b613a1a167e231566861893260651d913ad9b6c11933895fecc8"

