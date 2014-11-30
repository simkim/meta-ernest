DESCRIPTION = "pydynamixel library"
SECTION = "devel/python"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://License.txt;md5=c85774edf4a1e43cec063a5d93843898"
HOMEPAGE = "https://github.com/simkim/pydynamixel"
DEPENDS = "python"

PR = "r0"
SRC_URI = "git://github.com/simkim/pydynamixel.git"
SRCREV = "master"
PV = "0.0.1+git${SRCREV}"
S = "${WORKDIR}/git/"
inherit setuptools
