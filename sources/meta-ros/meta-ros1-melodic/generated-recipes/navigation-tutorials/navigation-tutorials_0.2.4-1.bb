# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Navigation related tutorials."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://www.ros.org/wiki/navigation_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_tutorials"
ROS_BPN = "navigation_tutorials"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    laser-scan-publisher-tutorial \
    navigation-stage \
    odometry-publisher-tutorial \
    point-cloud-publisher-tutorial \
    robot-setup-tf-tutorial \
    roomba-stage \
    simple-navigation-goals-tutorial \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    laser-scan-publisher-tutorial \
    navigation-stage \
    odometry-publisher-tutorial \
    point-cloud-publisher-tutorial \
    robot-setup-tf-tutorial \
    roomba-stage \
    simple-navigation-goals-tutorial \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/navigation_tutorials/0.2.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/navigation_tutorials"
SRC_URI = "git://github.com/ros-gbp/navigation_tutorials-release;${ROS_BRANCH};protocol=https"
SRCREV = "2cd89488af5bee9fe65064ea8ebace1767ff46f8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
