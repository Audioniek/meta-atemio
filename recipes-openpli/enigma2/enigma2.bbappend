#CXXFLAGS_append_sh4 += " -std=c++11 -fPIC -fno-strict-aliasing "

FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI_append += "\
	${@bb.utils.contains("MACHINE", "atemio520|atemio530", "file://enigma2-atemio-all.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "atemio520", "file://enigma2-atemio520.patch", "", d)} \
	${@bb.utils.contains("MACHINE", "atemio530", "file://enigma2-atemio530.patch", "", d)} \
	"

SRCREV_FORMAT = "enigma2"

