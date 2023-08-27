# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Basic test nodes for Pyros dynamic ROS interface"
AUTHOR = "AlexV <asmodehn@gmail.com>"
ROS_AUTHOR = "AlexV <asmodehn@gmail.com>"
HOMEPAGE = "https://github.com/asmodehn/pyros-test"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pyros_test"
ROS_BPN = "pyros_test"

ROS_BUILD_DEPENDS = " \
    message-generation \
    roslint \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    rospy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    rostopic \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pyros-dev/pyros-test-release/archive/release/melodic/pyros_test/0.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pyros_test"
SRC_URI = "git://github.com/pyros-dev/pyros-test-release;${ROS_BRANCH};protocol=https"
SRCREV = "e97eac341c422e49bf144cf3b355370dd6a27cee"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
