# Package summary
SUMMARY = "Hello World"
# License, for example MIT
LICENSE = "MIT"
# License checksum file is always required
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# hello-world.c from local file
SRC_URI = "file://mnist_1mar.py \
           file://mnist_loader.py \
           file://network2.py \
           file://testNN.py \
           file://mnist.pkl.gz;unpack=0 \
           file://WeightsAndBiases.txt"

# Set LDFLAGS options provided by the build system
TARGET_CC_ARCH += "${LDFLAGS}"

# Change source directory to workdirectory where hello-world.cpp is
S = "${WORKDIR}"


# Install binary to final directory /usr/bin
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/mnist_loader.py ${D}${bindir}
    install -m 0755 ${S}/network2.py ${D}${bindir}
    install -m 0755 ${S}/testNN.py ${D}${bindir}
    install -m 0755 ${S}/mnist.pkl.gz ${D}${bindir}
    install -m 0755 ${S}/WeightsAndBiases.txt ${D}${bindir}
}
