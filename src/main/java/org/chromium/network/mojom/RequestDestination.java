// RequestDestination.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/fetch_api.mojom
//

package org.chromium.network.mojom;

public final class RequestDestination {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int EMPTY = 0;
    public static final int AUDIO = 1;
    public static final int AUDIO_WORKLET = 2;
    public static final int DOCUMENT = 3;
    public static final int EMBED = 4;
    public static final int FONT = 5;
    public static final int FRAME = 6;
    public static final int IFRAME = 7;
    public static final int IMAGE = 8;
    public static final int MANIFEST = 9;
    public static final int OBJECT = 10;
    public static final int PAINT_WORKLET = 11;
    public static final int REPORT = 12;
    public static final int SCRIPT = 13;
    public static final int SERVICE_WORKER = 14;
    public static final int SHARED_WORKER = 15;
    public static final int STYLE = 16;
    public static final int TRACK = 17;
    public static final int VIDEO = 18;
    public static final int WORKER = 19;
    public static final int XSLT = 20;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 20;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 20;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private RequestDestination() {}
}