DESCRIPTION = "picospeaker"
SECTION = "devel/python"
LICENSE = "UNLICENSE"
LIC_FILES_CHKSUM = "file://UNLICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"
HOMEPAGE = "http://picospeaker.tk/"
DEPENDS = "python sox libttspico libttspico-lang"

PR = "r0"
SRC_URI = "git://github.com/the-kyle/picospeaker.git"
SRCREV = "v0.6.2"
PV = "0.0.1+git${SRCREV}"
S = "${WORKDIR}/git/"

do_compile() {
    exit 0
}
do_install() {
    install -d ${D}${bindir}
    install -m 0755 picospeaker ${D}${bindir}
}
