# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Messages and actions for S3 file uploader."
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "rosbag_uploader"
ROS_BPN = "file_uploader_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    message-generation \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    message-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/rosbag_uploader-release/archive/release/melodic/file_uploader_msgs/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/file_uploader_msgs"
SRC_URI = "git://github.com/aws-gbp/rosbag_uploader-release;${ROS_BRANCH};protocol=https"
SRCREV = "06b2fa17c03aefef27acc4904dc62d0c3664d868"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
