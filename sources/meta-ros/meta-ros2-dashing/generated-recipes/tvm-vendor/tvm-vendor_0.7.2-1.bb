# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around Apache TVM to make it available to the ROS ecosystem."
AUTHOR = "Josh Whitley <josh.whitley@autoware.org>"
HOMEPAGE = "https://tvm.apache.org/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "tvm_vendor"
ROS_BPN = "tvm_vendor"

ROS_BUILD_DEPENDS = " \
    git \
    libxml2 \
    openblas \
    ros-environment \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    git \
    libxml2 \
    openblas \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    git \
    libxml2 \
    openblas \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/autowarefoundation/tvm_vendor-release/archive/release/dashing/tvm_vendor/0.7.2-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/tvm_vendor"
SRC_URI = "git://github.com/autowarefoundation/tvm_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "ae6f0de9a5358b2c5124c530c5436dfd24d41d97"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
