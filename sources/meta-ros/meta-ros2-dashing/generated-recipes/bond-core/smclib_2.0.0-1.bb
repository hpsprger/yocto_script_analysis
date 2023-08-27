# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "The State Machine Compiler (SMC) from http://smc.sourceforge.net/     converts a language-independent description of a state machine     into the source code to support that state machine.      This package contains the libraries that a compiled state machine     depends on, but it does not contain the compiler itself."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
ROS_AUTHOR = "Various"
HOMEPAGE = "http://smc.sourceforge.net/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Mozilla Public License Version 1.1"
LICENSE = "MPL-1.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=e1b5a50d4dd59d8102e41a7a2254462d"

ROS_CN = "bond_core"
ROS_BPN = "smclib"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/bond_core-release/archive/release/dashing/smclib/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/smclib"
SRC_URI = "git://github.com/ros2-gbp/bond_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "a9a69fa46b01514b4b9bed0c861ad146250b3066"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
