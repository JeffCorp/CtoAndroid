LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE = ctoandroid
LOCAL_SRC_FILES := ctoandroid.c

include $(BUILD_SHARED_LIBRARY)