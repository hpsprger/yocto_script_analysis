# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS package for LDS(HLS-LFCD2).     The LDS (Laser Distance Sensor) is a sensor sending the data to Host for the simultaneous localization and mapping (SLAM). Simultaneously the detecting obstacle data can also be sent to Host. HLDS(Hitachi-LG Data Storage) is developing the technology for the moving platform sensor such as Robot Vacuum Cleaners, Home Robot, Robotics Lawn Mower Sensor, etc."
AUTHOR = "Will Son <willson@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/hls_lfcd_lds_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hls_lfcd_lds_driver"
ROS_BPN = "hls_lfcd_lds_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/hls_lfcd_lds_driver-release/archive/release/humble/hls_lfcd_lds_driver/2.0.4-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/hls_lfcd_lds_driver"
SRC_URI = "git://github.com/ros2-gbp/hls_lfcd_lds_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "f3180a283358295fcbc8d033f246a09e80b529d3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
