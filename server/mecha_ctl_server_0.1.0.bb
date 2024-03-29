# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get mecha_ctl_server could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/mecha_ctl_server/0.1.0"
SRC_URI += "git://git@github.com/dhruveshb-mecha/mecha-ctl.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "793623c51e6e450d7e0027680697cb15f29cac8f"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "server"
PV:append = ".AUTOINC+793623c51e"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.21.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.7.7 \
    crate://crates.io/aho-corasick/1.1.2 \
    crate://crates.io/anstream/0.6.4 \
    crate://crates.io/anstyle-parse/0.2.3 \
    crate://crates.io/anstyle-query/1.0.1 \
    crate://crates.io/anstyle-wincon/3.0.2 \
    crate://crates.io/anstyle/1.0.4 \
    crate://crates.io/anyhow/1.0.75 \
    crate://crates.io/async-trait/0.1.74 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/axum-core/0.3.4 \
    crate://crates.io/axum/0.6.20 \
    crate://crates.io/backtrace/0.3.69 \
    crate://crates.io/base64/0.21.5 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.4.1 \
    crate://crates.io/bluer/0.16.1 \
    crate://crates.io/bytes/1.5.0 \
    crate://crates.io/cc/1.0.83 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/4.4.11 \
    crate://crates.io/clap_builder/4.4.11 \
    crate://crates.io/clap_derive/4.4.7 \
    crate://crates.io/clap_lex/0.6.0 \
    crate://crates.io/colorchoice/1.0.0 \
    crate://crates.io/config/0.13.4 \
    crate://crates.io/console/0.15.7 \
    crate://crates.io/core-foundation-sys/0.8.6 \
    crate://crates.io/crossbeam-deque/0.8.3 \
    crate://crates.io/crossbeam-epoch/0.9.15 \
    crate://crates.io/crossbeam-utils/0.8.16 \
    crate://crates.io/custom_debug/0.5.1 \
    crate://crates.io/custom_debug_derive/0.5.1 \
    crate://crates.io/dbus-crossroads/0.5.2 \
    crate://crates.io/dbus-tokio/0.7.6 \
    crate://crates.io/dbus/0.9.7 \
    crate://crates.io/difflib/0.4.0 \
    crate://crates.io/displaydoc/0.2.4 \
    crate://crates.io/dlv-list/0.3.0 \
    crate://crates.io/downcast/0.11.0 \
    crate://crates.io/either/1.9.0 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/env_logger/0.10.1 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.8 \
    crate://crates.io/fastrand/2.0.1 \
    crate://crates.io/fixedbitset/0.4.2 \
    crate://crates.io/float-cmp/0.9.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/fragile/2.0.0 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/futures-channel/0.3.29 \
    crate://crates.io/futures-core/0.3.29 \
    crate://crates.io/futures-executor/0.3.29 \
    crate://crates.io/futures-io/0.3.29 \
    crate://crates.io/futures-macro/0.3.29 \
    crate://crates.io/futures-sink/0.3.29 \
    crate://crates.io/futures-task/0.3.29 \
    crate://crates.io/futures-util/0.3.29 \
    crate://crates.io/futures/0.3.29 \
    crate://crates.io/getrandom/0.2.11 \
    crate://crates.io/gimli/0.28.1 \
    crate://crates.io/h2/0.3.22 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.14.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.3.3 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/home/0.5.5 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.11 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.3 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-timeout/0.4.1 \
    crate://crates.io/hyper/0.14.27 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/indexmap/2.1.0 \
    crate://crates.io/is-terminal/0.4.9 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/1.0.9 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.150 \
    crate://crates.io/libdbus-sys/0.2.5 \
    crate://crates.io/linux-raw-sys/0.4.12 \
    crate://crates.io/log/0.4.20 \
    crate://crates.io/macaddr/1.0.1 \
    crate://crates.io/matchit/0.7.3 \
    crate://crates.io/memchr/2.6.4 \
    crate://crates.io/memoffset/0.9.0 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/mio/0.8.10 \
    crate://crates.io/mockall/0.11.4 \
    crate://crates.io/mockall_derive/0.11.4 \
    crate://crates.io/multimap/0.8.3 \
    crate://crates.io/nix/0.27.1 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/normalize-line-endings/0.3.0 \
    crate://crates.io/ntapi/0.4.1 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num-derive/0.4.1 \
    crate://crates.io/num-traits/0.2.17 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/object/0.32.1 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/ordered-multimap/0.4.3 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/pathdiff/0.2.1 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/petgraph/0.6.4 \
    crate://crates.io/pin-project-internal/1.1.3 \
    crate://crates.io/pin-project-lite/0.2.13 \
    crate://crates.io/pin-project/1.1.3 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/predicates-core/1.0.6 \
    crate://crates.io/predicates-tree/1.0.9 \
    crate://crates.io/predicates/2.1.5 \
    crate://crates.io/prettyplease/0.1.25 \
    crate://crates.io/proc-macro2/1.0.70 \
    crate://crates.io/prost-build/0.11.9 \
    crate://crates.io/prost-derive/0.11.9 \
    crate://crates.io/prost-types/0.11.9 \
    crate://crates.io/prost/0.11.9 \
    crate://crates.io/quote/1.0.33 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rayon-core/1.12.0 \
    crate://crates.io/rayon/1.8.0 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.4.1 \
    crate://crates.io/regex-automata/0.4.3 \
    crate://crates.io/regex-syntax/0.8.2 \
    crate://crates.io/regex/1.10.2 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/rust-ini/0.18.0 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustix/0.38.26 \
    crate://crates.io/rustversion/1.0.14 \
    crate://crates.io/ryu/1.0.15 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/serde/1.0.193 \
    crate://crates.io/serde_derive/1.0.193 \
    crate://crates.io/serde_json/1.0.108 \
    crate://crates.io/serde_yaml/0.9.27 \
    crate://crates.io/sharded-slab/0.1.7 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.11.2 \
    crate://crates.io/socket2/0.4.10 \
    crate://crates.io/socket2/0.5.5 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strum/0.25.0 \
    crate://crates.io/strum_macros/0.25.3 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.39 \
    crate://crates.io/sync_wrapper/0.1.2 \
    crate://crates.io/synstructure/0.12.6 \
    crate://crates.io/sysinfo/0.29.11 \
    crate://crates.io/tempdir/0.3.7 \
    crate://crates.io/tempfile/3.8.1 \
    crate://crates.io/termcolor/1.4.0 \
    crate://crates.io/termtree/0.4.1 \
    crate://crates.io/thiserror-impl/1.0.50 \
    crate://crates.io/thiserror/1.0.50 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/tokio-io-timeout/1.2.0 \
    crate://crates.io/tokio-macros/2.2.0 \
    crate://crates.io/tokio-stream/0.1.14 \
    crate://crates.io/tokio-util/0.7.10 \
    crate://crates.io/tokio/1.34.0 \
    crate://crates.io/tonic-build/0.9.2 \
    crate://crates.io/tonic/0.9.2 \
    crate://crates.io/tower-layer/0.3.2 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tower/0.4.13 \
    crate://crates.io/tracing-attributes/0.1.27 \
    crate://crates.io/tracing-core/0.1.32 \
    crate://crates.io/tracing-log/0.2.0 \
    crate://crates.io/tracing-subscriber/0.3.18 \
    crate://crates.io/tracing/0.1.40 \
    crate://crates.io/try-lock/0.2.4 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-width/0.1.11 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/unsafe-libyaml/0.2.9 \
    crate://crates.io/utf8parse/0.2.1 \
    crate://crates.io/uuid/1.6.1 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/want/0.3.1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/which/4.4.2 \
    crate://crates.io/wifi-ctrl/0.2.4 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.6 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.0 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.0 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.0 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "mecha_ctl_server"
HOMEPAGE = "https://github.com/mecha-org/mecha-ctl"
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include mecha_ctl_server-${PV}.inc
include mecha_ctl_server.inc
