DESCRIPTION = "some scripts over pydynamixel to play with bioloid"
SECTION = "devel/python"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=783b7e40cdfb4a1344d15b1f7081af66"
HOMEPAGE = "https://github.com/simkim/ax"
DEPENDS = "python python-pyserial pydynamixel"

PR = "r0"
SRC_URI = "git://github.com/simkim/ax.git"
SRCREV = "master"
PV = "0.0.1+git${SRCREV}"
S = "${WORKDIR}/git/"
inherit setuptools
