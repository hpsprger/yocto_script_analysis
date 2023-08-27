# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The clover_description package provides URDF models of the Clover series of quadcopters."
AUTHOR = "Alexey Rogachevskiy <sfalexrog@gmail.com>"
ROS_AUTHOR = "Alexey Rogachevskiy"
HOMEPAGE = "https://github.com/CopterExpress/clover"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "clover"
ROS_BPN = "clover_description"

ROS_BUILD_DEPENDS = " \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-plugins \
    gazebo-ros \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/CopterExpress/clover-release/archive/release/melodic/clover_description/0.21.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/clover_description"
SRC_URI = "git://github.com/CopterExpress/clover-release;${ROS_BRANCH};protocol=https"
SRCREV = "1fe35d75fdaf25812a00efcd9e6a4edbb89fb6a9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
