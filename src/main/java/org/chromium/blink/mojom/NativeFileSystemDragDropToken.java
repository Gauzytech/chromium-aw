// NativeFileSystemDragDropToken.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/file_system_access/native_file_system_drag_drop_token.mojom
//

package org.chromium.blink.mojom;


public interface NativeFileSystemDragDropToken extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NativeFileSystemDragDropToken, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NativeFileSystemDragDropToken, NativeFileSystemDragDropToken.Proxy> MANAGER = NativeFileSystemDragDropToken_Internal.MANAGER;


    void getInternalId(

GetInternalIdResponse callback);

    interface GetInternalIdResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.UnguessableToken> { }



    void clone(
org.chromium.mojo.bindings.InterfaceRequest<NativeFileSystemDragDropToken> tokenClone);


}
