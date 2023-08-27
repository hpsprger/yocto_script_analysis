# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Package containing the Python client."
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "Esteve Fernandez <esteve@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rclpy"
ROS_BPN = "rclpy"

ROS_BUILD_DEPENDS = " \
    rcl \
    rcl-action \
    rcl-yaml-param-parser \
    rcutils \
    rmw-implementation \
    rmw-implementation-cmake \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    rcl \
    rcl-action \
    rcl-yaml-param-parser \
    rmw-implementation \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    builtin-interfaces \
    rcl \
    rcl-action \
    rcl-interfaces \
    rcl-yaml-param-parser \
    rmw-implementation \
    rosgraph-msgs \
    rpyutils \
    unique-identifier-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    python3-pytest \
    rosidl-generator-py \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rclpy-release/archive/release/foxy/rclpy/1.0.7-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/rclpy"
SRC_URI = "git://github.com/ros2-gbp/rclpy-release;${ROS_BRANCH};protocol=https"
SRCREV = "87324a8f94e9b921b4bdd5e0d1517201bbea51db"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
