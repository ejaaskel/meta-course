DESCRIPTION = "Example of SysVinit startup script"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit update-rc.d
INITSCRIPT_NAME = "startup-example-script"
INITSCRIPT_PARAMS = "defaults 90 10"

SRC_URI = "              \
   file://startup-example-script \
   "

do_install() {
  install -d ${D}/${INIT_D_DIR}
  install -m 0755 ${WORKDIR}/startup-example-script ${D}${INIT_D_DIR}/startup-example-script
}

