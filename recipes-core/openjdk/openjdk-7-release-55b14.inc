require openjdk-7-common.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

FILESPATH =. "${FILE_DIRNAME}/openjdk-7-55b14:"

# Name of the directory containing the compiled output
BUILD_DIR = "openjdk.build"
BUILD_DIR_ECJ = "openjdk.build-ecj"

# Force arm mode for now
ARM_INSTRUCTION_SET_armv4t = "ARM"

ICEDTEA_URI = "http://icedtea.wildebeest.org/download/source/${ICEDTEA}.tar.gz;name=iced"

ICEDTEA_PREFIX = "icedtea7-forest-2.4"
ICEDTEA_HG_URL = "http://icedtea.classpath.org/hg/release/${ICEDTEA_PREFIX}"

OPENJDK_FILE = "${OPENJDK_CHANGESET}.tar.bz2"
OPENJDK_URI = "${ICEDTEA_HG_URL}/archive/${OPENJDK_FILE};name=openjdk;unpack=false"

HOTSPOT_FILE = "${HOTSPOT_CHANGESET}.tar.gz"
HOTSPOT_URI = "${ICEDTEA_HG_URL}/hotspot/archive/${HOTSPOT_FILE};name=hotspot;unpack=false"

CORBA_FILE = "${CORBA_CHANGESET}.tar.gz"
CORBA_URI = "${ICEDTEA_HG_URL}/corba/archive/${CORBA_FILE};name=corba;unpack=false"

JAXP_FILE = "${JAXP_CHANGESET}.tar.gz"
JAXP_URI = "${ICEDTEA_HG_URL}/jaxp/archive/${JAXP_FILE};name=jaxp;unpack=false"

JAXWS_FILE = "${JAXWS_CHANGESET}.tar.gz"
JAXWS_URI = "${ICEDTEA_HG_URL}/jaxws/archive/${JAXWS_FILE};name=jaxws;unpack=false"

JDK_FILE = "${JDK_CHANGESET}.tar.gz"
JDK_URI = "${ICEDTEA_HG_URL}/jdk/archive/${JDK_FILE};name=jdk;unpack=false"

LANGTOOLS_FILE = "${LANGTOOLS_CHANGESET}.tar.gz"
LANGTOOLS_URI = "${ICEDTEA_HG_URL}/langtools/archive/${LANGTOOLS_FILE};name=langtools;unpack=false"

CACAO_VERSION = "e215e36be9fc"
CACAO_FILE = "${CACAO_VERSION}.tar.gz"
CACAO_URI = "http://icedtea.wildebeest.org/download/drops/cacao/${CACAO_FILE};name=cacao;unpack=false"
SRC_URI[cacao.md5sum] = "79f95f0aea4ba04cf2f1a8632ac66d14"
SRC_URI[cacao.sha256sum] = "4966514c72ee7ed108b882d9b6e65c3adf8a8f9c2dccb029f971b3c8cb4870ab"

JAMVM_VERSION = "ac22c9948434e528ece451642b4ebde40953ee7e"
JAMVM_FILE = "jamvm-${JAMVM_VERSION}.tar.gz"
JAMVM_URI = "http://icedtea.wildebeest.org/download/drops/jamvm/${JAMVM_FILE};name=jamvm;unpack=false"
SRC_URI[jamvm.md5sum] = "3a67d0f3471bd2d5b2446d91bfa73f73"
SRC_URI[jamvm.sha256sum] = "4662da1fe3e0e11d8fa685c7f2fc748576b9f3d3e37dc56b798dd6a5bd6b61e7"

# FIXME: we shouldn't override the QA!
do_package_qa() {
	pwd
}

# Allow overriding this separately
OEPATCHES = "\
	file://0000_build_hacks.patch \
	"

# Allow overriding this separately
ICEDTEAPATCHES = "\
	file://0001_hotspot-fix-zeroshark-build.patch;apply=no \
	file://0002_jdk-fix-nio-gensor-genuc-gensc-build.patch;apply=no \
	file://0003_hotspot-div-crosscompile-fixes.patch;apply=no \
	file://0004_corba-fix-crosscompile.patch;apply=no \
	file://0005_jdk-div-crosscompile-fixes.patch;apply=no \
	"

# Allow overriding this separately
DISTRIBUTION_PATCHES = "\
	../0001_hotspot-fix-zeroshark-build.patch \
	../0002_jdk-fix-nio-gensor-genuc-gensc-build.patch \
	../0003_hotspot-div-crosscompile-fixes.patch \
	../0004_corba-fix-crosscompile.patch \
	../0005_jdk-div-crosscompile-fixes.patch \
	"

export DISTRIBUTION_PATCHES
