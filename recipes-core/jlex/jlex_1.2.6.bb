DESCRIPTION = "Lexical analyzer generator for Java"
AUTHOR = "Elliot Berk, A. Appel, C. Scott Ananian"
LICENSE = "JLEX"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
                   "

RDEPENDS_${PN} = "java2-runtime"
RDEPENDS_${PN}_virtclass-native = ""

inherit java-library

SRC_URI = "http://www.cs.princeton.edu/~appel/modern/java/JLex/Archive/${PV}/Main.java \
           file://jlex \
          "

S = "${WORKDIR}"

do_configure() {
  sed -i \
    -e "s|OE_STAGING_BINDIR|${bindir}|" \
    -e "s|OE_STAGING_DATADIR_JAVA|${datadir_java}|" \
    -e "s|OE_JLEX_JAR|${BP}.jar|" \
    ${WORKDIR}/jlex
}

do_compile() {
	mkdir -p build

	javac -d build Main.java

	fastjar cf ${BP}.jar -C build .
}

do_install_append() {
	install -d ${D}${bindir}
	install -m 0755 jlex ${D}${bindir}/
}

PACKAGES = "${PN}"

FILES_${PN} += "${datadir_java}"

SRC_URI[md5sum] = "fe0cff5db3e2f0f5d67a153cf6c783af"
SRC_URI[sha256sum] = "aeebaece3b3a53972bb0ba0f810540386c267070ee9dca6ffa43c6ff74a54bd7"

BBCLASSEXTEND = "native"
