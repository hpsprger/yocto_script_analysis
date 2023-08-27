# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Robot agnostic information theoretic exploration strategy"
AUTHOR = "bostoncleek <bostoncleek2020@u.northwestern.edu>"
ROS_AUTHOR = "bostoncleek <bostoncleek2020@u.northwestern.edu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD-3"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=76ea7cd512d17201ff67e2488e8c4ce3"

ROS_CN = "ergodic_exploration"
ROS_BPN = "ergodic_exploration"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-armadillo} \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-armadillo} \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-armadillo} \
    map-server \
    roscpp \
    rviz \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/bostoncleek/ergodic_exploration-release/archive/release/noetic/ergodic_exploration/1.0.0-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/ergodic_exploration"
SRC_URI = "git://github.com/bostoncleek/ergodic_exploration-release;${ROS_BRANCH};protocol=https"
SRCREV = "c2d7ffecd6c074ea3b15c043950673a7ea3e4023"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
