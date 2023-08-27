# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Bundle python requirements in a ament package via virtualenv."
AUTHOR = "Max Krichenbauer <v-krichenbauer7715@esol.co.jp>"
ROS_AUTHOR = "Max Krichenbauer <v-krichenbauer7715@esol.co.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d6fd5bd8a2ca0ce00c65331b4263470b"

ROS_CN = "ament_virtualenv"
ROS_BPN = "ament_cmake_virtualenv"

ROS_BUILD_DEPENDS = " \
    ament-virtualenv \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
    ament-cmake-test-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-virtualenv \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-cmake-lint-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/esol-community/ament_virtualenv-release/archive/release/dashing/ament_cmake_virtualenv/0.0.5-5.tar.gz
ROS_BRANCH ?= "branch=release/dashing/ament_cmake_virtualenv"
SRC_URI = "git://github.com/esol-community/ament_virtualenv-release;${ROS_BRANCH};protocol=https"
SRCREV = "5355044bde07c6be03becc61d358f0247a6b7899"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}