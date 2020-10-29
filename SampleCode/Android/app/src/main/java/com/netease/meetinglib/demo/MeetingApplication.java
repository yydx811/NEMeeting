/*
 * Copyright (c) 2014-2020 NetEase, Inc.
 * All right reserved.
 */

package com.netease.meetinglib.demo;

import android.app.Application;

import com.netease.meetinglib.demo.log.LogUtil;

public class MeetingApplication extends Application {
    private static MeetingApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        LogUtil.init(this);
        SdkAuthenticator.getInstance().initialize(this);
        SdkInitializer.getInstance().startInitialize(this);
    }

    public static MeetingApplication getInstance() {
        return instance;
    }
}
