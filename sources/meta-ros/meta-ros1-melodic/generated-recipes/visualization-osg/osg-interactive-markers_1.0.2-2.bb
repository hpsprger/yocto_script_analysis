# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package is basically an OpenSceneGraph (OSG) adaptation of the Interactive Markers client writen for rviz/Ogre."
AUTHOR = "Javier Perez <japerez@uji.es>"
ROS_AUTHOR = "Mario Prats <marioprats@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "visualization_osg"
ROS_BPN = "osg_interactive_markers"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenscenegraph} \
    interactive-markers \
    osg-markers \
    osg-utils \
    roscpp \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenscenegraph} \
    interactive-markers \
    osg-markers \
    osg-utils \
    roscpp \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenscenegraph} \
    interactive-markers \
    osg-markers \
    osg-utils \
    roscpp \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uji-ros-pkg/visualization_osg-release/archive/release/melodic/osg_interactive_markers/1.0.2-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/osg_interactive_markers"
SRC_URI = "git://github.com/uji-ros-pkg/visualization_osg-release;${ROS_BRANCH};protocol=https"
SRCREV = "7913a6c83fd4459f4b5fe465fc668a6d20f8633c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
