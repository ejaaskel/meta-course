LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://main.c"

FILES_${PN} = "${bindir}/hello_yocto"

do_configure() {
    #Configuring would happen here, but this recipe doesnt really need it, so just echo
    echo Configuring...
}

do_compile() {
    which gcc
    ${CC} ${CLAGS} ${LDFLAGS} -o hello_yocto ${WORKDIR}/main.c
}

do_install() {
    install -d ${D}/${bindir}
    install -m 0755 ${B}/hello_yocto ${D}/${bindir}
}
