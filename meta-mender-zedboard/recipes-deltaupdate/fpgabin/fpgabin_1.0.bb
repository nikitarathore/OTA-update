SUMMARY = "Generates fpga.bin using bootgen tool"
DESCRIPTION = "Manages task dependencies and creation of boot.bin. Use the \
BIF_PARTITION_xyz global variables and flags to determine what makes it into \
the image."

# License, for example MIT
LICENSE = "MIT"
# License checksum file is always required
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

include fpga-zynq.inc
inherit deploy

PROVIDES = "virtual/fpga-bin"
FILES_${PN} = "/boot/fpga.bin"

SRC_URI = "file://fpga.bin"

S = "${WORKDIR}"

do_install() {
	install -d ${D}/boot
	install -m 0644 ${S}/fpga.bin ${D}/boot/fpga.bin
}


