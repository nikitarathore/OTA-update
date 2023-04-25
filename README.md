meta-mender-zedboard

Mender integration for Zedboard

The tested boards is:

Xilinx zynq 7000 SoC developement Board - Zedboard


Dependencies
This layer depends on:

URI: https://github.com/openembedded/meta-openembedded.git
layers: meta-oe
branch: warrior
revision: HEAD

URI: https://github.com/mendersoftware/meta-mender
layers: meta-mender-core
branch: warrior
revision: HEAD


Quick Start

The following commands will setup the environment and allow you to build images that have Mender integrated.

git clone -b warrior https://git.yoctoproject.org/poky
cd poky
git clone -b warrior https://github.com/openembedded/meta-openembedded.git
git clone -b warrior https://github.com/mendersoftware/meta-mender
git clone -b warrior https://github.com/nikitarathore/OTA-update.git

source oe-init-build-env

add the layers -
bitbake-layers add-layer ../meta-openembedded/meta-oe
bitbake-layers add-layer ../meta-mender/meta-mender-core
bitbake-layers add-layer ../meta-mender-zedboard

To build the image-
bitbake core-image-base

This will generate the disk image (.sdimg) and a .mender rootfs file.
