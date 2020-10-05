
#include <jni.h>

#include <com_destranix_glslang_Main.h>

#define ENABLE_HLSL

#include <glslang/MachineIndependent/iomapper.h>

#include <Utils.h>

using namespace glslang;

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo__I_3BZIIIIII
  (JNIEnv* env, jclass self, jint id, jbyteArray symbol, jboolean live, jint newBinding, jint newSet, jint newLocation, jint newComponent, jint newIndex, jint stage){
	JNI_METHOD_GUARD_ENTER
	TVarEntryInfo* ret = Pool_malloc($<TVarEntryInfo*>(nullptr));
	ret->id = id;
	ret->symbol = $<TIntermSymbol*>(env _$ symbol);
	ret->live = live;
	ret->newBinding = newBinding;
	ret->newSet = newSet;
	ret->newLocation = newLocation;
	ret->newComponent = newComponent;
	ret->newIndex = newIndex;
	ret->stage = $<EShLanguage>(stage);
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo__
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TVarEntryInfo*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1setId
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TVarEntryInfo*>(env _$ ptr)->id = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1setSymbol
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TVarEntryInfo*>(env _$ ptr)->symbol = $<TIntermSymbol*>(env _$ v);;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1setLive
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TVarEntryInfo*>(env _$ ptr)->live = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1setNewBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TVarEntryInfo*>(env _$ ptr)->newBinding = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1setNewSet
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TVarEntryInfo*>(env _$ ptr)->newSet = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1setNewLocation
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TVarEntryInfo*>(env _$ ptr)->newLocation = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1setNewComponent
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TVarEntryInfo*>(env _$ ptr)->newComponent = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1setNewIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TVarEntryInfo*>(env _$ ptr)->newIndex = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1setStage
  (JNIEnv* env, jclass self, jbyteArray ptr, jint v){
	JNI_METHOD_GUARD_ENTER
	$<TVarEntryInfo*>(env _$ ptr)->stage = $<EShLanguage>(v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1getId
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVarEntryInfo*>(env _$ ptr)->id;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1getSymbol
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TVarEntryInfo*>(env _$ ptr)->symbol;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1getLive
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVarEntryInfo*>(env _$ ptr)->live;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1getNewBinding
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVarEntryInfo*>(env _$ ptr)->newBinding;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1getNewSet
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVarEntryInfo*>(env _$ ptr)->newSet;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1getNewLocation
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVarEntryInfo*>(env _$ ptr)->newLocation;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1getNewComponent
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVarEntryInfo*>(env _$ ptr)->newComponent;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1getNewIndex
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVarEntryInfo*>(env _$ ptr)->newIndex;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1getStage
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TVarEntryInfo*>(env _$ ptr)->stage;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1TOrderById
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TVarEntryInfo::TOrderById*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1TOrderById_1operatorCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray l, jbyteArray r){
	JNI_METHOD_GUARD_ENTER
	return (*$<TVarEntryInfo::TOrderById*>(env _$ ptr))(*$<TVarEntryInfo*>(env _$ l), *$<TVarEntryInfo*>(env _$ r));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1TOrderByPriority
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TVarEntryInfo::TOrderByPriority*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TVarEntryInfo_1TOrderByPriority_1operatorCall
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray l, jbyteArray r){
	JNI_METHOD_GUARD_ENTER
	return (*$<TVarEntryInfo::TOrderByPriority*>(env _$ ptr))(*$<TVarEntryInfo*>(env _$ l), *$<TVarEntryInfo*>(env _$ r));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1validateBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->validateBinding($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1resolveBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->resolveBinding($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1notifyBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->notifyBinding($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1notifyInOut
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->notifyInOut($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1beginNotifications
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->beginNotifications($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1endNotifications
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->endNotifications($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1beginResolve
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->beginResolve($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1endResolve
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->endResolve($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1beginCollect
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->beginCollect($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1endCollect
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->endCollect($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1reserverResourceSlot
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ent, jbyteArray infoSink){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->reserverResourceSlot(*$<TVarEntryInfo*>(env _$ ent), *$<TInfoSink*>(env _$ infoSink));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1reserverStorageSlot
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ent, jbyteArray infoSink){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->reserverStorageSlot(*$<TVarEntryInfo*>(env _$ ent), *$<TInfoSink*>(env _$ infoSink));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1getBaseBinding
  (JNIEnv* env, jclass self, jbyteArray ptr, jint res, jlong set){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->getBaseBinding($<TResourceType>(res), set);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jobjectArray JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1getResourceSetBinding
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return toStringArray(env, $<TDefaultIoResolverBase*>(env _$ ptr)->getResourceSetBinding());
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1getResourceType
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray type){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->getResourceType(*$<TType*>(env _$ type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1doAutoBindingMapping
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->doAutoBindingMapping();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1doAutoLocationMapping
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->doAutoLocationMapping();
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1findSlot
  (JNIEnv* env, jclass self, jbyteArray ptr, jint set, jint slot){
	JNI_METHOD_GUARD_ENTER
	TDefaultIoResolverBase* elem = $<TDefaultIoResolverBase*>(env _$ ptr);
	CIterator<int>* ret = nullptr;
	ret = Pool_mallocRegister(ret, elem);
	ret->init<TDefaultIoResolverBase::TSlotSet>(elem->findSlot(set, slot));
	return env $_ ret;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1checkEmpty
  (JNIEnv* env, jclass self, jbyteArray ptr, jint set, jint slot){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->checkEmpty(set, slot);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1validateInOut
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->validateInOut($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1reserveSlot
  (JNIEnv* env, jclass self, jbyteArray ptr, jint set, jint slot, jint size){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->reserveSlot(set, slot, size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1getFreeSlot
  (JNIEnv* env, jclass self, jbyteArray ptr, jint set, jint slot, jint size){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->getFreeSlot(set, slot, size);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1resolveSet
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->resolveSet($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1resolveUniformLocation
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->resolveUniformLocation($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1resolveInOutLocation
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->resolveInOutLocation($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1resolveInOutComponent
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->resolveInOutComponent($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1resolveInOutIndex
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->resolveInOutIndex($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1addStage
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->addStage($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jlong JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1computeTypeLocationSize
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray type, jint stage){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->computeTypeLocationSize(*$<TType*>(env _$ type), $<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1setSlots
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->slots = *$<TDefaultIoResolverBase::TSlotSetMap*>(env _$ v);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1setHasError
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultIoResolverBase*>(env _$ ptr)->hasError = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1getSlots
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ $<TDefaultIoResolverBase*>(env _$ ptr)->slots;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TDefaultIoResolverBase_1getHasError
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultIoResolverBase*>(env _$ ptr)->hasError;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver
  (JNIEnv* env, jclass self, jbyteArray intermediate){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_mallocIndirect($<TDefaultGlslIoResolver*>(nullptr), $<TIntermediate*>(env _$ intermediate));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1validateBinding
	(JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultGlslIoResolver*>(env _$ ptr)->validateBinding($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1getResourceType
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray type){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultGlslIoResolver*>(env _$ ptr)->getResourceType(*$<TType*>(env _$ type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1resolveInOutLocation
	(JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultGlslIoResolver*>(env _$ ptr)->resolveInOutLocation($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1resolveUniformLocation
	(JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultGlslIoResolver*>(env _$ ptr)->resolveUniformLocation($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1resolveBinding
	(JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray ent){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultGlslIoResolver*>(env _$ ptr)->resolveBinding($<EShLanguage>(stage), *$<TVarEntryInfo*>(env _$ ent));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1beginResolve
	(JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultGlslIoResolver*>(env _$ ptr)->beginResolve($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1endResolve
	(JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultGlslIoResolver*>(env _$ ptr)->endResolve($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1beginCollect
	(JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultGlslIoResolver*>(env _$ ptr)->beginCollect($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1endCollect
	(JNIEnv* env, jclass self, jbyteArray ptr, jint stage){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultGlslIoResolver*>(env _$ ptr)->endCollect($<EShLanguage>(stage));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1reserverStorageSlot
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ent, jbyteArray infoSink){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultGlslIoResolver*>(env _$ ptr)->reserverStorageSlot(*$<TVarEntryInfo*>(env _$ ent), *$<TInfoSink*>(env _$ infoSink));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1reserverResourceSlot
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray ent, jbyteArray infoSink){
	JNI_METHOD_GUARD_ENTER
	$<TDefaultGlslIoResolver*>(env _$ ptr)->reserverResourceSlot(*$<TVarEntryInfo*>(env _$ ent), *$<TInfoSink*>(env _$ infoSink));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jstring JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1getAccessName
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray symbol){
	JNI_METHOD_GUARD_ENTER
	TString s = $<TDefaultGlslIoResolver*>(env _$ ptr)->getAccessName($<TIntermSymbol*>(env _$ symbol));
	return toString(env, &s);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jint JNICALL Java_com_destranix_glslang_Main_TDefaultGlslIoResolver_1buildStorageKey
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jint type){
	JNI_METHOD_GUARD_ENTER
	return $<TDefaultGlslIoResolver*>(env _$ ptr)->buildStorageKey($<EShLanguage>(stage), $<TStorageQualifier>(type));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVarLivePair
  (JNIEnv* env, jclass self, jbyteArray _Right){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TVarLivePair*>(nullptr), *$<const std::pair<const TString, TVarEntryInfo>*>(env _$ _Right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVarLivePairFromPair
  (JNIEnv* env, jclass self, jbyteArray src){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TVarLivePair*>(nullptr), *$<const TVarLivePair*>(env _$ src));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TVarLivePair_1operatorAssign
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray _Right){
	JNI_METHOD_GUARD_ENTER
	return env $_ (*$<TVarLivePair*>(env _$ ptr) = *$<const TVarLivePair*>(env _$ _Right));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TIoMapper
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TIoMapper*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIoMapper_1addStage
  (JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray intermediate, jbyteArray sink, jbyteArray resolver){
	JNI_METHOD_GUARD_ENTER
	return $<TIoMapper*>(env _$ ptr)->addStage($<EShLanguage>(stage), *$<TIntermediate*>(env _$ intermediate), *$<TInfoSink*>(env _$ sink), $<TIoMapResolver*>(env _$ resolver));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TIoMapper_1doMap
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray resolver, jbyteArray sink){
	JNI_METHOD_GUARD_ENTER
	return $<TIoMapper*>(env _$ ptr)->doMap($<TIoMapResolver*>(env _$ resolver), *$<TInfoSink*>(env _$ sink));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper
  (JNIEnv* env, jclass self){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<TGlslIoMapper*>(nullptr));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1addStage
	(JNIEnv* env, jclass self, jbyteArray ptr, jint stage, jbyteArray intermediate, jbyteArray sink, jbyteArray resolver){
	JNI_METHOD_GUARD_ENTER
	return $<TGlslIoMapper*>(env _$ ptr)->addStage($<EShLanguage>(stage), *$<TIntermediate*>(env _$ intermediate), *$<TInfoSink*>(env _$ sink), $<TIoMapResolver*>(env _$ resolver));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1doMap
	(JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray resolver, jbyteArray sink){
	JNI_METHOD_GUARD_ENTER
	return $<TGlslIoMapper*>(env _$ ptr)->doMap($<TIoMapResolver*>(env _$ resolver), *$<TInfoSink*>(env _$ sink));
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1setInVarMaps
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	copy($<std::vector<TVarLiveMap*>*>(env _$ v)->begin(), $<std::vector<TVarLiveMap*>*>(env _$ v)->end(), $<TGlslIoMapper*>(env _$ ptr)->inVarMaps);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1setOutVarMaps
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	copy($<std::vector<TVarLiveMap*>*>(env _$ v)->begin(), $<std::vector<TVarLiveMap*>*>(env _$ v)->end(), $<TGlslIoMapper*>(env _$ ptr)->outVarMaps);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1setUniformVarMap
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	copy($<std::vector<TVarLiveMap*>*>(env _$ v)->begin(), $<std::vector<TVarLiveMap*>*>(env _$ v)->end(), $<TGlslIoMapper*>(env _$ ptr)->uniformVarMap);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1setIntermediates
  (JNIEnv* env, jclass self, jbyteArray ptr, jbyteArray v){
	JNI_METHOD_GUARD_ENTER
	copy($<std::vector<TIntermediate*>*>(env _$ v)->begin(), $<std::vector<TIntermediate*>*>(env _$ v)->end(), $<TGlslIoMapper*>(env _$ ptr)->intermediates);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT void JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1setHadError
  (JNIEnv* env, jclass self, jbyteArray ptr, jboolean v){
	JNI_METHOD_GUARD_ENTER
	$<TGlslIoMapper*>(env _$ ptr)->hadError = v;
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1getInVarMaps
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::vector<TVarLiveMap*>*>(nullptr), $<TGlslIoMapper*>(env _$ ptr)->inVarMaps, ($<TGlslIoMapper*>(env _$ ptr)->inVarMaps)+EShLangCount);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1getOutVarMaps
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::vector<TVarLiveMap*>*>(nullptr), $<TGlslIoMapper*>(env _$ ptr)->outVarMaps, ($<TGlslIoMapper*>(env _$ ptr)->outVarMaps)+EShLangCount);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1getUniformVarMap
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::vector<TVarLiveMap*>*>(nullptr), $<TGlslIoMapper*>(env _$ ptr)->uniformVarMap, ($<TGlslIoMapper*>(env _$ ptr)->uniformVarMap)+EShLangCount);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jbyteArray JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1getIntermediates
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return env $_ Pool_malloc($<std::vector<TIntermediate*>*>(nullptr), $<TGlslIoMapper*>(env _$ ptr)->intermediates, ($<TGlslIoMapper*>(env _$ ptr)->intermediates)+EShLangCount);
	JNI_METHOD_GUARD_LEAVE
}

JNIEXPORT jboolean JNICALL Java_com_destranix_glslang_Main_TGlslIoMapper_1getHadError
  (JNIEnv* env, jclass self, jbyteArray ptr){
	JNI_METHOD_GUARD_ENTER
	return $<TGlslIoMapper*>(env _$ ptr)->hadError;
	JNI_METHOD_GUARD_LEAVE
}
