# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The pilz_trajectory_generation package containing the MoveIt! plugin pilz_command_planner."
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "https://wiki.ros.org/pilz_trajectory_generation"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPLv3"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "pilz_industrial_motion"
ROS_BPN = "pilz_trajectory_generation"

ROS_BUILD_DEPENDS = " \
    eigen-conversions \
    kdl-conversions \
    moveit-core \
    moveit-msgs \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    orocos-kdl \
    pilz-extensions \
    pilz-msgs \
    pluginlib \
    roscpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    eigen-conversions \
    kdl-conversions \
    moveit-core \
    moveit-msgs \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    orocos-kdl \
    pilz-extensions \
    pilz-msgs \
    pluginlib \
    roscpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    eigen-conversions \
    kdl-conversions \
    moveit-core \
    moveit-msgs \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    orocos-kdl \
    pilz-extensions \
    pilz-msgs \
    pluginlib \
    roscpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cmake-modules \
    code-coverage \
    pilz-industrial-motion-testutils \
    pilz-testutils \
    prbt-moveit-config \
    prbt-pg70-support \
    prbt-support \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_trajectory_generation/0.4.14-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pilz_trajectory_generation"
SRC_URI = "git://github.com/PilzDE/pilz_industrial_motion-release;${ROS_BRANCH};protocol=https"
SRCREV = "d3d149d80d1a0be62e1cdfc0084f4464ab904812"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
