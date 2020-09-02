.PHONY: all

all: Release

FILES = Utils.cpp Main.cpp PureC.cpp Basic.cpp Hlsl.cpp SPV.cpp Common.cpp ConstantUnion.cpp InfoSink.cpp PoolAlloc.cpp Types.cpp arrays.cpp intermediate.cpp PpContext.cpp Initialize.cpp LiveTraverser.cpp ParseHelper.cpp Scan.cpp SymbolTable.cpp iomapper.cpp localintermediate.cpp parseVersions.cpp reflection.cpp Structures.cpp

#ASSEMBLY_FILES_COMMAND = /Fo RegisterSaveRestore.obj /c RegisterSaveRestore.asm
#ASSEMBLY_FILES_OBJ = RegisterSaveRestore.obj
#ASSEMBLY_FILES_LIBS = RegisterSaveRestore.lib

LIBS_INCLUDE = -lGenericCodeGen -lMachineIndependent -lOSDependent -lSPVRemapper -lSPIRV -lSPIRV-Tools-opt -lSPIRV-Tools -lSPIRV-Tools-shared -lSPIRV-Tools-reduce 
LIBS = GenericCodeGen.lib MachineIndependent.lib OSDependent.lib SPVRemapper.lib Spirv.lib SPIRV-Tools-opt.lib SPIRV-Tools.lib SPIRV-Tools-shared.lib SPIRV-Tools-reduce.lib

#LIBS_INCLUDE_DEBUG = -lGenericCodeGend -lMachineIndependentd -lOSDependentd -lSPVRemapperd -lSPIRVd -lSPIRV-Tools-optd -lSPIRV-Toolsd -lSPIRV-Tools-sharedd -lSPIRV-Tools-reduced
LIBS_DEBUG = GenericCodeGend.lib MachineIndependentd.lib OSDependentd.lib SPVRemapperd.lib Spirvd.lib SPIRV-Tools-optd.lib SPIRV-Toolsd.lib SPIRV-Tools-sharedd.lib SPIRV-Tools-reduced.lib

LINUX_CC_FLAGS = -std=c++11 -pedantic -Wall -Werror -Wno-trigraphs -D_XOPEN_SOURCE=700 -fPIC -pthread -fno-rtti -Wl,-z,defs
LINUX_INCLUDE_FLAGS = -I. -I./include -I"${JAVA_HOME}/include" -I"${JAVA_HOME}/include/linux"
LINUX_PREPROCESSOR_FLAGS = -DLINUX

WINDOWS_INCLUDE_FLAGS = /I. /I.\include /I"${JAVA_HOME}\include" /I"${JAVA_HOME}\include\win32"
WINDOWS_PREPROCESSOR_FLAGS = /DWINDOWS

ifeq ($(OS),Windows_NT)
    ifeq ($(PROCESSOR_ARCHITEW6432),AMD64)
        WINDOWS_MACHINE_FLAG = x64
        #WINDOWS_ASSEMBLER_COMMAND = & ml64 /nologo /WX $(ASSEMBLY_FILES_COMMAND) & lib /Wx /DEF /NOLOGO $(ASSEMBLY_FILES_OBJ)
        #WINDOWS_ASSEMBLER_COMMAND_DEBUG = & ml64 /nologo /WX /Zd /Zi $(ASSEMBLY_FILES_COMMAND) & lib /Wx /DEF /NOLOGO $(ASSEMBLY_FILES_OBJ)
        #LIBS += $(ASSEMBLY_FILES_LIBS)
    else
        ifeq ($(PROCESSOR_ARCHITECTURE),AMD64)
            WINDOWS_MACHINE_FLAG = x64
            #WINDOWS_ASSEMBLER_COMMAND = & ml64 /nologo /WX $(ASSEMBLY_FILES_COMMAND) & lib /Wx /DEF /NOLOGO $(ASSEMBLY_FILES_OBJ)
        	#WINDOWS_ASSEMBLER_COMMAND_DEBUG = & ml64 /nologo /WX /Zd /Zi $(ASSEMBLY_FILES_COMMAND) & lib /Wx /DEF /NOLOGO $(ASSEMBLY_FILES_OBJ)
        	#LIBS += $(ASSEMBLY_FILES_LIBS)
        endif
        ifeq ($(PROCESSOR_ARCHITECTURE),x86)
            WINDOWS_MACHINE_FLAG = x86
        endif
    endif
    COMMAND = vcvarsall.bat $(WINDOWS_MACHINE_FLAG) $(WINDOWS_ASSEMBLER_COMMAND) & cl $(WINDOWS_INCLUDE_FLAGS) /LD /MD /EHa $(WINDOWS_PREPROCESSOR_FLAGS) $(FILES) $(LIBS) /link /LIBPATH:.\lib $(ASSEMBLY_FILES_OBJ) /NOLOGO /OUT:Main.dll
	COMMAND_DEBUG = vcvarsall.bat $(WINDOWS_MACHINE_FLAG) $(WINDOWS_ASSEMBLER_COMMAND_DEBUG) & cl $(WINDOWS_INCLUDE_FLAGS) /Z7 /LDd /MDd /EHa $(WINDOWS_PREPROCESSOR_FLAGS) /DDEBUG /D_ITERATOR_DEBUG_LEVEL=2 $(FILES) $(LIBS_DEBUG) /link /LIBPATH:.\lib /PDB:Main.pdb $(ASSEMBLY_FILES_OBJ) /NOLOGO /OUT:Main.dll
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
        COMMAND = g++ $(LINUX_CC_FLAGS) $(LINUX_MACHINE_FLAG) $(LINUX_INCLUDE_FLAGS) -shared -L./lib -lc $(LINUX_PREPROCESSOR_FLAGS) -o libMain.so $(FILES) $(LIBS_INCLUDE)
        COMMAND_DEBUG = g++ $(LINUX_CC_FLAGS) $(LINUX_MACHINE_FLAG) $(LINUX_INCLUDE_FLAGS) -shared -L./lib -lc $(LINUX_PREPROCESSOR_FLAGS) -DDEBUG -o libMain.so $(FILES) $(LIBS_INCLUDE)
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