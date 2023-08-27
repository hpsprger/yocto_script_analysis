# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "A package containing RViz2 plugins for RMF"
AUTHOR = "Yadunund <yadunund@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmf_visualization"
ROS_BPN = "rmf_visualization_rviz2_plugins"

ROS_BUILD_DEPENDS = " \
    libeigen \
    pluginlib \
    qtbase \
    rclcpp \
    resource-retriever \
    rmf-door-msgs \
    rmf-lift-msgs \
    rmf-traffic-ros2 \
    rmf-visualization-msgs \
    rviz-common \
    rviz-default-plugins \
    rviz-rendering \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    pluginlib \
    rclcpp \
    resource-retriever \
    rmf-door-msgs \
    rmf-lift-msgs \
    rmf-traffic-ros2 \
    rmf-visualization-msgs \
    rviz-common \
    rviz-default-plugins \
    rviz-rendering \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    qtbase \
    rclcpp \
    resource-retriever \
    rmf-door-msgs \
    rmf-lift-msgs \
    rmf-traffic-ros2 \
    rmf-visualization-msgs \
    rviz-common \
    rviz-default-plugins \
    rviz-rendering \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rmf-cmake-uncrustify \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_visualization-release/archive/release/foxy/rmf_visualization_rviz2_plugins/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/rmf_visualization_rviz2_plugins"
SRC_URI = "git://github.com/ros2-gbp/rmf_visualization-release;${ROS_BRANCH};protocol=https"
SRCREV = "774b11603d6ce5610a311e727dfe860f5cc427e5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
