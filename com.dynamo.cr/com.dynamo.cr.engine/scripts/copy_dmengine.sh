mkdir -p engine/linux
mkdir -p engine/darwin
mkdir -p engine/win32
[ -f ~/builds/linux/dmengine ] && cp -v ~/builds/linux/dmengine engine/linux
[ -f ~/builds/darwin/dmengine ] && cp -v ~/builds/darwin/dmengine engine/darwin
[ -f ~/builds/win32/dmengine.exe ] && cp -v ~/builds/win32/dmengine.exe engine/win32
