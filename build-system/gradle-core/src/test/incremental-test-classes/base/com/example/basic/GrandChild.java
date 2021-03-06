/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.basic;

/**
 * Tests for accessing grand parents or above methods.
 */
public class GrandChild extends ParentInvocation {

    public String someProtectedMethodInv() {
        // invokevirtual
        return doNotOverrideProtectedMethodDispatch(24d, "from grand child", 12)
                // invokespecial
            + super.doNotOverrideProtectedMethodDispatch(12d, "from grand child", 24);
    }

    public String somePublicMethodInv() {
        // invokevirtual
        return doNotOverridePublicMethodDispatch(24d, "from grand child", 12)
                // invokespecial
                + super.doNotOverridePublicMethodDispatch(12d, "from grand child", 24);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
