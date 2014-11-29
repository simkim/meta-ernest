#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Ernest ros package"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=783b7e40cdfb4a1344d15b1f7081af66"

PR = "r0"
SRC_URI = "git://github.com/simkim/ernest.git"
SRCREV = "master"
PV = "0.0.1+git${SRCREV}"
S = "${WORKDIR}/git/"
inherit catkin
PACKAGES += "ros-ernest-python"
FILES_ros-ernest-python += "/opt/ros/hydro/lib/ernest"
pkg_postinst_ros-ernest () {
#!/bin/sh -e
mkdir /etc/servo
cp /opt/ros/hydro/share/ernest/ernest.ini /etc/servo
cp /opt/ros/hydro/share/ernest/98-ernest.rules /etc/udev/rules.d
}
