# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Example of using rclc_executor"
AUTHOR = "Jan Staschulat <jan.staschulat@de.bosch.com>"
ROS_AUTHOR = "Jan Staschulat <jan.staschulat@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rclc"
ROS_BPN = "rclc_examples"

ROS_BUILD_DEPENDS = " \
    example-interfaces \
    lifecycle-msgs \
    rcl \
    rclc \
    rclc-lifecycle \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    example-interfaces \
    lifecycle-msgs \
    rcl \
    rclc \
    rclc-lifecycle \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rclc-release/archive/release/foxy/rclc_examples/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/rclc_examples"
SRC_URI = "git://github.com/ros2-gbp/rclc-release;${ROS_BRANCH};protocol=https"
SRCREV = "e80326ee8f62ad93372b104423d8b9b16ed28f9b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
