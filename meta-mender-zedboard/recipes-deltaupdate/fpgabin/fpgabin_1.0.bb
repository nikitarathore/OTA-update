SUMMARY = "install design_wrapper.bin on root file system"
LICENSE = "MIT"
# License checksum file is always required
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "\
             file://design_1_wrapper.bin \
             "
FILES_${PN} = "/boot/design_1_wrapper.bin"
do_install() {
	install -d ${D}/boot
	install -m 0644  ${WORKDIR}/design_1_wrapper.bin  ${D}/boot/design_1_wrapper.bin
}
