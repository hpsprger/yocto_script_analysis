# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Provides a cmake config for the default version of Gazebo for the ROS distribution."
AUTHOR = "Jose Luis Rivero <jrivero@openrobotics.org>"
ROS_AUTHOR = "Johannes Meyer"
HOMEPAGE = "http://gazebosim.org/tutorials?cat=connect_ros"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "gazebo_ros_pkgs"
ROS_BPN = "gazebo_dev"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libgazebo9-dev} \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_dev/3.3.5-3.tar.gz
ROS_BRANCH ?= "branch=release/dashing/gazebo_dev"
SRC_URI = "git://github.com/ros2-gbp/gazebo_ros_pkgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "bf6ff4aabb62e433649926e6e2c239a886500a3c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
