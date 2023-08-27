# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "The quaternion_operation package"
AUTHOR = "Masaya Kataoka <ms.kataoka@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "quaternion_operation"
ROS_BPN = "quaternion_operation"

ROS_BUILD_DEPENDS = " \
    ament-cmake-auto \
    geometry-msgs \
    libeigen \
    rclcpp \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-cmake-auto \
    geometry-msgs \
    libeigen \
    rclcpp \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake-auto \
    geometry-msgs \
    libeigen \
    rclcpp \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/OUXT-Polaris/quaternion_operation-release/archive/release/foxy/quaternion_operation/0.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/quaternion_operation"
SRC_URI = "git://github.com/OUXT-Polaris/quaternion_operation-release;${ROS_BRANCH};protocol=https"
SRCREV = "e6a53e1c724a8303b31cdad3d9f81c057149caa3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
