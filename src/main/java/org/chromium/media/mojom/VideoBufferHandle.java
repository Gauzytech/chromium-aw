// VideoBufferHandle.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/capture/mojom/video_capture_buffer.mojom
//

package org.chromium.media.mojom;


public final class VideoBufferHandle extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int SharedBufferHandle = 0;
        public static final int ReadOnlyShmemRegion = 1;
        public static final int SharedMemoryViaRawFileDescriptor = 2;
        public static final int MailboxHandles = 3;
        public static final int GpuMemoryBufferHandle = 4;
    };
    private org.chromium.mojo.system.SharedBufferHandle mSharedBufferHandle;
    private org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion mReadOnlyShmemRegion;
    private SharedMemoryViaRawFileDescriptor mSharedMemoryViaRawFileDescriptor;
    private MailboxBufferHandleSet mMailboxHandles;
    private org.chromium.gfx.mojom.GpuMemoryBufferHandle mGpuMemoryBufferHandle;

    public void setSharedBufferHandle(org.chromium.mojo.system.SharedBufferHandle sharedBufferHandle) {
        this.mTag = Tag.SharedBufferHandle;
        this.mSharedBufferHandle = sharedBufferHandle;
    }

    public org.chromium.mojo.system.SharedBufferHandle getSharedBufferHandle() {
        assert this.mTag == Tag.SharedBufferHandle;
        return this.mSharedBufferHandle;
    }

    public void setReadOnlyShmemRegion(org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion readOnlyShmemRegion) {
        this.mTag = Tag.ReadOnlyShmemRegion;
        this.mReadOnlyShmemRegion = readOnlyShmemRegion;
    }

    public org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion getReadOnlyShmemRegion() {
        assert this.mTag == Tag.ReadOnlyShmemRegion;
        return this.mReadOnlyShmemRegion;
    }

    public void setSharedMemoryViaRawFileDescriptor(SharedMemoryViaRawFileDescriptor sharedMemoryViaRawFileDescriptor) {
        this.mTag = Tag.SharedMemoryViaRawFileDescriptor;
        this.mSharedMemoryViaRawFileDescriptor = sharedMemoryViaRawFileDescriptor;
    }

    public SharedMemoryViaRawFileDescriptor getSharedMemoryViaRawFileDescriptor() {
        assert this.mTag == Tag.SharedMemoryViaRawFileDescriptor;
        return this.mSharedMemoryViaRawFileDescriptor;
    }

    public void setMailboxHandles(MailboxBufferHandleSet mailboxHandles) {
        this.mTag = Tag.MailboxHandles;
        this.mMailboxHandles = mailboxHandles;
    }

    public MailboxBufferHandleSet getMailboxHandles() {
        assert this.mTag == Tag.MailboxHandles;
        return this.mMailboxHandles;
    }

    public void setGpuMemoryBufferHandle(org.chromium.gfx.mojom.GpuMemoryBufferHandle gpuMemoryBufferHandle) {
        this.mTag = Tag.GpuMemoryBufferHandle;
        this.mGpuMemoryBufferHandle = gpuMemoryBufferHandle;
    }

    public org.chromium.gfx.mojom.GpuMemoryBufferHandle getGpuMemoryBufferHandle() {
        assert this.mTag == Tag.GpuMemoryBufferHandle;
        return this.mGpuMemoryBufferHandle;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.SharedBufferHandle: {
                
                encoder0.encode(this.mSharedBufferHandle, offset + 8, false);
                break;
            }
            case Tag.ReadOnlyShmemRegion: {
                
                encoder0.encode(this.mReadOnlyShmemRegion, offset + 8, false);
                break;
            }
            case Tag.SharedMemoryViaRawFileDescriptor: {
                
                encoder0.encode(this.mSharedMemoryViaRawFileDescriptor, offset + 8, false);
                break;
            }
            case Tag.MailboxHandles: {
                
                encoder0.encode(this.mMailboxHandles, offset + 8, false);
                break;
            }
            case Tag.GpuMemoryBufferHandle: {
                
                encoder0.encode(this.mGpuMemoryBufferHandle, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static VideoBufferHandle deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final VideoBufferHandle decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        VideoBufferHandle result = new VideoBufferHandle();
        switch (dataHeader.elementsOrVersion) {
            case Tag.SharedBufferHandle: {
                
                result.mSharedBufferHandle = decoder0.readSharedBufferHandle(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mTag = Tag.SharedBufferHandle;
                break;
            }
            case Tag.ReadOnlyShmemRegion: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mReadOnlyShmemRegion = org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion.decode(decoder1);
                result.mTag = Tag.ReadOnlyShmemRegion;
                break;
            }
            case Tag.SharedMemoryViaRawFileDescriptor: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mSharedMemoryViaRawFileDescriptor = SharedMemoryViaRawFileDescriptor.decode(decoder1);
                result.mTag = Tag.SharedMemoryViaRawFileDescriptor;
                break;
            }
            case Tag.MailboxHandles: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mMailboxHandles = MailboxBufferHandleSet.decode(decoder1);
                result.mTag = Tag.MailboxHandles;
                break;
            }
            case Tag.GpuMemoryBufferHandle: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mGpuMemoryBufferHandle = org.chromium.gfx.mojom.GpuMemoryBufferHandle.decode(decoder1);
                result.mTag = Tag.GpuMemoryBufferHandle;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}