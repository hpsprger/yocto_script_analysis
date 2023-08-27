# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "TODO"
AUTHOR = "Carlos Orduno <carlos.a.orduno@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "navigation2"
ROS_BPN = "nav2_recoveries"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    nav2-behavior-tree \
    nav2-common \
    nav2-core \
    nav2-costmap-2d \
    nav2-msgs \
    nav2-util \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    tf2 \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    nav2-behavior-tree \
    nav2-core \
    nav2-costmap-2d \
    nav2-msgs \
    nav2-util \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
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

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/galactic/nav2_recoveries/1.0.7-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/nav2_recoveries"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "e728ed0a10d2a6f59183aa67e3555680687cf4f7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
