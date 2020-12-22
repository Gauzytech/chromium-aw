
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../media/base/video_codecs.h

package org.chromium.media;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    VideoCodecProfile.VIDEO_CODEC_PROFILE_UNKNOWN, VideoCodecProfile.VIDEO_CODEC_PROFILE_MIN,
    VideoCodecProfile.H264PROFILE_MIN, VideoCodecProfile.H264PROFILE_BASELINE,
    VideoCodecProfile.H264PROFILE_MAIN, VideoCodecProfile.H264PROFILE_EXTENDED,
    VideoCodecProfile.H264PROFILE_HIGH, VideoCodecProfile.H264PROFILE_HIGH10PROFILE,
    VideoCodecProfile.H264PROFILE_HIGH422PROFILE,
    VideoCodecProfile.H264PROFILE_HIGH444PREDICTIVEPROFILE,
    VideoCodecProfile.H264PROFILE_SCALABLEBASELINE, VideoCodecProfile.H264PROFILE_SCALABLEHIGH,
    VideoCodecProfile.H264PROFILE_STEREOHIGH, VideoCodecProfile.H264PROFILE_MULTIVIEWHIGH,
    VideoCodecProfile.H264PROFILE_MAX, VideoCodecProfile.VP8PROFILE_MIN,
    VideoCodecProfile.VP8PROFILE_ANY, VideoCodecProfile.VP8PROFILE_MAX,
    VideoCodecProfile.VP9PROFILE_MIN, VideoCodecProfile.VP9PROFILE_PROFILE0,
    VideoCodecProfile.VP9PROFILE_PROFILE1, VideoCodecProfile.VP9PROFILE_PROFILE2,
    VideoCodecProfile.VP9PROFILE_PROFILE3, VideoCodecProfile.VP9PROFILE_MAX,
    VideoCodecProfile.HEVCPROFILE_MIN, VideoCodecProfile.HEVCPROFILE_MAIN,
    VideoCodecProfile.HEVCPROFILE_MAIN10, VideoCodecProfile.HEVCPROFILE_MAIN_STILL_PICTURE,
    VideoCodecProfile.HEVCPROFILE_MAX, VideoCodecProfile.DOLBYVISION_PROFILE0,
    VideoCodecProfile.DOLBYVISION_PROFILE4, VideoCodecProfile.DOLBYVISION_PROFILE5,
    VideoCodecProfile.DOLBYVISION_PROFILE7, VideoCodecProfile.THEORAPROFILE_MIN,
    VideoCodecProfile.THEORAPROFILE_ANY, VideoCodecProfile.THEORAPROFILE_MAX,
    VideoCodecProfile.AV1PROFILE_MIN, VideoCodecProfile.AV1PROFILE_PROFILE_MAIN,
    VideoCodecProfile.AV1PROFILE_PROFILE_HIGH, VideoCodecProfile.AV1PROFILE_PROFILE_PRO,
    VideoCodecProfile.AV1PROFILE_MAX, VideoCodecProfile.DOLBYVISION_PROFILE8,
    VideoCodecProfile.DOLBYVISION_PROFILE9, VideoCodecProfile.VIDEO_CODEC_PROFILE_MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface VideoCodecProfile {
  /**
   * Keep the values in this enum unique, as they imply format (h.264 vs. VP8, for example), and
   * keep the values for a particular format grouped together for clarity.
   */
  int VIDEO_CODEC_PROFILE_UNKNOWN = -1;
  int VIDEO_CODEC_PROFILE_MIN = VIDEO_CODEC_PROFILE_UNKNOWN;
  int H264PROFILE_MIN = 0;
  int H264PROFILE_BASELINE = H264PROFILE_MIN;
  int H264PROFILE_MAIN = 1;
  int H264PROFILE_EXTENDED = 2;
  int H264PROFILE_HIGH = 3;
  int H264PROFILE_HIGH10PROFILE = 4;
  int H264PROFILE_HIGH422PROFILE = 5;
  int H264PROFILE_HIGH444PREDICTIVEPROFILE = 6;
  int H264PROFILE_SCALABLEBASELINE = 7;
  int H264PROFILE_SCALABLEHIGH = 8;
  int H264PROFILE_STEREOHIGH = 9;
  int H264PROFILE_MULTIVIEWHIGH = 10;
  int H264PROFILE_MAX = H264PROFILE_MULTIVIEWHIGH;
  int VP8PROFILE_MIN = 11;
  int VP8PROFILE_ANY = VP8PROFILE_MIN;
  int VP8PROFILE_MAX = VP8PROFILE_ANY;
  int VP9PROFILE_MIN = 12;
  int VP9PROFILE_PROFILE0 = VP9PROFILE_MIN;
  int VP9PROFILE_PROFILE1 = 13;
  int VP9PROFILE_PROFILE2 = 14;
  int VP9PROFILE_PROFILE3 = 15;
  int VP9PROFILE_MAX = VP9PROFILE_PROFILE3;
  int HEVCPROFILE_MIN = 16;
  int HEVCPROFILE_MAIN = HEVCPROFILE_MIN;
  int HEVCPROFILE_MAIN10 = 17;
  int HEVCPROFILE_MAIN_STILL_PICTURE = 18;
  int HEVCPROFILE_MAX = HEVCPROFILE_MAIN_STILL_PICTURE;
  int DOLBYVISION_PROFILE0 = 19;
  int DOLBYVISION_PROFILE4 = 20;
  int DOLBYVISION_PROFILE5 = 21;
  int DOLBYVISION_PROFILE7 = 22;
  int THEORAPROFILE_MIN = 23;
  int THEORAPROFILE_ANY = THEORAPROFILE_MIN;
  int THEORAPROFILE_MAX = THEORAPROFILE_ANY;
  int AV1PROFILE_MIN = 24;
  int AV1PROFILE_PROFILE_MAIN = AV1PROFILE_MIN;
  int AV1PROFILE_PROFILE_HIGH = 25;
  int AV1PROFILE_PROFILE_PRO = 26;
  int AV1PROFILE_MAX = AV1PROFILE_PROFILE_PRO;
  int DOLBYVISION_PROFILE8 = 27;
  int DOLBYVISION_PROFILE9 = 28;
  int VIDEO_CODEC_PROFILE_MAX = DOLBYVISION_PROFILE9;
}
