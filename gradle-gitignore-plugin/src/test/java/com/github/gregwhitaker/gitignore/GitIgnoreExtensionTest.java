/**
 * Copyright 2017-Present Greg Whitaker
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
 */
package com.github.gregwhitaker.gitignore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GitIgnoreExtensionTest {

    @Test
    public void autoDetectShouldDefaultToTrue() {
        // Given
        final GitIgnoreExtension extension = new GitIgnoreExtension();

        // Then
        assertTrue(extension.isAutoDetect());
    }

    @Test
    public void urlShouldDefaultToNull() {
        // Given
        final GitIgnoreExtension extension = new GitIgnoreExtension();

        // Then
        assertNull(extension.getUrl());
    }

    @Test
    public void facetsShouldDefaultToEmptyList() {
        // Given
        final GitIgnoreExtension extension = new GitIgnoreExtension();

        // Then
        assertTrue(extension.getFacets().isEmpty());
    }
}