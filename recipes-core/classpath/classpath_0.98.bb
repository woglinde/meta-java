require classpath.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=92acc79f1f429143f4624d07b253702a"

SRC_URI += " \
            file://SimpleName.diff;striplevel=0 \
            file://ecj_java_dir.patch \
            file://autotools.patch \
            file://fix-gmp.patch \
            file://toolwrapper-exithook.patch \
           "

SRC_URI[md5sum] = "90c6571b8b0309e372faa0f9f6255ea9"
SRC_URI[sha256sum] = "501b5acd4dff79b6100da22cef15080f31071821ce3cea6f1b739bc1b56fac3f"

