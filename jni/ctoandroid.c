#include <jni.h>
#include <string>

extern "C" JNIEX
PORT jstring JNICALL
Java_com_jeffcorp_ctoandroid_MainActivity_helloWorld(
        JNIEnv* env,
        jobject obj, jstring str) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}