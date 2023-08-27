# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The robot description files for the RexROV 2 underwater vehicle"
AUTHOR = "Musa Morena Marcusso Manhaes <Musa.Marcusso@de.bosch.com>"
ROS_AUTHOR = "Musa Morena Marcusso Manhaes <Musa.Marcusso@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "rexrov2"
ROS_BPN = "rexrov2_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
    gazebo-ros-control \
    robot-state-publisher \
    uuv-assistants \
    uuv-descriptions \
    uuv-gazebo-ros-plugins \
    uuv-sensor-ros-plugins \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    rosunit \
    xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uuvsimulator/rexrov2-release/archive/release/melodic/rexrov2_description/0.1.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rexrov2_description"
SRC_URI = "git://github.com/uuvsimulator/rexrov2-release;${ROS_BRANCH};protocol=https"
SRCREV = "a513dc902d45b20237cc17b43b328aecb3621c6f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
