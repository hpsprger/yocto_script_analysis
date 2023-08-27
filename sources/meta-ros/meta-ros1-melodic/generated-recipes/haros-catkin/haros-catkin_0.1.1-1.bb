# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Catkin integration for HAROS (version 3.6.0)"
AUTHOR = "G.A. vd. Hoorn (TU Delft Robotics Institute) <g.a.vanderhoorn@tudelft.nl>"
ROS_AUTHOR = "Andre Santos (HAROS)"
HOMEPAGE = "https://github.com/git-afsantos/haros.git"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "haros_catkin"
ROS_BPN = "haros_catkin"

ROS_BUILD_DEPENDS = " \
    catkin-virtualenv \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-cccc} \
    cppcheck \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rosin-project/haros_catkin-release/archive/release/melodic/haros_catkin/0.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/haros_catkin"
SRC_URI = "git://github.com/rosin-project/haros_catkin-release;${ROS_BRANCH};protocol=https"
SRCREV = "e2dfc50c1e8f1f00207ca5fc74ceb5bed3c07046"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
