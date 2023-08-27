# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "This package provides the Ignition CMake 2.x library."
AUTHOR = "Jose Luis Rivero <jrivero@osrfoundation.org>"
ROS_AUTHOR = "Scott K Logan <logans@cottsay.net>"
HOMEPAGE = "https://github.com/ignitionrobotics/ign-math"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=331e6f1fd51415553e83a18d4b805e83"

ROS_CN = "ignition_cmake2_vendor"
ROS_BPN = "ignition_cmake2_vendor"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-cmake2} \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-test-native \
    cmake-native \
    doxygen-native \
    git-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-cmake2} \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-cmake2} \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-cmake-lint-cmake \
    ament-cmake-xmllint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ignition_cmake2_vendor-release/archive/release/rolling/ignition_cmake2_vendor/0.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/ignition_cmake2_vendor"
SRC_URI = "git://github.com/ros2-gbp/ignition_cmake2_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "30d3ce0be68f6b6de67e33205afc5429c490e643"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
