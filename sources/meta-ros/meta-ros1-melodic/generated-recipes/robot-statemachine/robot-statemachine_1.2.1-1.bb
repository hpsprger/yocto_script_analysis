# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The robot_statemachine package bundles all functionalities and the GUI"
AUTHOR = "Marco Steinbrink <marco.stb1993@gmail.de>"
ROS_AUTHOR = "Marco Steinbrink <marco.stb1993@gmail.de>"
HOMEPAGE = "https://github.com/MarcoStb1993/robot_statemachine"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "robot_statemachine"
ROS_BPN = "robot_statemachine"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rsm-additions \
    rsm-core \
    rsm-msgs \
    rsm-rqt-plugins \
    rsm-rviz-plugins \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/MarcoStb1993/robot_statemachine-release/archive/release/melodic/robot_statemachine/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/robot_statemachine"
SRC_URI = "git://github.com/MarcoStb1993/robot_statemachine-release;${ROS_BRANCH};protocol=https"
SRCREV = "c8bee207f49920399827a79ebecf6094b2f3adb8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
