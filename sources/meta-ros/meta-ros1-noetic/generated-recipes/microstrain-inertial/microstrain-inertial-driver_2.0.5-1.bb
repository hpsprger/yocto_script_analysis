# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The ros_mscl package provides a driver for the LORD/Microstrain inertial products."
AUTHOR = "Rob Fisher <rob.fisher@parker.com>"
ROS_AUTHOR = "Brian Bingham"
HOMEPAGE = "https://github.com/LORD-MicroStrain/microstrain_inertial"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "microstrain_inertial"
ROS_BPN = "microstrain_inertial_driver"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    curl \
    diagnostic-updater \
    geometry-msgs \
    jq \
    message-generation \
    microstrain-inertial-msgs \
    nav-msgs \
    roscpp \
    roslint \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    diagnostic-updater \
    geometry-msgs \
    microstrain-inertial-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    diagnostic-aggregator \
    diagnostic-updater \
    geometry-msgs \
    message-runtime \
    microstrain-inertial-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/LORD-MicroStrain/microstrain_inertial-release/archive/release/noetic/microstrain_inertial_driver/2.0.5-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/microstrain_inertial_driver"
SRC_URI = "git://github.com/LORD-MicroStrain/microstrain_inertial-release;${ROS_BRANCH};protocol=https"
SRCREV = "a183ed4322d146953379a0d6705b8347bb3a7f87"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
