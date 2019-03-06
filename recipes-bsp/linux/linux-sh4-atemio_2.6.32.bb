COMPATIBLE_MACHINE = "atemio520|atemio530"

require ${META-SH4-NAME}/recipes-bsp/linux/linux-sh4.inc

STXNUMBER = "stx7111"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-sh4:"

SRC_URI_append += "\
    file://linux-sh4-stmmac_stm24_${STM_PATCH_STR}.patch;patch=1 \
    file://linux-sh4-lmb_stm24_${STM_PATCH_STR}.patch;patch=1 \
    file://linux-sh4-${MACHINE}_setup_stm24_${STM_PATCH_STR}.patch;patch=1 \
"

MACHINE_KERNEL_PR_append = ".2"
