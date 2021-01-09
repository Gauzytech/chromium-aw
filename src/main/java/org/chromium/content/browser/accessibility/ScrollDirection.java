
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/browser/accessibility/browser_accessibility_manager_android.h

package org.chromium.content.browser.accessibility;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ScrollDirection.FORWARD, ScrollDirection.BACKWARD, ScrollDirection.UP, ScrollDirection.DOWN,
    ScrollDirection.LEFT, ScrollDirection.RIGHT
})
@Retention(RetentionPolicy.SOURCE)
public @interface ScrollDirection {
  int FORWARD = 0;
  int BACKWARD = 1;
  int UP = 2;
  int DOWN = 3;
  int LEFT = 4;
  int RIGHT = 5;
}
