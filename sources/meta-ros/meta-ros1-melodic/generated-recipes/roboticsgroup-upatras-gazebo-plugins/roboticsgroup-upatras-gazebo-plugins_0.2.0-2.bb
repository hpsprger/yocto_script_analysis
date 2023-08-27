# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Collection of gazebo plugins"
AUTHOR = "Konstantinos Chatzilygeroudis <costashatz@gmail.com>"
ROS_AUTHOR = "Konstantinos Chatzilygeroudis <costashatz@gmail.com>"
HOMEPAGE = "https://github.com/roboticsgroup/roboticsgroup_upatras_gazebo_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=30;endline=30;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "roboticsgroup_upatras_gazebo_plugins"
ROS_BPN = "roboticsgroup_upatras_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    control-toolbox \
    gazebo-ros \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    control-toolbox \
    gazebo-ros \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-toolbox \
    gazebo-ros \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboticsgroup/roboticsgroup_upatras_gazebo_plugins-release/archive/release/melodic/roboticsgroup_upatras_gazebo_plugins/0.2.0-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/roboticsgroup_upatras_gazebo_plugins"
SRC_URI = "git://github.com/roboticsgroup/roboticsgroup_upatras_gazebo_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "bb74fd5e0d53c14b281b790e82bbfbf82aec8035"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
