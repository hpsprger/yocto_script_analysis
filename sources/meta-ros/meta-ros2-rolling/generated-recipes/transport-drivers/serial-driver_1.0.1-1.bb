# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "A template class and associated utilities which encapsulate basic reading from serial ports"
AUTHOR = "Joshua Whitley <whitleysoftwareservices@gmail.com>"
ROS_AUTHOR = "Apex.AI, Inc. <opensource@apex.ai>"
HOMEPAGE = "https://github.com/ros-drivers/transport_drivers"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "transport_drivers"
ROS_BPN = "serial_driver"

ROS_BUILD_DEPENDS = " \
    asio \
    io-context \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
    asio-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    asio \
    io-context \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    asio \
    io-context \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/transport_drivers-release/archive/release/rolling/serial_driver/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/serial_driver"
SRC_URI = "git://github.com/ros-drivers-gbp/transport_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "bb839bf47146b7dfa37f7e901c8ca85a3d61facb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
