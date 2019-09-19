package com.sankuai.waimai.router.components;

import android.content.Intent;
import android.support.annotation.NonNull;

import com.sankuai.waimai.router.core.UriRequest;
import com.sankuai.waimai.router.service.DefaultFactory;
import com.sankuai.waimai.router.service.IFactory;

/**
 * 用于配置组件
 *
 * Created by jzj on 2018/4/28.
 */
public class RouterComponents {

    @NonNull
    private static ActivityLauncher sActivityLauncher = DefaultActivityLauncher.INSTANCE;

    @NonNull
    private static IFactory sDefaultFactory = DefaultFactory.INSTANCE;

    public static void setActivityLauncher(ActivityLauncher launcher) {
        sActivityLauncher = launcher == null ? DefaultActivityLauncher.INSTANCE : launcher;
    }

    public static void setDefaultFactory(IFactory factory) {
        sDefaultFactory = factory == null ? DefaultFactory.INSTANCE : factory;
    }

    @NonNull
    public static IFactory getDefaultFactory() {
        return sDefaultFactory;
    }

    /**
     * @see ActivityLauncher#startActivity(UriRequest, Intent)
     */
    public static int startActivity(@NonNull UriRequest request, @NonNull Intent intent) {
        return sActivityLauncher.startActivity(request, intent);
    }
}
