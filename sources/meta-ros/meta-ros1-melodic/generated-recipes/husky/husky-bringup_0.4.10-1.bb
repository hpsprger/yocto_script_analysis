# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Clearpath Husky installation and integration package"
AUTHOR = "Tony Baltovski <tbaltovski@clearpathrobotics.com>"
ROS_AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/husky_bringup"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "husky"
ROS_BPN = "husky_bringup"

ROS_BUILD_DEPENDS = " \
    roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-scipy} \
    husky-base \
    husky-control \
    husky-description \
    imu-filter-madgwick \
    imu-transformer \
    lms1xx \
    microstrain-3dmgx2-imu \
    microstrain-mips \
    nmea-comms \
    nmea-navsat-driver \
    realsense2-camera \
    robot-localization \
    robot-upstart \
    tf \
    tf2-ros \
    um6 \
    um7 \
    velodyne-pointcloud \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-scipy} \
    husky-base \
    husky-control \
    husky-description \
    imu-filter-madgwick \
    imu-transformer \
    lms1xx \
    microstrain-3dmgx2-imu \
    microstrain-mips \
    nmea-comms \
    nmea-navsat-driver \
    realsense2-camera \
    robot-localization \
    robot-upstart \
    tf \
    tf2-ros \
    um6 \
    um7 \
    velodyne-pointcloud \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_bringup/0.4.10-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/husky_bringup"
SRC_URI = "git://github.com/clearpath-gbp/husky-release;${ROS_BRANCH};protocol=https"
SRCREV = "dbcf80c1a22d0b817396b7c618c3adf2ef1b309b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
