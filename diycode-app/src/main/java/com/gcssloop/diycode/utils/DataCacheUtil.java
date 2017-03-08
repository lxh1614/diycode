/*
 * Copyright 2017 GcsSloop
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Last modified 2017-03-08 22:31:55
 *
 * GitHub:  https://github.com/GcsSloop
 * Website: http://www.gcssloop.com
 * Weibo:   http://weibo.com/GcsSloop
 */

package com.gcssloop.diycode.utils;

import android.content.Context;

import com.gcssloop.diycode_sdk.utils.ACache;

import java.io.File;
import java.io.Serializable;

/**
 * 数据缓存工具
 */
public class DataCacheUtil {

    ACache cache;

    public DataCacheUtil(Context context) {
        cache = ACache.get(new File(FileUtil.getExternalCacheDir(context, "diy-data")));
    }

    public <T extends Serializable> void saveData(String key, T data) {
        cache.put(key, data);
    }

    public <T extends Serializable> T getData(String key) {
        return (T) cache.getAsObject(key);
    }
}