# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Special Messages for PlotJuggler"
AUTHOR = "daf <davide.faconti@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=92566b45c3390e5178465bcaade208b7"

ROS_CN = "plotjuggler_msgs"
ROS_BPN = "plotjuggler_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-generation \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-generation \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/facontidavide/plotjuggler_msgs-release/archive/release/melodic/plotjuggler_msgs/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/plotjuggler_msgs"
SRC_URI = "git://github.com/facontidavide/plotjuggler_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "5b447b331507393bff4de3fb715c7692886d5596"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
