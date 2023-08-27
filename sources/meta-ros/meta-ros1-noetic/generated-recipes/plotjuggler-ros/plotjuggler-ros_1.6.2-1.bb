# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "PlotJuggler plugin for ROS"
AUTHOR = "Davide Faconti <davide.faconti@gmail.com>"
ROS_AUTHOR = "Davide Faconti <davide.faconti@gmail.com>"
HOMEPAGE = "https://github.com/facontidavide/PlotJuggler"
SECTION = "devel"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=401bb3d3cfffe0a0a75060250c104a03"

ROS_CN = "plotjuggler_ros"
ROS_BPN = "plotjuggler_ros"

ROS_BUILD_DEPENDS = " \
    binutils \
    boost \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    plotjuggler \
    plotjuggler-msgs \
    qtbase \
    qtsvg \
    qtwebsockets \
    rosbag-storage \
    roscpp \
    roscpp-serialization \
    sensor-msgs \
    tf \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    binutils \
    boost \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    plotjuggler \
    plotjuggler-msgs \
    qtbase \
    qtsvg \
    qtwebsockets \
    rosbag-storage \
    roscpp \
    roscpp-serialization \
    sensor-msgs \
    tf \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    binutils \
    boost \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    plotjuggler \
    plotjuggler-msgs \
    qtbase \
    qtsvg \
    qtwebsockets \
    rosbag-storage \
    roscpp \
    roscpp-serialization \
    sensor-msgs \
    tf \
    tf2-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PlotJuggler/plotjuggler-ros-plugins-release/archive/release/noetic/plotjuggler_ros/1.6.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/plotjuggler_ros"
SRC_URI = "git://github.com/PlotJuggler/plotjuggler-ros-plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "184887c26b4c314c22e873cf333c7d402ee3fde7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
