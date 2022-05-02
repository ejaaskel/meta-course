LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

SYSTEMD_SERVICE_${PN} = "example-systemd.service"

SRC_URI = "file://example-systemd.service \
           file://example_systemd.sh"

FILES_${PN} = "${systemd_unitdir}/system/example-systemd.service \
               ${bindir}/example_systemd.sh"

do_install_append() {
    install -d ${D}/${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/example-systemd.service ${D}/${systemd_unitdir}/system

    install -d ${D}/${bindir}
    install -m 0755 ${WORKDIR}/example_systemd.sh ${D}/${bindir}/
}
