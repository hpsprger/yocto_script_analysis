# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "hector_components_description contains URDF xacro macros for robot components, so they are easily attachable to robot models."
AUTHOR = "Stefan Fabian <fabian@sim.tu-darmstadt.de>"
ROS_AUTHOR = "Stefan Kohlbrecher <kohlbrecher@sim.tu-darmstadt.de>"
HOMEPAGE = "http://ros.org/wiki/hector_components_description"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hector_models"
ROS_BPN = "hector_components_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros-control-select-joints \
    hector-gazebo-thermal-camera \
    hector-sensors-description \
    hector-xacro-tools \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/noetic/hector_components_description/0.5.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/hector_components_description"
SRC_URI = "git://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release;${ROS_BRANCH};protocol=https"
SRCREV = "a6538a1c9be21deb0268b99d6e01e9654789aa8a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
