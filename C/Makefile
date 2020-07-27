.PHONY: all

all: Release

LIBS_INCLUDE = -lGenericCodeGen -lMachineIndependent -lOSDependent
LIBS = GenericCodeGen.lib MachineIndependent.lib OSDependent.lib

LINUX_CC_FLAGS = -std=c++11 -pedantic -Wall -Werror -D_XOPEN_SOURCE=700 -fPIC
LINUX_INCLUDE_FLAGS = -I./include -I"${JAVA_HOME}/include" -I"${JAVA_HOME}/include/linux"

WINDOWS_INCLUDE_FLAGS = /I.\include /I"${JAVA_HOME}\include" /I"${JAVA_HOME}\include\win32"

ifeq ($(OS),Windows_NT)
    ifeq ($(PROCESSOR_ARCHITEW6432),AMD64)
        WINDOWS_MACHINE_FLAG = x64
    else
        ifeq ($(PROCESSOR_ARCHITECTURE),AMD64)
            WINDOWS_MACHINE_FLAG = x64
        endif
        ifeq ($(PROCESSOR_ARCHITECTURE),x86)
            WINDOWS_MACHINE_FLAG = x86
        endif
    endif
    COMMAND = vcvarsall.bat $(WINDOWS_MACHINE_FLAG) & cl $(WINDOWS_INCLUDE_FLAGS) /LD /MD Main.cpp $(LIBS) /link /LIBPATH:.\lib /NOLOGO /OUT:Main.dll
	COMMAND_DEBUG = vcvarsall.bat $(WINDOWS_MACHINE_FLAG) & cl $(WINDOWS_INCLUDE_FLAGS) /Z7 /LD /MD Main.cpp $(LIBS) /link /LIBPATH:.\lib /NOLOGO /OUT:Main.dll
else
    UNAME_P := $(shell uname -p)
    ifeq ($(UNAME_P),x86_64)
        LINUX_MACHINE_FLAG = -m64
    endif
    ifneq ($(filter %86,$(UNAME_P)),)
        LINUX_MACHINE_FLAG = -m32
    endif
    ifneq ($(filter arm%,$(UNAME_P)),)
        LINUX_MACHINE_FLAG = -marm
    endif
    UNAME_S := $(shell uname -s)
    ifeq ($(UNAME_S),Linux)
        COMMAND = g++ $(LINUX_CC_FLAGS) $(LINUX_MACHINE_FLAG) $(LINUX_INCLUDE_FLAGS) -shared -L./lib -lc -o libMain.so Main.cpp $(LIBS_INCLUDE)
        COMMAND_DEBUG = g++ $(LINUX_CC_FLAGS) $(LINUX_MACHINE_FLAG) $(LINUX_INCLUDE_FLAGS) -shared -L./lib -lc -o libMain.so Main.cpp $(LIBS_INCLUDE)
    endif
    ifeq ($(UNAME_S),Darwin)
        COMMAND = echo Not yet supported!
        COMMAND_DEBUG = echo Not yet supported!
    endif
endif

Release: Main.cpp
	$(COMMAND)
	
Debug: Main.cpp
	$(COMMAND_DEBUG)