// ColorSpaceMatrixId.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/color_space.mojom
//

package org.chromium.gfx.mojom;

public final class ColorSpaceMatrixId {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int INVALID = 0;
    public static final int RGB = 1;
    public static final int BT709 = 2;
    public static final int FCC = 3;
    public static final int BT470BG = 4;
    public static final int SMPTE170M = 5;
    public static final int SMPTE240M = 6;
    public static final int YCOCG = 7;
    public static final int BT2020_NCL = 8;
    public static final int BT2020_CL = 9;
    public static final int YDZDX = 10;
    public static final int GBR = 11;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 11;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 11;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private ColorSpaceMatrixId() {}
}