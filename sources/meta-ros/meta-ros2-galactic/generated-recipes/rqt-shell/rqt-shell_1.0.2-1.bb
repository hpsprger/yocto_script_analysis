# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "rqt_shell is a Python GUI plugin providing an interactive shell."
AUTHOR = "Dorian Scholz <scholz@sim.tu-darmstadt.de>"
ROS_AUTHOR = "Dorian Scholz"
HOMEPAGE = "http://wiki.ros.org/rqt_shell"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_shell"
ROS_BPN = "rqt_shell"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    python3-catkin-pkg \
    qt-gui \
    qt-gui-py-common \
    rqt-gui \
    rqt-gui-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_shell-release/archive/release/galactic/rqt_shell/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/rqt_shell"
SRC_URI = "git://github.com/ros2-gbp/rqt_shell-release;${ROS_BRANCH};protocol=https"
SRCREV = "4d23b2b8544718a42f5ad77c0f4b13876fb3ec5b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
