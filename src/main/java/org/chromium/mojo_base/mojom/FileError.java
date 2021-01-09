// FileError.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/file_error.mojom
//

package org.chromium.mojo_base.mojom;

public final class FileError {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int OK = 0;
    public static final int FAILED = -1;
    public static final int IN_USE = -2;
    public static final int EXISTS = -3;
    public static final int NOT_FOUND = -4;
    public static final int ACCESS_DENIED = -5;
    public static final int TOO_MANY_OPENED = -6;
    public static final int NO_MEMORY = -7;
    public static final int NO_SPACE = -8;
    public static final int NOT_A_DIRECTORY = -9;
    public static final int INVALID_OPERATION = -10;
    public static final int SECURITY = -11;
    public static final int ABORT = -12;
    public static final int NOT_A_FILE = -13;
    public static final int NOT_EMPTY = -14;
    public static final int INVALID_URL = -15;
    public static final int IO = -16;
    public static final int MIN_VALUE = -16;
    public static final int MAX_VALUE = 0;

    public static boolean isKnownValue(int value) {
        return value >= -16 && value <= 0;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private FileError() {}
}